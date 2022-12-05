package com.strings;

public class StringFuntions2 {
    public static void main(String args[]){
        String mankae="Jeon Jungkook";
        String leader="Kim Namjoon";

        //s1=s2 it returns 0
        //oherwise posivtive or negative 
        //compare string
        if(mankae.compareTo(leader)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
