import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int  size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } 
         int max = arr[0];
         int min =  arr[0];
        for (int i = 1; i < arr.length; i++) {
           
            if(max<arr[i]){
                max = arr[i];
            }
            else if(min>arr[i]){
                min = arr[i];
            }
             
        }
        System.out.println("max is: " + max);
        System.out.println("min is : " + min);
       
    }
}
