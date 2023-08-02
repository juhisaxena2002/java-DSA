import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the kth element: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(k+"th" + "largest element in the array is:" + pq.peek());
        
        }
}

//BY DEFAULT JAVA INITIALIZES MIN PQ.