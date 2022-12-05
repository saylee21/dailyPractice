package com.random;
//post and pre increments and decrement
public class Operators {
    public static void main(String args[]){

        //arithematic operators + - % * /
        int a =10;
        int b =0;
        int c=56;
        //b=a++; // b = 10 and a =11
        b=++a; // b = 11 and a =11
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);

        // relational operators
        //== !=v > < >= <= // retuns boolean value
        System.out.println(a==b);
        
        //logical operation && and, || or  ! not
        System.out.println( a>b && b <c);
        System.err.println(!( a>b && b <c));

        //bitwise operators
        

    }
}
