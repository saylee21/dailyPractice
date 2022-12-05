package com.strings;
import java.util.*;

public class StringBuilderDemo {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Kim Namjoon");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //st char at index
        sb.setCharAt(0, 'j');
        System.out.println(sb);
    }
}
