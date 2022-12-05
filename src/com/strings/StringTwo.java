package com.strings;

import java.util.Scanner;

public class StringTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //input
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter bias");
        String biasName=sc.nextLine();
        System.out.println("enter line");
        String andHeSays=sc.nextLine();

        //output
        System.out.println(name);
        System.out.println(biasName);
        System.out.println(andHeSays);

    }
}
