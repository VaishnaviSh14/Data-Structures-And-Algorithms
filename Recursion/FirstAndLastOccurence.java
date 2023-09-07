//Find the first and last occurence of an element in String

public class FirstAndLastOccurence{
    public static int First = -1;
    public static int Last = -1;

    public static void FindOccurence(String str , int idx , char element){
        if(idx == str.length()){
            System.out.println("First occurence of " + element + " is " + First);
            System.out.println("Last occurence of " + element + " is " + Last);
            return;
        }

        char CurrentChar = str.charAt(idx);
        if(CurrentChar == element){
            if(First == -1){
                First = idx;
            }else{
                Last = idx;
            }
        }
        FindOccurence(str, idx + 1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        FindOccurence(str, 0, 'a');
    }
}


