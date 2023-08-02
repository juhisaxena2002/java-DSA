import java.util.Arrays;

public class mergesortedarray {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9};
        int n = arr1.length;
        int arr2[] = {2,4,6,8};
        int m = arr1.length;
       
        int arr3[] = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
            arr3[k] = arr1[i];
            k++;
            i++;
            }
            else{
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            arr3[k] = arr1[i];
            k++;i++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            k++;j++;
        }
        return arr3;
    }
}
