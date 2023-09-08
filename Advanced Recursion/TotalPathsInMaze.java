//Count total paths in a maze from (0,0) to (n,m)

public class TotalPathsInMaze {
    public static int countPaths(int i , int j , int m, int n){
        if(i==n || j==m){
            return 0;
        }
        if(i == n-1 && j == n-1){
            return 1;
        }

        int downPaths = countPaths(i+1, j, m, n);
        int rightPaths = countPaths(i, j+1, m, n);

        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int m= 3 , n = 3;
        System.out.println("Total Paths are " + countPaths(0, 0, m, n));
    }
    
}
