package com.arrays;

import java.util.*;
public class TwoDArray {
    public static void main(String args[]){

        //input for rom and col
        Scanner sc= new Scanner(System.in);
        System.out.println("put size of row");
        int rowSize= sc.nextInt();
        System.out.println("put size of column");
        int columnSize=sc.nextInt();

        //declaring the array
        int array1[][]= new int[rowSize][columnSize];
 
        System.out.println("give elements of array");
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        //prniting out the elements of the array
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        } 
    //System.out.println(array1[0][1]);
}
}
