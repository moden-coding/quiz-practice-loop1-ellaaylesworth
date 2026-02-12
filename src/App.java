
/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int countOfpositivenumbers = 0;
        int countOfnegativenumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(scanner.nextLine());
            int remainder = number % 2;
                if (number == -1) {
                    break;
                }

                if (remainder == 0) {
                    System.out.println("Even!");
                    countOfpositivenumbers += 1;
                } else {

                    System.out.println("Odd!");
                    countOfnegativenumbers += 1;
                }
            }
            System.out.println("The number of negative numbers was " + countOfnegativenumbers);
            System.out.println("The number of positive numbers was " + countOfpositivenumbers);
        }

    }
