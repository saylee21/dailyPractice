package com.recursioneasy;

public class Recursion5 {

    public static int calcfactorial(int n){
        if(n==1|| n==1){
            return 1;
        }
        int fact_nm1= calcfactorial(n-1);
        int fact_n= n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        int ans=calcfactorial(5);
        System.out.println(ans);
    }
}
