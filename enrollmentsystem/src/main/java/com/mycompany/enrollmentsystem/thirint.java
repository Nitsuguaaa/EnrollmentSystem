package com.mycompany.enrollmentsystem;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class thirint {

    public void main() {
        
        usermenu usermenu = new usermenu();

        try {
            Scanner inp = new Scanner(System.in);

            System.out.println("Enter Students name:");
            String file = inp.nextLine();

            File myObj = new File(file + ".txt");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
                usermenu.usermain();
            }
            
            
            FileWriter myWriter = new FileWriter(file + ".txt");
            
            System.out.println("Enter Students full name:");
            String fname = inp.nextLine();
            System.out.println("Enter Students Age:");
            String sage = inp.nextLine();
            System.out.println("Enter Students Address:");
            String sadd = inp.nextLine();
            System.out.println("Enter Students Grade");
            String sgra = inp.nextLine();
            
            
            
            myWriter.write("name:" + fname + "\nage:" + sage + "\naddress:" + sadd + "\ngrade:" + sgra);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            usermenu.usermain();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
}
