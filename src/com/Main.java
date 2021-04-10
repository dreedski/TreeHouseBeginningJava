package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);


        System.out.println("How old are you?");
        int age = in.nextInt();
        if(age < 13){
            System.out.println("Sorry you must be at least 13 to use this program.\n");
            System.exit(0);
        }
        System.out.println("Enter your name:  ");
        String name = in.next();
        System.out.println("Enter an adjective:  ");
        String adjective = in.next();
        String noun;
        boolean isInvalidWord;
        do{
        System.out.println("Enter a noun: ");
        noun = in.next();
        isInvalidWord = (noun.equalsIgnoreCase("dork") ||
                noun.equalsIgnoreCase("jerk"));
            if(isInvalidWord) {
            System.out.println("That is not allowed. Try Again. \n\n");
        }
        }while (isInvalidWord);
        System.out.println("Enter an adverb:  ");
        String adverb = in.next();
        System.out.println("Enter a verb:  ");
        String verb = in.next();
        System.out.println("Your TreeStory: \n------------------------\n");
        System.out.println(name +  " is a" + adjective + " " + noun + ".");
        System.out.println("They are always " + adverb + " " + adjective );


    }

}

