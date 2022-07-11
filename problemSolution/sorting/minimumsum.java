/*  Minimum Sum of Four Digit Number After Splitting Digits

You are given a positive integer num consisting of exactly four digits.
  Split num into two new integers new1 and new2 by using the digits found in num.
  Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs
  [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
  Return the minimum possible sum of new1 and new2.  */

/* approach: first convert number in digit and store in array 
   thn sort the array and find num1 by taking  1st lowest digit at 10th place and highest digit at one's place 
   similarly find num2= 2nd lowest digit*10+2nd highest digit */
// code:-
// method 01
class Solution {
    public int minimumSum(int num) {
int digit[]=new int[4];
        int indx=0;
        while(num>0){
            digit[indx]=num%10;
            num=num/10;
            indx++;
        }
        Arrays.sort(digit);
        int num1=digit[0]*10+digit[3];
        int num2=digit[1]*10+digit[2];
        return num1+num2;
        
    }
}
 
// method 02:-

/*  Approach: convert number in string then char array then sort number and do same as we done up
    converting num in char array-->
    
    one line -->   char digit[]=(num+"").toCharArray();
    or  detail-->  String s=String.valueOf(num);
                   char digit[]=s.toCharArray();
       after that 
      Convert Char To int In Java By Subtracting ‘0’
      However, to retrieve the int value for char  ‘2’ as int 2,
      the character ASCII value of ‘0’ needs to be subtracted from the character. 
      E.g. To retrieve int 2 from character ‘2’,
     int intValue = '2'- '0';    
     System.out.println("intValue?”+intValue);
    This will print intValue->2.
 so to get any int char value in int substract '0';
code:-->*/
class Solution {
    public int minimumSum(int num) {
      //char arr[]=(num+"").toCharArray();  // (num+"")-->by doing cantactination +"" we are saying num si string 
        String s=String.valueOf(num);  
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        int num1tens=arr[0]-'0';
        int num1ones=arr[1]-'0';
        int num2tens=arr[2]-'0';
        int num2ones=arr[3]-'0';
        num=(num1tens*10+num2ones)+(num1ones*10+num2tens);
        return num;
        
    }
}

//method 3--> using collection : arraylist
/* approach: create arrylist and store digit in it  and sort it thn perform get it 
*/
// code 
class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> array = new ArrayList<Integer>();
            while(num>=1){
            array.add(num%10);
            num=num/10;
        }
       Collections.sort(array);
       int first= array.get(0)*10+array.get(2);
        int sec= array.get(1)*10+array.get(3);
        int res=first+sec;  
        return res;
    }
}

// using collection : TreeSet-->cannot becoz it is not index based for this we have to make another array list and store data thn get index



