public class MazePaths {
    public static void printPaths(int currRow , int currCol , int destRow , int destCol , String ans){

        if(currRow>destRow || currCol>destCol){
            return;
        }
        if(currRow == destRow && currCol == destCol){
            System.out.println(ans);
            return;
        }

        printPaths(currRow+1, currCol, destRow, destCol, ans+'V');

        printPaths(currRow, currCol+1, destRow, destCol, ans+'H');

    }
    public static void main(String[] args) {
        printPaths(0, 0, 2, 2, " ");
    }
    
}
