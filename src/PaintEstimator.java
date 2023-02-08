/**
 * @class: CircleCalculator
 * @aurthor: Marvin Fuentes
 * @course: ITEC 2140 section 4
 * @written: February 6, 2023
 * This program will calculate the amount of paint you need based off of
 * the dimensions of the users room. The user can also input the amount of
 * windows and doors of the room to discount the paint needed.
 */

import java.util.Scanner;
public class PaintEstimator {
    public static void main(String[] args) {
        final int gallon = 350; //constant variable
        final double quart = 87.5; //constant variable
        final int window = 15; //constant variable
        final int door = 21; //constant variable
        Scanner input = new Scanner (System.in);
        System.out.print("Enter length of room:");
        int length = input.nextInt();
        System.out.print("Enter width of room:");
        int width = input.nextInt();
        System.out.print("Enter height of room:");
        int height = input.nextInt();
        System.out.print("Enter the number of windows:");
        int ws = input.nextInt();
        System.out.print("Enter the number of doors:");
        int ds = input.nextInt();
        int surfaceArea = 2 * ((height * width )+ (length * height) + ( width * length));
        int areaNotInUse = (ws * window) + (ds * door) +  (2*(length * width));
        int areaInUse = surfaceArea - areaNotInUse;
        double finalQuarts = areaInUse % quart;
        int finalQuartsAnswer = (int)finalQuarts;
        double finalGallons = (areaInUse - finalQuarts) / gallon;

        System.out.println("Amount of gallons is: " + finalGallons + " and the amount of quarts is: " + finalQuartsAnswer);
    }
}







