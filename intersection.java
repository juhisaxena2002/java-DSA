import java.util.Arrays;

public class intersection {
    public static void main(String[] args) {
        int arr1[] = {6,9,8,1,2,3} ;
        int arr2[] = {4,3,2,7};
        int res[] = inter(arr1, arr2);
        System.out.println(Arrays.toString(res));
        
    }
    public static int[] inter(int arr1[],int arr2[]){
        int intersect[] = new int[arr1.length + arr2.length];
        int k=0;
       for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if(arr1[i] == arr2[j]){
                intersect[k++] = arr1[i];
                break;
            }
        }
       }
       return intersect;
       

    }
}
