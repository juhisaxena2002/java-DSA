import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>(); 
        hm.put(1,"Ritika");
        hm.put(2, "Ritziii");
        hm.put(3,"Ritzzz");
        hm.put(4,"Riti" );

       System.out.println( hm.containsKey(3));
       System.out.println(hm.containsValue("Ritika"));
       System.out.println(hm.get(3));
       System.out.println(hm.get(5));
       hm.remove(2);
       hm.put(5,"Juhi");
      System.out.println(hm.getOrDefault(8, "jules"));

        System.out.println(hm);
        Set s = hm.entrySet();
        System.out.println(s);
        
        

    }
}
