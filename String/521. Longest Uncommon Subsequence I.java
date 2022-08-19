class Solution {
    public int findLUSlength(String a, String b) {
        // method 01
        // if both string are equal return -1
        // if both are not equal then return maximum length of string
        int ans=-1;
         if(a.equals(b)){
             return ans;
         }else{
             ans=Math.max(a.length(),b.length());
         }
        return ans;
      
      // method 02
      return a.equals(b) ? -1 : Math.max(a.length(), b.length());
      // if true return -1 else max length
    }
}
