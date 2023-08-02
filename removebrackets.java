public class removebrackets {
    public static void main(String[] args) {
        String s = "(a+b+c) = [{30}]";
        brackets(s);
    
    }
    public static void brackets(String s){
       String ss =  s.replaceAll("[{}()[]]"," ");
        System.out.println(ss);
    }
}
