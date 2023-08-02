public class capitalize {
    public static void main(String[] args) {
        String s = "prep insta";
        String ans = capi(s);
        System.out.println(ans);
    }
    public static String capi(String s){
        String newstr = " ";
        String str [] = s.split("\\s");
       
        for(String string : str){
             int len = string.length();
            String first = string.substring(0,1);
            String rest = string.substring(1, len-1);
            String last = Character.toString(string.charAt(len-1));
            newstr = newstr+ first.toUpperCase()+rest+last.toUpperCase()+" ";

        }
        return newstr;
        
    }
}

