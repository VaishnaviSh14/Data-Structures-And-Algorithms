import java.util.Arrays;

public class InsertionSort {

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j =i;

            while (j>0 && arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 1, 8, 7, 4, 5};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
