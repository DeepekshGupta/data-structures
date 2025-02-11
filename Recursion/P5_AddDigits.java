/*
 * https://leetcode.com/problems/add-digits/description/
 */
package Recursion;

public class P5_AddDigits {



    int addDigits(int num) {
        if(num < 10 && num >= 0){
            return num;
        }
        return addDigits(num/10) + num%10;
    }

    int addDigits2(int num) {
        int k = addDigits(num);
        if(k < 10 && k >= 0){
            return k;
        }
        return addDigits2(k);
    }

    public static void main(String[] args) {
        P5_AddDigits addDigits = new P5_AddDigits();
        System.out.println(addDigits.addDigits2(12345));
    }
    
}
