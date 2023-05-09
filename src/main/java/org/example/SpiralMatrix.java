package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    /*
    Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    Output: [1,2,3,4,8,12,11,10,9,5,6,7]
    First group gets printed out as normal.
    Then go to the last number of the second group
    Then go to the last number of the next group and so on
    Once you reach the last one start going backwards, but skip the last numbers of each group past the first one
    * */
    public List<Integer> spiralOrder(int[][] matrix) {
        int matrixLength = 0;
        for (int i = 0; i < matrix.length; i++){
            matrixLength = matrixLength + matrix[i].length;
        }
        List<Integer> spiral = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++){
            spiral.add(matrix[0][i]);
        }
        if (matrix.length > 1){
            for (int i = 1; i < matrix.length; i++){
                for (int k = 0; k < matrixLength; k = k+matrix[0].length){
                    spiral.add(matrix[i][k]);
                }
            }
        }
        return spiral;
    }
    public static void main (String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpiralMatrix test = new SpiralMatrix();
        System.out.println(test.spiralOrder(matrix));
    }
}
