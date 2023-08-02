import java.util.HashMap;

public class count {
    public static void main(String[] args) {
        int arr[] = {-2,-2,3,4,5,6,6};
        count_freq(arr);
    }
    public static void count_freq(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x: arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        System.out.println(hm);
    }
}
