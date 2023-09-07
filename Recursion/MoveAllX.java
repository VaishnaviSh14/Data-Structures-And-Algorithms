public class MoveAllX{
    public static void moveX(String str , int idx , int count,String newString){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newString += 'x';
            }    
                System.out.println(newString);
                return;
            
        }

        char CurrentChar = str.charAt(idx);
        if(CurrentChar == 'x'){
            count ++;
            moveX(str,idx+1,count,newString);
        }else{
            newString += CurrentChar;
            moveX(str,idx+1,count,newString);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveX(str,0,0," ");
    }
}