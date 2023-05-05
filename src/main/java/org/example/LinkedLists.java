package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
/*
Goals:
Try using every type of data structure in java
Try using lambda constructors
Use iterators
Try implementing a binary search algorithm
    no looking it up
Experiment with different types of algorithms
    combining the new data structures I've learned
Try doing easy leetcode challenges

Big O: Algorithm is at least this fast
    Ex: O(n) means that it is at worst O(n) but could potentially be faster, such as O(1)
Big Ω: Algorithm is at leas this slow
    Ex: Ω(n) means that at best it is Ω(n) but could be worse, such as Ω(n^2)
Big Θ: Algorithm is always the same and never varies
    Ex: Θ(1) means that the algorithm no matter what will always be the same constant speed

LinkedList vs ArrayList
Both are implementations of the List interface
Both can be resized (i.e, add or delete elements)
The same methods of both can have different algorithmic complexities

get(int index)
    LinkedList: O(n), potentially O(1)
        only O(1) when index = 0 or the index is 1 less than the total number of elements in the list
            so for a list with 10 things, doing get(9) will be O(1)
    ArrayList: Θ(1); always constant no matter what
add(int index, E element)
    LinkedList: O(n), potentially O(1)
        same as the get method
            O(1) when index is the first or last element of the list
    ArrayList: O(n) with n/2 steps on average
        I assume that means that on average its O(n/2)
            but because that still means the time increases at a linear rate proportionate to the amount of elements
                we just say O(n)

    In conclusion:
    In a LinkedList if you are trying to find something slightly less than halfway through,
    it will start from the beginning and work its way up to the index requested
    The same applies for requested indexes which are closer to the end
    Supposedly LinkedLists are better for adding and removing using preexisting iterators, but
    I don't know what iterators are or how they work, so I'll do that next
    But an ArrayList would be able to find it with a speed of O(1)
    Apparently both are equally cheap memory wise and in terms of speed
    I don't think it really matters too much whichever one you use

difference between
LinkedList<Integer> numbers = new LinkedList<Integer>();
and LinkedList<Integer> numbers2 = new LinkedList<>();?

*/

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        numbers.add(1);
        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(5);
        numbers2.add(82);
        System.out.println("numbers: " + numbers);
        LinkedLists.addNum(numbers);
        System.out.println("After adding 10: " + numbers);
        numbers.addAll(1, numbers2); // insert 5 and 82 into numbers at index 1
        System.out.println("Inserting numbers2 into numbers: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
    }
    public static void addNum(LinkedList<Integer> N){
        for(int i = 0; i < 11; i++){
            N.add(i);
        }
    }
}