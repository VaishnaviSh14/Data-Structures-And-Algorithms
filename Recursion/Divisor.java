public class Divisor {
        public static void divisor(int x , int n ){
            if(n>x){
                return;
            }
                if(x%n==0){
                    System.out.println(n);
            }
            divisor(x, n+1);
    }
    public static void main(String[] args) {
        divisor(24, 1);
    }
}
