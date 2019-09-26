/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

         // System.out.print("\nEnter your first name: ");
         // String firstName = in.nextLine();
         //
         // System.out.print("Enter your last name: ");
         // String lastName = in.nextLine();
         //
         // System.out.print("Enter your grade: ");
         // int grade = in.nextInt();
         //
         // System.out.print("Enter your age: ");
         // int age = in.nextInt();
         // in.nextLine();
         //
         // System.out.print("Enter your hometown: ");
         // String hometown = in.nextLine();
         //
         //
         // System.out.println("\nNAME     : " + firstName + " " + lastName);
         // System.out.println("GRADE    : " + grade);
         // System.out.println("AGE      : " + age);
         // System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final int DOLLAR = 100;
         final int QUARTER = 25;
         final int DIME = 10;
         final int NICKEL = 5;
         final int PENNY = 1;

         // System.out.print("\nEnter a dollar amount: ");
         // double total = in.nextDouble() * 100;
         //
         // int amountDollar = (int) (total / DOLLAR);
         // total = total % DOLLAR;
         // int amountQuarter = (int) (total / QUARTER);
         // total = total % QUARTER;
         // int amountDime = (int) (total / DIME);
         // total = total % DIME;
         // int amountNickel = (int) (total / NICKEL);
         // total = total % NICKEL;
         // int amountPenny = (int) (total / PENNY);
         //
         // System.out.println("\nDOLLARS  : " + amountDollar);
         // System.out.println("QUARTERS : " + amountQuarter);
         // System.out.println("DIMES    : " + amountDime);
         // System.out.println("NICKELS  : " + amountNickel);
         // System.out.println("PENNIES  : " + amountPenny);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final int DOLLAR_TEN = 1000;
         final int DOLLAR_FIVE = 500;

         // System.out.print("\nEnter a dollar amount: ");
         // total = in.nextDouble() * 100;
         //
         // int amountBills = (int) (total / DOLLAR_TEN);
         // total = total % DOLLAR_TEN;
         // amountBills = (int) (amountBills + (total / DOLLAR_FIVE));
         // total = total % DOLLAR_FIVE;
         // amountBills = (int) (amountBills + (total / DOLLAR));
         // total = total % DOLLAR;
         //
         // int amountCoins = (int) (total / QUARTER);
         // total = total % QUARTER;
         // amountCoins = (int) (amountCoins + (total / DIME));
         // total = total % DIME;
         // amountCoins = (int) (amountCoins + (total / NICKEL));
         // total = total % NICKEL;
         // amountCoins = (int) (amountCoins + (total / PENNY));
         //
         // System.out.println("\nBILLS : " + amountBills);
         // System.out.println("COINS : " + amountCoins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         final int inchesMile = 63360;
         final int inchesYard = 36;
         final int inchesFeet = 12;

         System.out.print("\nEnter a number of inches: ");
         total = in.nextInt();

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
