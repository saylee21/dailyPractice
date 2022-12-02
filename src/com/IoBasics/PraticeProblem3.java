package com.IoBasics;
//print a table for a given input

import java.util.*;


public class PraticeProblem3 {
    public static void main(String[] args){
        System.out.println("enter a number you want a table for");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        for(int n=1; n<11; n++){
            System.out.println(number*n);
        }

    }

    
}
