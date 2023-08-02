public class removespaces{
    public static void main(String[] args) {
        String s = "prep insta j";
        remove(s);
    }
    public static void remove(String s){
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=' ' && c[i]!= '\t'){
                sb.append(c[i]);
            }
        }
        System.out.println(sb);

    }
}