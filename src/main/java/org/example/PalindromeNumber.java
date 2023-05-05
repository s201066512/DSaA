package org.example;

import static org.example.PalindromeNumber.Solution.isPalindrome;
/*

 * */
public class PalindromeNumber {
    class Solution {
        public static boolean isPalindrome(int x) {
            int reverseCount = 1;
            String stringX = String.valueOf(x);
            for (int i = 0; i < stringX.length(); i++){
                if (stringX.charAt(i) != stringX.charAt(stringX.length()-reverseCount)){
                    return false;
                }
                reverseCount++;
            }
            return true;
        }
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(-121));
    }
}

