import java.util.Scanner;

public class airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number_of_lug = sc.nextInt();
        int weight[] = new int[number_of_lug];
        for (int i = 0; i < number_of_lug; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.println("enter the threshold");
        int threshold = sc.nextInt();
        for (int i = 0; i < weight.length; i++) {

            if(weight[i]>threshold){
                sum += 2;
            }
            else{
            sum += 1;
            }
            
        }
        System.out.println(sum);
        

    }
}
