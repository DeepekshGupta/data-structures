/* https://www.geeksforgeeks.org/print-1-to-n-without-using-loops/
*/
package Recursion;


public class P3_print1ToN {


    public void print1ToN(int n){
        if(n <= 1){
            System.out.print(1 + " ");
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");
        return;

    }

    public static void main(String[] args) {
        P3_print1ToN pNto1 = new P3_print1ToN();
        pNto1.print1ToN(100);
    }

}
