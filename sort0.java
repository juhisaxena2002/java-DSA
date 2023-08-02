import java.util.Arrays;

public class sort0{
    public static void main(String[] args) {
       int arr[] = {0,1,2,1,0,1,2,0};
       int count0=0,count1=0,count2=0;
       for (int i = 0; i < arr.length; i++) {
       if(arr[i] == 0) count0++;
       if(arr[i] == 1) count1++;
       if(arr[i] == 2) count2++;

       }
       for(int i=0;i<count0;i++){
        arr[i] = 0;
       }
       for(int i=count0;i<(count0+count1);i++){
        arr[i] = 1;
       }
       for(int i=(count0+count1);i<arr.length;i++){
        arr[i] = 2;
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
      

    }
}
