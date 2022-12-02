package com.arrays;

import java.util.Scanner;

public class ArrayThree {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //input
        int sizeOfArray=sc.nextInt();
        int arrayNew[]= new int[sizeOfArray];

        for(int i=0; i<sizeOfArray; i++){
            // input array elements
            arrayNew[i]= sc.nextInt();
        }
        System.out.println("array demo");
 
        for(int i=0; i<sizeOfArray; i++){
            System.out.println(arrayNew[i]);
        }

    }
}
