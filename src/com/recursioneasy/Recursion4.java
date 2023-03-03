package com.recursioneasy;
//factorial 
public class Recursion4 {

    public static void printFac(int i, int n, int fac){
        if(i==n){
            fac *=i;
            System.out.println(fac);
            return;
        }
        fac*=i;
        printFac(i+1, n, fac);
    }
    public static void main(String[] args){
        printFac(1,5,1);
    }
}
