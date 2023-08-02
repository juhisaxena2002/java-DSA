public class powerrecr {
    public static void main(String[] args) {
        int res = power(2, 4);
        System.out.println(res);
    }
    public static int power(int a, int b){
        if(a==0) return 1;
        if(b==0) return 1;
        
        int small_output = power(a, b-1);
        int output = small_output*a;
        return output;
    }
}
