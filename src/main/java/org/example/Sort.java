package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        while (true){
            List<Integer> numList = new ArrayList<>();
            System.out.println("1 for BogoSort, 2 for something else");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // make random array of numbers
            for (int i = 0; i < 12; i++){
                int random = (int) ((Math.random() * 100));
                numList.add(random);
            }

            if (input.equals("1")){
                while (true){
                    for (int i = 0; i < 12; i++){
                        int randomIndex = (int) (Math.random() * (12));
                    }
                }
            }
        }
    }
}
