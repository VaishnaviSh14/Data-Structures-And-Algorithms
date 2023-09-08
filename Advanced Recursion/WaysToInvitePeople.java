//Find the number of ways in which you can invite n people to your party either single or in pairs

public class WaysToInvitePeople {
    public static int printWays(int n){
        if(n<=1){
            return 1;
        }
        int single = printWays(n-1);

        int pairs =  n-1 * printWays(n-2) ;

        return single + pairs;

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways in which we can invite " + n + " people to party are " + printWays(n));
    }
    
}
