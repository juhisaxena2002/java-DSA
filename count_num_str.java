public class count_num_str {
    public static void main(String[] args) {
        String s = "8make1and5";
        int res = count_num(s);
        System.out.println(res);
    }
    public static int count_num(String s){
        int sum = 0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            sum += (s.charAt(i)-'0');
        }
      }
      return sum;
      
    }
}

