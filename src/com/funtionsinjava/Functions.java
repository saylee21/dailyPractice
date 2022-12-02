package com.funtionsinjava;
import java.util.*;

public class Functions {
    //a funtion that prints name 
    // camel case for funtions
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        printMyName(name); // calls the funtion 
    }

}
