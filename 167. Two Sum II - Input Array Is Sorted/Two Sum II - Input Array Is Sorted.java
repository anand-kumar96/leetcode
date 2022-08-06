//using two pointer
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
         int arr[]={-1,-1};
        int l=0,r=n-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
                arr[0]=l+1;
                arr[1]=r+1;
                return arr;
            }else if(nums[l]+nums[r]>target){
                r--;
            }else
                l++;
        }
        return arr;
    }
}
//using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
         int arr[]={-1,-1};
        int l=0,r=n-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
               arr[0]=l+1;
                arr[1]=r+1;
                return arr;
            }else if(nums[l]+nums[r]>target){
                r--;
            }else
                l++;
        }
        return arr;
    }
}
