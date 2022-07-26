//https://leetcode.com/problems/largest-number-at-least-twice-of-others/
class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        nums[index]=-1;
        int i=0;
        while(i<n){
            if(max<(2*nums[i])){
              return -1;
            }
           i++;
        }
        
    return index;
    }
}
// mehod 02
class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        int i=0;
        while(i<n){
            if(max<(2*nums[i]) && i!=index){
              return -1;
            }
           i++;
        }
        
    return index;
    }
}
