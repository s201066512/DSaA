package org.example;
import java.math.BigInteger;
import java.util.*;
public class BinarySearch {
    //private int binaryS (int N){}
    public static void main(String[] args){
        BigInteger a = new BigInteger( "3" );
        BigInteger b = new BigInteger( "12" );
        BigInteger c = new BigInteger( "23" );
        BigInteger e = new BigInteger( "-7" );
        System.out.println(a.add(b).negate());
        BigInteger r =  a.add( b ).negate().multiply( c ).add( e );
        int[] numbers = {12,2,5,8,90,23,56,79,32,56,42,19,22,45,16,18};
    }
}
