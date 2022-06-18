/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-18
 */

import java.util.Scanner;
import static java.lang.Math.round;


public class Circles02 {

    public static void main(String[] args) {

        circleMath(); // get input, compute, output

    }
	
	/* this method asks for a radius, calculates the circumference and area,
	 * and prints */

    public static void circleMath() {
        // instantiate a new Scanner
        Scanner sc = new Scanner(System.in);

        // prompt the user for a number
        System.out.println("Radius:");

        // store the input from the user in 'radius'
        double radius = sc.nextDouble();

        // ========== INSERT YOUR CODE HERE ==========
        /*
         * Area of circle: A = πr²
         * Circumference of a circle: C = 2πr
         * use formula and input to calculate circumference and area
         * */

        double area = Math.PI * (radius * radius);
        double circumference = 2 * Math.PI * radius;

        //output formatted results with one println
        System.out.println(
                "CIRCUMFERENCE = " + circumference +
                "\nAREA = " + area +
                "\nROUNDED AREA = " + round(area));
        // ===========================================

        // close the scanner
        sc.close();

    }

}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Remembering the order of operations and how to concatenate in order to use one println statement



2. What will you always remember (never forget) from this exercise?
How to format and concatenate code



*/