package Hashmap;

import java.util.HashMap;

public class TwoSum{
    public static int[] twosum(int arr[],int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            map.put(arr[i],i);
        }

        int result[] = new int[2];

        for(int i = 0; i<arr.length; i++){
            if (map.containsKey(target - arr[i])){
                result[0] = i;
                result[1] = map.get(target - arr[i]);
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int[] res = twosum(arr, 9);

        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println("Index 1: " + res[0]);
        System.out.println("Index 2: " + res[1]);
    }
}