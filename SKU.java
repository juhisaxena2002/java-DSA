import java.util.Scanner;

public class SKU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pro = 1;
        int size = sc.nextInt();
        int arr1 [] = new int[size];
        int arr2 [] = new int[size];
        int arr3 [] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i]>0){
                pro = arr1[i]*arr2[i];
                System.out.print(pro + " ");
            }
            pro = 1;
        }
    }
    
}
