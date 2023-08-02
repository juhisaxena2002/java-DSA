import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>(); 
        hm.put(1,"abc");
        hm.put(2, "def");
        hm.put(3,"ghi");
        hm.put(4,"jkl" );

       System.out.println( hm.containsKey(3));
       System.out.println(hm.containsValue("abc"));
       System.out.println(hm.get(3));
       System.out.println(hm.get(5));
       hm.remove(2);
       hm.put(5,"xyz");
      System.out.println(hm.getOrDefault(8, "rit"));

        System.out.println(hm);
        Set s = hm.entrySet();
        System.out.println(s);
        
        

    }
}
