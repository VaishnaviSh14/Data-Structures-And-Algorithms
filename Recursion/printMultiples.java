//Given a number num and a value k. Print k multiples of num.
public class printMultiples {
    public static void multiples(int num, int k, int n) {
        if (n == k) {
            return;
        }
        int ans = num * (n + 1);
        System.out.println(ans);
        multiples(num, k, n + 1);
    }

    public static void main(String[] args) {
        multiples(12, 5, 0);
    }
}
