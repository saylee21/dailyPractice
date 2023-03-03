package com.sorting;

public class BubbleSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={7,8,4,5,9};

    //bubble sort 
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int replace= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=replace;
            }
        }
        
    }
    printArr(arr);
    }
    
}
