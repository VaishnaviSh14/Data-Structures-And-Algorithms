//oc - open count
//cc - closed count

public class BalancedParanthesis {
    public static void parenthesis(int n , int oc , int cc , String ans){
        if(oc == n && cc == n){
            System.out.println(ans);
            return;
        }
        if(oc<n){
            parenthesis(n, oc+1, cc, ans +'(');
        }
        if(oc>cc){
            parenthesis(n, oc, cc+1, ans+')');
        }
    }
    public static void main(String[] args) {
        parenthesis(4, 0, 0, " ");
    }
}
