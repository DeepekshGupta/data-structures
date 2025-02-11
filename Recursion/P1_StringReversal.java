// Reverse a String

package Recursion;

public class P1_StringReversal {
    public String reverseString(String c){
        if(c.equals("")){
            return "";
        }

        return  c.substring(1) + c.charAt(0);
    }

    public static void main(String[] args) {
        P1_StringReversal stringReversal = new P1_StringReversal();
        System.out.println(stringReversal.reverseString("hello"));
    }
}
