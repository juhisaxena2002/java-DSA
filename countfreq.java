import java.util.HashMap;
import java.util.LinkedHashMap;

public class countfreq{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7,7,8};
        count(arr);
    }
    public static void count(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x: arr){
            hm.put(x, hm.getOrDefault(x,0)+1);

        }
        System.out.println(hm);
        
    }
}