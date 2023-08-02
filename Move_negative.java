import java.util.Arrays;

public class Move_negative {
    public static void main(String[] args) {
        int arr[] = {2,-3,-4,1,6,-9};
                
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]<0){
                left++;
            }
            else if(arr[right]>=0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                
            }
           
        }
         System.out.println(Arrays.toString(arr));

    }
}
