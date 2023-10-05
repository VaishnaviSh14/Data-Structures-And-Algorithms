public class SquareRoot {
    public static int square(int num){
        int low = 0 , high = num;
        int result =0;
        while(low<=high){
            int mid = low +(high-low)/2;
            long val = mid*mid;
            if(val==num){
                return mid;
            } else if (val<num) {
                result = mid;
                low = mid+1;

            }else{
                high = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 16;
        int res = square(num);
        System.out.println(res);

    }
}
