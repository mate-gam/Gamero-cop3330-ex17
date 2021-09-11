/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float gen = 0, oz = 0, weight = 0, hrs = 0;
        try{
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            gen = sc.nextFloat();
            System.out.print("How many ounces of alcohol did you have? ");
            oz = sc.nextFloat();
            System.out.print("What is your weight, in pounds? ");
            weight = sc.nextFloat();
            System.out.print("How many hours has it been since your last drink? ");
            hrs = sc.nextFloat();
        }
        catch (Exception e)
        {
            System.out.println("You entered a non-numeric value");
        }
        float BAC = 0;
        if (gen == 1)
        {
            BAC = (float) ((oz * 5.14 /  weight * .73) -.015 * hrs);
        }
        else
        {
            BAC = (float) ((oz * 5.14 /  weight * .66) -.015 * hrs);
        }

        System.out.println("Your BAC is " + BAC );
        System.out.println(BAC >= .08 ? "It is not legal for you to drive" : "It is legal for you to drive");
    }
}
