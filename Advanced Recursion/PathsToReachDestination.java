public class PathsToReachDestination {
    public static void printPaths(int curr, int dest , String ans){
        if(curr == dest){
            System.out.println(ans);
            return;
        }
        if(curr>dest){
            return;
        }
        printPaths(curr + 1, dest, ans + 1);
        printPaths(curr + 2, dest, ans + 2);
        printPaths(curr + 3, dest, ans + 3);
        printPaths(curr + 4, dest, ans + 4);
        printPaths(curr + 5, dest, ans + 5);
        printPaths(curr + 6, dest, ans + 6);

    }
    public static void main(String[] args) {
        printPaths(0, 8, " ");
    }
    
}
