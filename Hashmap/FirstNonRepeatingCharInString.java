package Hashmap;
import java.util.*;

public class FirstNonRepeatingCharInString {
    public static void print(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        int result = -1;
        for(int i =0 ; i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("The first non - repeating character is at index " + i);
                result = 1;
                break;
            }
        }
        if(result == -1){
        System.out.println("No non-repeating character found");
        }
    }
public static void main(String[] args) {
    String str = "PRIYAPR";
    print(str);
}
}

