public class first_rep_char {
    public static void main(String[] args) {
        String s = "prakasrhhhjuhiii";
        // System.out.println(s.indexOf("R"));
        // System.out.println(s.lastIndexOf("R"));
        repeating(s);
        String ss= s.replaceAll("juhi", "jules");
        System.out.println(ss);
    }
    public static void repeating(String s){
        char ch[] = s.toCharArray();
        for(char c: ch){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
           
            
        }
         
         
       
            }
}
