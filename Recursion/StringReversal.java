//Print the String "ABCD" in reverse order.

public class StringReversal {
    public static void printReverse(String str , int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printReverse(str, index-1);

    }
    public static void main(String[] args) {
        String str = "ABCD";
        printReverse(str, str.length()-1);
    }
    
}
