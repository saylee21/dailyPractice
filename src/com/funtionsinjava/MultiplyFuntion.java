package com.funtionsinjava;

import java.util.Scanner;

public class MultiplyFuntion {

    public static int returnProduct(int a, int b){
        int product= a*b;
        return product;
        // can be also written as return a*b 
        //no need to define new variable everytime
        //return a*b;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product= returnProduct(a, b);
        System.out.println(product);
        // similaly to omit use of variable we can print
        // System.out.println(returnProduct( a, b));
    }
}
