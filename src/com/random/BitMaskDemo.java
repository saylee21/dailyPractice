package com.random;

public class BitMaskDemo {
    public static void main(String args[]){
        //get bit 
        //1<<i
        //AND
        int n =5;
        int position =1;
        int bitMask= 1<<position;

        if((bitMask & n)==0){
            System.out.println("bit was o");
        }
        else{
            System.out.println("bit was 1");
        }
        //set bit 
        //bitmask 1<<i
        //OR
        System.out.println(bitMask|n);

        //clear bit operation 
        //1<<i
        // and with bitmask not 
        System.out.println((~(bitMask)&n));

        //update 
    }
}
