public class first_rep_char {
    public static void main(String[] args) {
        String s = "abcdeef";
        // System.out.println(s.indexOf("e"));
        // System.out.println(s.lastIndexOf("e"));
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
