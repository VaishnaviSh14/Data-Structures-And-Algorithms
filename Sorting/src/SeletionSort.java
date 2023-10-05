public class SeletionSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;

            for (int j =i+1; j<n ;j++){
                if(arr[min_idx]>arr[j]){
                   min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
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
