public class target_sum {
    public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
       Boolean res = target(arr,19);
       System.out.println(res);
    }
    public static Boolean target(int ar[], int target){
       
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if(ar[j]+ar[i]==target)
                 return true; 
            }  
        }
        return false;
           
     
}
}
