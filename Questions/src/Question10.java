public class Question10 {
    static int numPairs(int arr[], int n){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j] % arr[i] == 0)
                    ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //int arr[] = {1,1,2,2,3,3};
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        System.out.println(numPairs(arr, n));
    }
}
