class Solution {
    public int finalValueAfterOperations(String[] operations) {
      // method 01
        int n=operations.length;
         int ans=0;
        for(int i=0;i<n;i++){
            String p=operations[i];
            if(p.charAt(0)=='-'|| p.charAt(1)=='-'){
                ans=ans-1;
            }else{
                ans=ans+1;
            }
        }
        return ans;
        
      // method 02
        int n=operations.length;
         int ans=0;
        for(int i=0;i<n;i++){
            if(operations[i].contains("+")) ans++;
            else ans--;
        }
        return ans;
    }
}
