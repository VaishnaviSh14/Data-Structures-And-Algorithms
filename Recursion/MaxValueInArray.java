public class MaxValueInArray{
    public static int maxValue(int arr[] , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int max = maxValue(arr, idx+1);
        if(arr[idx]>max){
            return arr[idx];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {23,45,64,22,11,23};
        System.out.println(maxValue(arr, 0));
    }
}