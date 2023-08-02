public class compress{
    public static void main(String[] args) {
        String s = "aaabbdsa";
        String ans = com(s);
        System.out.println(ans);
    }
    public static String com(String s){
        String ans = " ";
        int count = 0;
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==ch){
                count++;
            }
            else{
                ans += ch;

                
                if(count>1){
                    ans += count;
                    count = 1;
                }
                ch = s.charAt(i);
            }
            if(i==s.length()-1){
                ans+= s.charAt(i);
                if(count>1){
                    ans += count;
                    count = 1;
                }
            }
        }
        return ans;
    }
}