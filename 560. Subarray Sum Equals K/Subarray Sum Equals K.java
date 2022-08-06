//1st brute force
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
           for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        } 
        return count;
}
}
//tc=O(N^2) // ts=O(1)

//2nd brute force
//using prefix sum

/*
Use an array to store the sum accumulated from the beginning to a certain position.
Example:
nums = [1,   2,   3  ]
sum  = [1, 1+2, 1+2+3]
How to create array "sum" ?
sum[i] = sum[i - 1] + nums[i]
Q : If i == 0, the index is out of range. How to solve this problem ?
A : Set the first element of the array "sum" to 0, and initialize the array "sum" from index 1 rather than 0.
nums = [1,   2,   3  ]
sum  = [0,   1,   1+2, 1+2+3] // Also, the length of "sum" is one more than "nums"  
sum[i] = sum[i - 1] + nums[i - 1]
// Java Version
int[] sum = new int[nums.length + 1];
sum[0] = 0;
for (int i = 1; i < (nums.length + 1); i++)
  sum[i] = sum[i - 1] + nums[i - 1];
Using array "sum" to calculate the sum of a subarray
sumOfSubarray = sum[end] - sum[start];
For example :
 Caculate the sum of "nums" means using the last element of "sum" minus the first element of "sum" which is 0.

nums[0] + nums[1] + nums[2] = sum[3] - sum[0] = 6 - 0

*/

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
      
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
      
        for (int start = 0; start < sum.length; start++) {
            for (int end = start + 1; end < sum.length; end++) {
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
      
        return count;
    }
}

// Time complexity : O(n2).
// Space complexity : O(n).


// using HashMap method 01
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int i=0,count=0,sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for( i=0;i<n;i++){
           sum+=nums[i];
            if(sum==k){
                count++;
            }
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                hm.put(sum,(hm.get(sum)+1));
            }else{
                hm.put(sum,1);
            }
        }
     return count;   
}
}



// method 02
/*
add initially (0,1) in hashmap to avoid to check sum==k in first condition.

 map.put(sum, map.getOrDefault(sum, 0) + 1);
  
map.getOrDefault(sum, 0) + 1
if sum  not is present in map thn it add 0 by default else add 1
to reduce step we use
*/
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
      
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
// Complexity Anaysis
// Time complexity : O(n).
// Space complexity : O(n).


// above same
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int i=0,count=0,sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for( i=0;i<n;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
           hm.put(sum,hm.getOrDefault(sum,0)+1);
            
            }
        
     return count;   
}
}
