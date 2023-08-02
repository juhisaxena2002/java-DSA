public class kadens {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-4,5};
        int res = max_subarray(arr);
        System.out.println(res);
    }
    public static int max_subarray(int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if(curr_sum>max_sum){
                max_sum = curr_sum;
            }
            if(curr_sum<0){
                curr_sum = 0;
            }
        }
        return max_sum;
    }
}
