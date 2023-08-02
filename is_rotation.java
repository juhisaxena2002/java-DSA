public class is_rotation {
    public static void main(String[] args) {
        Boolean res = is_rotate("ABCD", "ACBD");
        System.out.println(res);
    }
    public static Boolean is_rotate(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        String s3 = s1+s1;
        if(s3.indexOf(s2)!=-1) return true;
        else{
            return false;
        }

    }
}
