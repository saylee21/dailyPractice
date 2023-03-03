package com.recursioneasy;

public class Recursion7 {

    public static int calexp(int x, int n){
        if(n==0){
            return 1;
        }

        int exp_nm1= calexp(x,n-1);
        int exp= x*exp_nm1;
        return exp;
    }
    public static void main(String[] args){
        int x=2 , n=5;
        int cal=calexp(x,n);
        System.out.println(cal);
    }
}
