public class container {
    public static void main(String[] args) {
        int arr[] = {3,0,0,2,0,4};
        int res = most_water(arr);
        System.out.println(res);
    }
    public static int most_water(int arr[]){
        int sum = 0;
        int diff = 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            diff = 0;
            if(arr[i]>arr[j]){
                diff = arr[i] - arr[j];
                sum = sum + diff;
            }
        }
        return sum;
    }
}
