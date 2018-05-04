package DesignPatterns.Templates_Design_Patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        printMenu();

        Scanner in = new Scanner(System.in);
        int emailType = in.nextInt();
        EmailGenerator generator = null;
        switch (emailType){

                case 1:
                generator = new ForManagementEmailGenerator();
                break;
                case 2:
                generator = new ForHrEmailGenerator();
                break;
                case 3:
                generator = new ForEmployeeEmailGenerator();
                break;

        }
        generator.sendEmail();

    }

    private static void printMenu() {
            System.out.println("Select mail type : ");
            System.out.println("1. Manager");
            System.out.println("2. HR");
            System.out.println("3. Employee");
    }

}
