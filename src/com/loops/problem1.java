package com.loops;
import java.util.*;
// sum on n natural numbers

public class problem1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=0; i<=n ;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        }
    }

