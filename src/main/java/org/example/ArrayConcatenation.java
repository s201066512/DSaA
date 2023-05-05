package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.ArrayConcatenation.Solution.getConcatenation;
public class ArrayConcatenation {
    static class Solution{
        public static int[] getConcatenation(int[] nums) {
                List<Integer> arr = new ArrayList<>();
            for (int num : nums) {
                arr.add(num);
            }
            for (int num : nums) {
                arr.add(num);
            }
            return arr.stream().mapToInt(i->i).toArray();
        }
    }
    public static void main(String[] args){
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
