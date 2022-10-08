package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here

        double number;
        double numbermax = 0;
        int count;

        System.out.print("Number 1: ");
        Scanner scanni = new Scanner(System.in);
        number = scanni.nextDouble();

        if (number <= 0) {
            System.out.println("No number entered.");
            numbermax = number;

        } else {
            for (count = 2; number > 0; count += 1) {
                System.out.print("Number " + count + ": ");
                number = scanni.nextDouble();
                if (number > numbermax) {
                    numbermax = number;
                }
            }  // formatting a decimal: /source: https://forum.chip.de/discussion/400137/java-bei-double-nur-2-nachkommastellen
            DecimalFormat f = new DecimalFormat("#0.00");
            System.out.println("The largest number is " + f.format(numbermax));
        }

    }


    //todo Task 2
    public void stairs(){
        int numberOfLines;
        int sum = 0;

        System.out.print("n: ");
        Scanner scan1 = new Scanner(System.in);
        numberOfLines = scan1.nextInt();

        if (numberOfLines <= 0) {
            System.out.println("Invalid number!");

        } else {
            for(int row = 0; row < numberOfLines; row++) {

                for(int i = 0; i <= row; i++) {
                    sum = sum + 1;

                    System.out.print(sum + " ");

                }

                System.out.println();

            }

          }



      }



        // input your solution here







    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        int mark;
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        do {
            System.out.println("Mark " + count++);
            mark = scanner.nextInt();
        } while (mark >= 1 && mark <= 5);
        {

        }




    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}