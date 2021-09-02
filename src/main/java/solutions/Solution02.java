/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solutions;

import java.util.Scanner; //This imports the Scanner class

public class Solution02 {
/*
Create a program
that prompts for an input string
    Create Scanner object 'scan'
    Create String object 'input'
    Read input from user into String
        Challenge: if user inputs nothing, ask again until they do
displays output that shows the input string
    print 'input'
and the number of characters the string contains.
    print input.length();
 */



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //scanner object
        String input=""; //String for input
        System.out.print("What is the input string? "); //prompts user for input

        while(input==""){ //loop ensures user doesn't leave input string empty

            input = scan.nextLine(); //reads user input

            if(input==""){ //checks if user input is empty
                System.out.print("You must input a string! ");
            }

        }
        //Single output statement with formatting
        System.out.printf("%s has %d characters", input, input.length());






    }

}
