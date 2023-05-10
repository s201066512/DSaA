package org.example;

/*
*
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
* The previous two terms combined
* Start at 2
*
*   * */
public class Stairs {
    public int climbStairs(int n) {
        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args){
        Stairs test = new Stairs();
        test.climbStairs(0);
    }
}
