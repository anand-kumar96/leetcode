method 01--> Brute Force
apporach--> Loop through each element x of array and find if there is another value that equals to target - x.
code-->
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;  // In case there is no solution, we'll just return null
    }
}
/*
Complexity Analysis
Time complexity: O(n^2). For each element, we try to find its complement by looping through the rest of the array which
takes O(n) time. Therefore, the time complexity is O(n^2).
Space complexity: O(1). The space required does not depend on the size of the input array, so only constant space is used.
   */
/*
method 02--> Two-pass Hash Table
apporach-->A simple implementation uses two iterations. In the first iteration, we add each element's value as a key 
and its index as a value to the hash table. Then, in the second iteration, we check if each element's
complement (target - nums[i]) exists in the hash table. If it does exist, we return current element's index and its complement's index.
Beware that the complement must not be nums[i] itself!
code-->
    */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return null;   // In case there is no solution, we'll just return null
    }
}
/*
Complexity Analysis
Time complexity:O(n). We traverse the list containing nn elements exactly twice. 
Since the hash table reduces the lookup time to O(1), the overall time complexity is O(n).
Space complexity: O(n). The extra space required depends on the number of items stored in the hash table,
which stores exactly nn elements.
    */
/*
method 03: One-pass Hash Table
apporach--> It turns out we can do it in one-pass. While we are iterating and inserting elements into the hash table,
we also look back to check if current element's complement already exists in the hash table.
If it exists, we have found a solution and return the indices immediately.
code-->
    */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;       // In case there is no solution, we'll just return null
    }
}
/*
Time complexity:O(n). We traverse the list containing nn elements only once. Each lookup in the table costs only O(1) time.
Space complexity:O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements.
        */

// 
class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n=nums.length;
        int res[]=new int[2];
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(nums[i]+nums[j]==target){
                  res[0]=i;
                  res[1]=j;
              }
          }
        }
        
        return res;
    }
}
