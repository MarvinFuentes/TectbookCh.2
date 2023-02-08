/**
 * @class: TimeConverter
 * @aurthor: Marvin Fuentes
 * @course: ITEC 2140 section 4
 * @written: February 6, 2023
 * This program will convert any amount of seconds into hours then minutes and lastly seconds.
 */
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the total number of seconds:");
        int totalSeconds = in.nextInt();
        int seconds = totalSeconds % 60;
        int hours = totalSeconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.println("If total number of seconds is: " + totalSeconds + ", it is "
                + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");
    }
}
