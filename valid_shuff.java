import java.util.Arrays;

public class valid_shuff {
    public static void main(String[] args) {
        Boolean res = valid("bz", "yx", "bxya");
        System.out.println(res);

    }
    public static Boolean valid(String s1, String s2, String s3){
        int n = s1.length();
        int m = s2.length();
        s1 = sort(s1);
        s2 =  sort(s2);
        s3 = sort(s3);
        int i=0; int j=0; int k=0;
        if(n+m!= s3.length()) return false;
        while(k<s3.length()){
            if(i<n && s1.charAt(i) == s3.charAt(k) ){i++;}
            else if(j<m &&s2.charAt(j) == s3.charAt(k)){j++;} 
            else
                return false;
                k++;
        }
        return i>=n &&j>=m;


    }
    public static String sort(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
}
