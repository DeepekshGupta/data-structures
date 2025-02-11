package Recursion;

public class P4_checking_Palindrome {

    Boolean checkPalindrome(String n){
        if(n.length() <= 1){
            return false;
        }
        if(n.charAt(0 ) == n.charAt(n.length()-1)){
            // System.out.println(n.substring(1, n.length()-1));
            checkPalindrome(n.substring(1, n.length()-1));
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        P4_checking_Palindrome palindrome = new P4_checking_Palindrome();
        System.out.println(palindrome.checkPalindrome("saippuakivikauppias"));
        System.out.println(palindrome.checkPalindrome("(()("));

    }
}
