package com.arrlist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrListDemo1 {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<Integer>();
        // ArrayList<String> list1= new ArrayList<String>();
        // ArrayList<Boolean> list2 = new ArrayList<Boolean>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int ele= list.get(0);
        System.out.println(ele);

        //to add eleemnt in between 
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //remove element
        list.remove(3);
        System.out.println(list);

        //list size
        int size= list.size();
        System.out.println(size);

        //sort in list
        Collections.sort(list);
        System.out.println(list);

    }
}
