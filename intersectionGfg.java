import java.util.HashSet;

public class intersectionGfg {
    public static void main(String[] args) {
        int arr1 [] = {10,15,20,15,30,30,5};
        int arr2[] = {30,5,30,80,80};
        int res = intersection(arr1,arr2);
        System.out.println(res);
    }
    public static int intersection(int arr1[], int arr2[]){
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(hs.contains(arr2[j])){
                res++;
                hs.remove(arr2[j]);
            }
        }
        return res;
    }
}

//TC = O(m+n);
// AUX SPACE = 0(m)