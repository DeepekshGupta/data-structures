/* https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/0
Print numbers from N to 1 (space separated) without the help of loops.
Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1
*/


package Recursion;

public class P2_printNto1 {

    public void printNto1(int n){
        if(n <= 1){
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
        return;

    }

    public static void main(String[] args) {
        P2_printNto1 pNto1 = new P2_printNto1();
        pNto1.printNto1(100);
    }
    
}
