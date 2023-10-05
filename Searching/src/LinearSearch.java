public class LinearSearch{
    public static void linearSearch(int arr[],int target){

        for (int i =0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Index of target element is " + i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");

    }

    public static void main(String[] args) {
        int arr[]= {2,3,4,5,6,7,8};
        linearSearch(arr,8);

    }
}