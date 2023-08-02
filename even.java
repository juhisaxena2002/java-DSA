public class even {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10}; // 2,4,6,8,10,3,5,7,9 
        int res[] = even_count(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
    public static int[] even_count(int arr[]){
        int ans[] = new int[arr.length];
        int k=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[k] = arr[i]; 
                k++;
                count++;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2!=0){
                ans[k] = arr[i];
                k++;
            }
        }
        return ans;
        
    }
}
