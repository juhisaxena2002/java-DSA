public class wildcard {
    public static void main(String[] args) {
        Boolean res = match("pr*o", "prep");

        System.out.println(res);
    }
    public static Boolean match(String wildcard, String target){
        if(wildcard.length() == target.length()){
            for(int i=0;i<wildcard.length();i++){
                if(wildcard.charAt(i)!='*' && wildcard.charAt(i)!=target.charAt(i)){
                    return false;
                }
            }
            return true;
        }
            else{
                return false;
            }
            
        }
    }

