public class BubbleSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = 0; j <n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 1, 8, 7, 4, 5};
        sort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}