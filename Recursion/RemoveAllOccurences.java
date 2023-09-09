//Remove all occurences of 'a' from the String.

public class RemoveAllOccurences {
        public static void occurences(String str , int idx, String newString){
            if(idx == str.length()){
                System.out.println(newString);
                return;
            }
    
            char currChar = str.charAt(idx);
            if(currChar == 'a'){
                occurences(str,idx+1,newString);
            }else{
                newString+=currChar;
                occurences(str,idx+1,newString);
            }
        }
    
        public static void main(String[] args) {
            String str = "cagrmgalrargragrabcaxaa";
            occurences(str,0," ");
        
    }
    
}
