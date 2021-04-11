package com.mycompany.enrollmentsystem;

import java.io.IOException;
import java.util.Scanner;

public class usermenu {
    
    public void usermain() throws IOException {
        
        //Initiation of code
        //Mostly System outs
        System.out.println("Welcome to Mapulo Elementary enrollment system");
        System.out.println("Here are the possible commands you can enter: \n"
                + "1 = Create a student file \n"
                + "2 = Search a student \n"
                + "3 = get all students");

        //Creating random vars
        int First = 1;
        int Second = 2;
        int Third = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your command");

        try {
            String ans = input.nextLine();
            int ans2 = Integer.parseInt(ans);

            //Options command
            //Will take you to another file
            if (ans2 == First) {
                System.out.println("Create a new student");
                thirint first = new thirint();
                first.main();

            } else if (ans2 == Second) {
                System.out.println("Enter a students name");
                forint second = new forint();
                second.main();

            } else if (ans2 == Third) {
                System.out.println("Retrieving all listed students");
                secint three = new secint();
                three.math();

            } else {
                System.out.println("Invalid input.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            usermain();
        }
        
    }
}
