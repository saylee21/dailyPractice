package com.arrays;
//find a the position of the element

import java.util.*;

public class ArrayQue {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //input
        System.out.println("enter size of array");
        int sizeOfArray=sc.nextInt();
        int arrayNew[]= new int[sizeOfArray];

        System.out.println("enter elements of array");

        for(int i=0; i<sizeOfArray; i++){
            // input array elements
            arrayNew[i]= sc.nextInt();
        }
        //input the no
        System.out.println("enter the number3");
        int findNum=sc.nextInt();
        for(int i=0;i<sizeOfArray;i++){
            if(arrayNew[i]==findNum){
                System.out.println("element found at"+i);
            }
        }
    }
}
