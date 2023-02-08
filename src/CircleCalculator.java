/**
 * @class: CircleCalculator
 * @aurthor: Marvin Fuentes
 * @course: ITEC 2140 section 4
 * @written: February 6, 2023
 * This program will find the base area of a cylinder and volume of
 * cylinder based off of what radius the user enters.
 */
import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        final double PI_Value = 3.1416; // declare a constant variable fo PI
        Scanner input = new Scanner (System.in);
        System.out.print("Enter radius of circle:");
        double radius = input.nextDouble();
        System.out.print("Enter height of cylinder:");
        double height = input.nextDouble();
        double base_Area = (2 * PI_Value * radius * radius);
        double volume_Cylinder = (PI_Value * radius * radius * height);
        System.out.println("Base area of cylinder: " + base_Area);
        System.out.println("Volume of cylinder: " + volume_Cylinder);
    }
}
