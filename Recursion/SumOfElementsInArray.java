public class SumOfElementsInArray {
    public static int sum(int arr[], int idx, int ans) {
        if (idx == arr.length) {
            return ans;
        }
        ans += arr[idx];
        return sum(arr, idx + 1, ans);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int result = sum(arr, 0, 0);
        System.out.println("Sum of elements in the array: " + result);
    }
}

