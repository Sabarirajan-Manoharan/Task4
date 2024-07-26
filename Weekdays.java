package Task4;

import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        try{
            String[] str = new String[7];
            str[0]="Sunday";
            str[1]="Monday";
            str[2]="Tuesday";
            str[3]="Wednesday";
            str[4]="Thursday";
            str[5]="Friday";
            str[6]="Saturday";

            Scanner scr = new Scanner(System.in);

            System.out.println("Enter Number --> 0 to 6");
            int data = scr.nextInt();

            System.out.println(str[data]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+ "\nGiven number is out of Range.\nEnter between 0 to 6.");
        }

    }
}
