import java.util.Scanner;
public class movehash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = move(s);
        System.out.println(ans);
    }
    public static String move(String s){
        StringBuilder sb = new StringBuilder();
        char [] ch = s.toCharArray();
        int count = 0;
        for (char c : ch) {
            if(c == '#'){
                sb.append(c);
                count++;
            }
        }
        for(char cc : ch){
            if(cc != '#'){
                sb.append(cc);
            }
        }
        return sb.toString();
    }
}
