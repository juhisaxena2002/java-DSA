public class javaaa {
    public static void main(String[] args) {
        String ans = "abcde";
        String res = len(ans);
        System.out.println(res);
    }
    public static String len(String s){
        String ans =" ";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u'){
                continue;
            }
            else{
                ans+=ch;
            }
        }
        return ans;
    }
}
