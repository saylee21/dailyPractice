package com.arrays;

import java.util.Scanner;

public class Arraysample {
    public static void main(String args[]){
        //scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("put size of row");
        int rowSize= sc.nextInt();
        System.out.println("put size of column");
        int columnSize=sc.nextInt();

        //declaring the array
        int array1[][]= new int[rowSize][columnSize];
 
        System.out.println("give elements of array");
        //input
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize;j++){
                array1[i][j]=sc.nextInt();
            }
        }

        //input no 
        int number=sc.nextInt();
        System.out.println("enter the number");

        //search
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize;j++){
                if(array1[i][j]==number){
                    System.out.println(i+" "+ j+"is index numner");
                }
            }
        }
    }
}
