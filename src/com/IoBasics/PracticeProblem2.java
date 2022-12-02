package com.IoBasics;
/**program that takes the radius as input, calculates
 its radious and area and prints output
**/
//import java.math.*;
import java.util.*;

public class PracticeProblem2 {
    public static void main(String[] args){
        System.out.println("enter an interger as vale of radius");
        Scanner sc= new Scanner(System.in);
        int radius= sc.nextInt();
        double area;
       // nextInt() for int value 
       // nextFloat() for float value

        //area of circle
        area= 2*3.14*radius;
        System.out.println("the area of circle is:");
        System.out.println(area);

    }
}
