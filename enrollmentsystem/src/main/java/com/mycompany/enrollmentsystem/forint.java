package com.mycompany.enrollmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class forint {
    
    public void mainstrt() throws IOException {
        try {
            
            char[] array = new char[500];
            Scanner myReader = new Scanner(System.in);
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                FileReader file = new FileReader("C:\\Users\\Augustin\\Documents\\NetBeansProjects\\enrollmentsystem\\students\\" + name + ".txt");
                BufferedReader myObj = new BufferedReader(file);
                myObj.read(array);
                System.out.println(array);
                menu();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. Don't worry I caught you");
            menu();
        }
        
    }
    
    public void menu() throws IOException {
        usermenu usermenu = new usermenu();
        usermenu.usermain();
    
    }
}
