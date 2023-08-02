import java.util.Arrays;

public class find_subseq {
    public static void main(String[] args) {
     boolean res = find("abcde", "cd");
     System.out.println(res);
    }
    public static boolean find(String s1, String s2){
        int i =0;int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            if(s1.length()==i){
                return true;
            }
            j++;
        }
        return false;
    }

}
