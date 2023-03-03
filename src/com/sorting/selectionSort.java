package com.sorting;

public class selectionSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] ={7,8,3,1,2};

        //selction sort
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;

        }
        printArr(arr);

    }
}
