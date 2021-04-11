package com.mycompany.enrollmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class forint {


    public void main() throws IOException {
        
        

        try {
            
            char[] array = new char[500];
            Scanner myReader = new Scanner(System.in);
            String name = myReader.nextLine();
            FileReader file = new FileReader(name + ".txt");
            BufferedReader myObj = new BufferedReader(file);
            myObj.read(array);
            System.out.println(array);
            myReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. Don't worry I caught you");
        }
        usermenu usermenu = new usermenu();
        usermenu.usermain();
            
    }
}
