//using twopointer
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // a+b+c=0 have to find
        Arrays.sort(nums);
        List<List<Integer>>res=new LinkedList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){ // i as a
                int low=i+1,high=n-1,sum=-nums[i];  // ignoring duplicate of a
            while(low<high){
            if(nums[low]+nums[high]==sum){  // b+c==-a
            res.add(Arrays.asList(nums[i],nums[low],nums[high]));// adding a,b,c in sorted form
          while(low<high && nums[low]==nums[low+1]) low++; // ignoring duplicate of b
         while(low<high && nums[high]==nums[high-1]) high--;// ignoring duplicate of c
                    low++;
                    high--;
                    }else if(nums[low]+nums[high]<sum) low++; // if b+c<-a
                    else 
                        high--; 
                }
            }
        }
        return res;
    }
}
//tc=O(n^2)
//ts=O(1) auxillary space
//the return list is not to be counted
// or 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // a+b+c=0 have to find
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){ // i as a
                int low=i+1,high=n-1,sum=-nums[i];  // ignoring duplicate of a
            while(low<high){
            if(nums[low]+nums[high]==sum){  // b+c==-a
            ArrayList<Integer> l = new ArrayList<>();  // adding a,b,c in sorted form
                l.add(nums[i]);
                l.add(nums[low]);
                l.add(nums[high]);
                result.add(l);
          while(low<high && nums[low]==nums[low+1]) low++; // ignoring duplicate of b
         while(low<high && nums[high]==nums[high-1]) high--;// ignoring duplicate of c
                    low++;
                    high--;
                    }else if(nums[low]+nums[high]<sum) low++; // if b+c<-a
                    else 
                        high--; 
                }
            }
        }
        return result;
    }
}
// brute force
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
      if (nums.length < 3){
          return result;
      }
      Arrays.sort(nums);
      HashSet<String> hs = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
              for (int k = j + 1; k < nums.length; k++) {
                  if (nums[i] + nums[j] + nums[k] == 0 ){     
                      String seq = "" + nums[i] + nums[j] + nums[k];
                      if (hs.contains(seq)==false) {
                     ArrayList<Integer> l = new ArrayList<>();  // adding a,b,c in sorted form
                      l.add(nums[i]);
                      l.add(nums[j]);
                      l.add(nums[k]);
                      result.add(l);
                      hs.add(seq);
                      }    
                  }
              }
          }
      }
      return result;
  }
}
