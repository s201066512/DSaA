package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public int removeDupes (int[] nums){
        List<Integer> noDupes = new ArrayList<>();
        boolean alreadyAdded = false;
        int current = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == current && !alreadyAdded){
                alreadyAdded = true;
            }
            else if (current != nums[i]){
                noDupes.add(current);
                current = nums[i];
                alreadyAdded = false;
            }
        }
        noDupes.add(current);
        return noDupes.size();
    }
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates test = new RemoveDuplicates();
        System.out.println(test.removeDupes(nums));
    }
}
