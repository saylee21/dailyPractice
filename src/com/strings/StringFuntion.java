package com.strings;

public class StringFuntion {
    public static void main(String args[]){
        // concatination 
        String name="bangtan";
        String name1="soeneoydan";
        String groupName= name+" "+name1;
        System.out.println(groupName);

        //string length
        System.out.println(groupName.length());

        //charAt funtion
        for(int i=0 ; i<groupName.length(); i++){
            System.out.println(groupName.charAt(i));
        }
    }
}
