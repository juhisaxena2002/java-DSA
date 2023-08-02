import java.util.Arrays;

public class max_subset {
    public static void main(String[] args) {
        int arr[] = {1,2,4,-2,3};
        int res[] = sub_set(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sub_set(int arr[]){
        int[]arr1= new int[2];

        int sum= 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum += arr[i];
                count++;
            }
            arr1[0] = sum;
            arr1[1] = count;

        }
        return arr1;
        
    }
}
