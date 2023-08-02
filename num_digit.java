public class num_digit {
    public static void main(String[] args) {
        int res = count(456);
        System.out.println(res);
    }
    public static int count(int n){
        int count =0;
        while(n!=0){
            
            n = n/10;
            count++;
        }
        return count;
    }
}
