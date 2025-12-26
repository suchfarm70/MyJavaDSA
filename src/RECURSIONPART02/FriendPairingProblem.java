package RECURSIONPART02;
public class FriendPairingProblem {

    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int fnm1 = friendspairing(n - 1);

        int fnm2 = friendspairing(n - 2);
        int pairingways = (n - 1) * fnm2;

        int result = fnm1 + pairingways;

        //or i can write the return statement directly
        //return friendspairing(n-1) + (n-1) * friendspairing(n-2);

        return result;
    }
    public static void main(String [] args){
        System.out.println(friendspairing(3));
    }
}
