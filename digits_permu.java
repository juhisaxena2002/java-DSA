import java.util.Arrays;

public class digits_permu {
   public static void main(String[] args) {
    int a = 12;
    int res = max(a);

    System.out.println(res);
   } 
   public static int max(int a){
    int temp = a;
    
     int i = 0;
     int count=0;
     while(a!=0){
        int rem = a%10;
        count++;
        a = a/10;
     }
     int arr[] = new int[count];
     while(a!=0){
        int rem = a%10;
        arr[i] = rem;
        i++;
        a = a/10;
     }
     Arrays.sort(arr);
     StringBuilder sb = new StringBuilder();
     sb.append(arr.toString());
     String s = sb.toString();
    int p = Integer.parseInt(s);
     if(p>temp){
        return p;
     }
     else{
        return -1;
     }
     
   }
}
