class Solution {
    public String defangIPaddr(String address) {
    // method 01 
        String str[]=address.split("\\.");
        int n=str.length;
        System.out.println(n);
        if(n==0){
            return null;
        }
        String ans="";
        for(int i=0;i<n-1;i++){
            ans=ans+str[i]+"[.]";
        }
        ans=ans+str[n-1];
        return ans;
        
        
//         String str[]=address.split("\\.");
//         int n=str.length;
//         if(n==0){
//             return null;
//         }
//         String ans="";
//         for(int i=0;i<n;i++){
//             ans=ans+str[i]+"[.]";
//         }
//         ans=ans.substring(0,ans.length()-3);
//         return ans;


// method 02
        String str[]=address.split("\\.");
        int n=str.length;
        if(n==0){
            return null;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            sb.append(str[i]);
            sb.append("[.]");
        }
        sb.append(str[n-1]);
        return sb.toString();
        
        
    }
}
