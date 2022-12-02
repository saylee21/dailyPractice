package com.conditionals;
import java.util.*;
// make calculator using switch
public class problem1 {
    public static void main(String[] args){

        System.out.println("enter vlue of a and b");
        System.out.println("enter no 1 to 4");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int n= sc.nextInt();

        switch(n){
            case 1:System.out.println(a*b);
            break;
            case 2: System.out.println(b-a);
            break;
            case 3: System.out.println(a+b);
            break;
            case 4 : System.out.println(b/a);
            break;
            default:
            System.out.println("error");
        }
    }
}
