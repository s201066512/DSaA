package org.example;
import static org.example.RomanNumerals.Solution.romanToInt;
public class RomanNumerals {
    class Solution {
        public static int romanToInt(String s) {
            int romanNumber = 0;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'I'){
                    if (i < s.length()-1){
                        if (s.charAt(i+1) == 'V'){
                            romanNumber = romanNumber + 4;
                        }
                        else if (s.charAt(i+1) == 'X'){
                            romanNumber = romanNumber + 9;
                        }
                        else{
                            romanNumber++;
                        }
                    }
                    else{
                        romanNumber++;
                    }
                }
                else if (s.charAt(i) == 'V'){
                    romanNumber = romanNumber + 5;
                }
                else if (s.charAt(i) == 'X'){
                    if (i < s.length()-1){
                        if (s.charAt(i+1) == 'L'){
                            romanNumber = romanNumber + 40;
                        }
                        else if (s.charAt(i+1) == 'C'){
                            romanNumber = romanNumber + 90;
                        }
                        else{
                            romanNumber = romanNumber + 10;
                        }
                    }
                    else{
                        romanNumber = romanNumber + 10;
                    }
                }
                else if (s.charAt(i) == 'L'){
                    romanNumber = romanNumber + 50;
                }
                else if (s.charAt(i) == 'C'){
                    if (i < s.length()-1){
                        if (s.charAt(i+1) == 'D'){
                            romanNumber = romanNumber + 400;
                        }
                        else if (s.charAt(i+1) == 'M'){
                            romanNumber = romanNumber + 900;
                            System.out.println("added 900");
                        }
                        else{
                            romanNumber = romanNumber + 100;
                            System.out.println("added 100");
                        }
                    }
                    else{
                        romanNumber = romanNumber + 100;
                        System.out.println("added 100");
                    }

                }
                else if (s.charAt(i) == 'D'){
                    romanNumber = romanNumber + 500;
                }
                else{
                    romanNumber = romanNumber + 1000;
                }
            }
            return romanNumber;
        }
    }
    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }
}
