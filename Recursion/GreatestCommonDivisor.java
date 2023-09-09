import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int x , int y ){
        if(y==0){
            return x;
        }
        return gcd(y , x%y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();

        System.out.println(gcd(x, y));
    }
}