import java.util.*;

public class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int  size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("reverse array is: ");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+ "");
        }
        


    }
}