package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter height(cm)");
        int height = sc.nextInt();
        System.out.println("enter weight(kg)");
        int weight = sc.nextInt();
        System.out.println("BMI= "+weight/(0.01*height*height*0.01));
    }
}


