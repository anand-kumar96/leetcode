//method 01
class Solution {
    public int[] searchRange(int[] nums, int target) {
       int ans[]={-1,-1};
        int n=nums.length;
        int first=firstoccur(nums,target);
        int second=secondoccur(nums,target);
        ans[0]=first;
        ans[1]=second;
        return ans;
        }
     public int firstoccur(int[] nums, int target) {
         int n=nums.length;
         int low=0,high=n-1,res=-1;
         while(low<=high){
             int mid=low+(high-low)/2;
             if(nums[mid]==target){
                 res=mid;
                 high=mid-1;
             } 
             else if(nums[mid]>target){
                 high=mid-1;
             }else{
                 low=mid+1;
             }
         }
         return res;
     }
    
    public int secondoccur(int[] nums, int target) {
        int n=nums.length;
         int low=0,high=n-1,res=-1;
         while(low<=high){
             int mid=low+(high-low)/2;
             if(nums[mid]==target){
                 res=mid;
                 low=mid+1;
             } 
             else if(nums[mid]>target){
                 high=mid-1;
             }else{
                 low=mid+1;
             }
         }
         return res;
     }
        
    
}

// method 02
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[2];
        result[0] = findTarget(nums, target, true);
        result[1] = findTarget(nums, target, false);
        
        return result;
        
    }
    
    private int findTarget(int[] nums, int target, boolean findLeftIndex){
        
        int result = -1;
        
        int left = 0;
        int right = nums.length-1;
        
        while(left <= right){
            
             int mid = left+(right-left)/2;
            
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                result = mid;
                if(findLeftIndex){
                    //goto left sub-array
                    right = mid-1;
                }
                else{
                    //go to right sub-array
                    left = mid+1;
                }
            }
   
           
            
            
        }
        
        
         return result;
        
        
        
        
        
        
        
        
        
        
    }
}
