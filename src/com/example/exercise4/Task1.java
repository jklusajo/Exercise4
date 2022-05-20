package com.example.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea{
    double a, b, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate the area of a rectangle.");
        System.out.println("Enter the value of side a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Now the value of side b:");
        b = Double.parseDouble(br.readLine());
    }

    void computeField(){area = a * b;}

    void fieldDisplay(){
        System.out.print("The area of the rectangle with side a: ");
        System.out.printf("%2.2f",a);
        System.out.print(" and side b: ");
        System.out.printf("%2.2f",b);
        System.out.print(" is = ");
        System.out.printf("%2.2f.\n",area);
    }
}

public class Task1 {
    public static void main(String[] args) throws IOException{
        RectangleArea RA = new RectangleArea();
        RA.getData();
        RA.computeField();
        RA.fieldDisplay();
    }
}