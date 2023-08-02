import java.util.Arrays;

public class is_anagram {
    public static void main(String[] args) {
        Boolean ans = isAnagram("elbow","below");
        System.out.println(ans);
    }
    public static Boolean isAnagram(String s, String s2){
        Boolean res;
        char ch[] = s.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);
        return res = Arrays.equals(ch,ch2);
        
       

        
    }
}
