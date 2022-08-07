// matrix approach
/*
approach-->
          height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
            left = [0  1  1  2  2  2  2  3  3  3  3  3]
           right = [3  3  3  3  3  3  3  3  2  2  2  1]
  min[left,right]= [0  1  1  2  2  2  2  3  2  2  2  1]
 diff[min-height]= [0  0  1  0  1  2  1  0  0  1  0  0]
tapeedwater+=diff= [0 +0 +1 +0 +1 +2 +1 +0 +0 +1 +0 +0]=6
*/
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int  tappedwater=0;
        // create left and right array of size n
        int left[]=new int[n];
        int right[]=new int[n];
       // take two max variable to comapre and store max value in left and right array
        // take initial value  as left[0], and right[0] for second maxi   
        int max1=0,max2=0;
        left[0]=height[0]; // beoz left one bar itself can't store any water
        max1=height[0];
        max2=height[n-1];  
        right[n-1]=height[n-1]; // beoz right one bar itself can't store any water so 
        for(int i=1;i<n;i++){
            if(height[i]>max1){
                max1=height[i];
                left[i]=max1;
            }else{
                left[i]=max1;// doing prefix sum  from left side
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(height[i]>max2){
                max2=height[i];
                right[i]=max2;
            }else{
                right[i]=max2;// doing prefix sum  from right side
            }
        }
        for(int i=0;i<n;i++){
             tappedwater+=(Math.min(left[i],right[i])-height[i]);
    }
        return tappedwater;
    }
}


// Best Approach : 2 Pointers (This approach)
/*
appraoch:
    height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
              L                                H
	    -->                                <--
*/
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int low=0,high=n-1;
        int leftmax=0,rightmax=0;
        int tappedwater=0;
        while(low<=high){
            if(height[low]>leftmax){
                leftmax=height[low];
            }
            if(height[high]>rightmax){
                rightmax=height[high];
            }
          if(leftmax<=rightmax){
              tappedwater+=leftmax-height[low];
              low++;
          } else{
               tappedwater+=rightmax-height[high];
               high--;
          }
               
        }
        return tappedwater;
        }
        }
    

// Worst Approach : O(n2) -> Nested Loop (finding leftmax and right max for every index)
// Time Complexity : O(n) 
// Space Complexity : O(1)

