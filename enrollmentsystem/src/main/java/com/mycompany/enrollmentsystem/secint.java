package com.mycompany.enrollmentsystem;

import java.io.IOException;
import java.io.File;
import java.io.FilenameFilter;

public class secint {

    public void math() throws IOException {
        
        usermenu usermenu = new usermenu();

        File f = new File("C:\\Users\\Augustin\\Documents\\NetBeansProjects\\enrollmentsystem");

        FilenameFilter textFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {

                return name.toLowerCase().endsWith(".txt");
            } 
        };

        File[] files = f.listFiles(textFilter);
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print("directory:");
            } else {
                System.out.print("     Student: ");
            }
            System.out.println(file.getName());
        }
            System.out.println("Returning to menu");
            usermenu.usermain();

    }
}
