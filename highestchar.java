import java.util.HashMap;

public class highestchar {
    public static void main(String[] args) {
        String str = "aaaaabbbcc";
        count_freq(str);
    }
    
    public static void count_freq(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        char ans = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(count < hm.get(ch)){
                ans = ch;
                System.out.println(ans);
                count = hm.get(ch);
                System.out.println(count);
            }
        }
        System.out.println(hm + " "+ count);

    }
}

