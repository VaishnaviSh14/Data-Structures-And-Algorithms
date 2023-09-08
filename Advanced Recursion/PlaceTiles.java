//Place tiles of size 1*m on a floor of size n*m

public class PlaceTiles {
    public static int PrintWays(int n , int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int vertically = PrintWays(n-m, m);

        int horizontally = PrintWays(n-1 , m);

        return vertically + horizontally;
    }
    public static void main(String[] args) {
        int n = 4 , m= 2;
        System.out.println("Total Ways tiles can be placed are " + PrintWays(n, m));
    }
    
}
