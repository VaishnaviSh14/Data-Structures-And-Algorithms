/*
Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks.
Initially, all the disks are stacked in decreasing value of diameter i.e., the smallest disk is placed on the top and they are on rod A.
The objective of the puzzle is to move the entire stack to another rod (here considered C), 
obeying the following simple rules: 

1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
3. No disk may be placed on top of a smaller disk.
*/

public class TowerOfHanoi{
    public static void towerofHanoi(int n , String source , String helper , String destination){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerofHanoi(n-1 , source , destination , helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        towerofHanoi(n-1 , helper , source, destination);
    }
    public static void main(String args[]){
        int n = 5;
        towerofHanoi(n , "S" , "H" , "D");
    }
}
