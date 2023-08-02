public class borrow {
    public static void main(String[] args) {
        int ans = reverse("praks");
        System.out.println(ans);
    }
    public static int reverse(String s ){
        s = s.toLowerCase();
        char ch [] = s.toCharArray();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String rev = sb.toString(); // ateeg
        char ch2[] = rev.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(ch2[i]==(ch[i])){
                count++;
            }
        }
        return count;
        

    }
}
