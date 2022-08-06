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
// binarysearch
class Solution {
    public int[] twoSum(int[] numbers, int target) {
//         // using binary search
        int arr[]={-1,-1};
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int l=i+1,r=n-1;
            //why we take i+1
        int k=target-numbers[i];
            while(l<=r){
                int mid=l+(r-l)/2;
                if(numbers[mid]==k){
                    arr[0]=i+1;
                    arr[1]=mid+1;
                    return arr;
                } if(numbers[mid]>k){
                  r=mid-1;
        }else{
            l=mid+1;
        }
            }
           
    }
     return arr;
    }
}
