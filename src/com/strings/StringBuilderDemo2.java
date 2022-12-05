package com.strings;

public class StringBuilderDemo2 {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("kim jin");
        System.out.println(sb);

        sb.insert(4, "seok");
        System.out.println(sb);

        //delete funtion //end index not inclusive
        sb.delete(0, 3);
        System.out.println(sb);

        //apending .. add to the end 
        sb.append(" and i world wide handsome you know!");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
