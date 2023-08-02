import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k_min = sc.nextInt();
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k_min;i++){
            pq.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println("kth_min element is :"+ pq.peek());
    }
}
