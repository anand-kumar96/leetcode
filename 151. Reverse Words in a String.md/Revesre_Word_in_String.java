// method 01
class Solution {
    public String reverseWords(String s) {
    String result=new String(); 
        int i=0;
        int n=s.length();
	while(i<n){
        while(i<n && s.charAt(i)==' ')
            i++;
        if(i>=n)
            break;
        int j=i+1;
    while(j<n && s.charAt(j)!=' ')
        j++;
        String sb=s.substring(i,j);
        if(result.length()==0)
            result=sb;
        else
            result=sb+" "+result;
        i=j+1;
    }
        return result;
        
      }
   }

// method 02
class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
String ss="";
for(int i=str.length-1; i>=0; i--){
if(str[i]!="") //not empty string
ss +=str[i]+" ";
}
ss=ss.trim();
return ss;      
      }
   }
