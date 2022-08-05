  // method 01
public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n=arr.length;
        int totalsum=0;
        for(int i=1;i<=(n+1);i++){
            totalsum+=i;
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }
        int sum=totalsum-sum1;

        int missingNo=sum;
        System.out.println(missingNo);
    }
}
         // method 02
        public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n=arr.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum=sum-arr[i];
        }
        int missingNo=sum;
        System.out.println(missingNo);
    }
}
        
        // method 03
       
        public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n=arr.length;
        int sum=1;
        for(int i=2;i<=n+1;i++){
            sum+=i;
            sum-=arr[i-2];
        }
        int missingNo=sum;
        System.out.println(missingNo);
    }
}
         
      
       
