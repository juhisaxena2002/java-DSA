import java.util.Scanner;

public class permu {
    public static void main(String[] args) {
       // String s = "abc";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permu(s.toCharArray(), 0);
       
    }
    public static void permu(char[] ar, int fi){
      
        if(fi == ar.length-1) {
            System.out.println(ar);
            return;
        }
       for (int i = fi; i < ar.length; i++) {
        swap(ar, i, fi);
        permu(ar, fi+1);
        swap(ar, i, fi);
       }
    }
    public static void swap(char[] ch , int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
      

    }
        
            
}
 
   
        