package com.funtionsinjava;

import java.util.Scanner;

public class FactorialFuntion {
// using print in funtion so can use the void type
    public static void printFactorial(int num){

        if(num<0){
            System.out.println("invalid no");
            return; 
            //if above condition satisfies it return from here
        }
        int factorial=1;
        for(int i=num; i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        printFactorial(num);
    }
}
