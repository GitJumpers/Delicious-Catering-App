package PresentationLayer;

import BusinessLogicLayer.*;
import javax.swing.text.ChangedCharSetException;
import javax.swing.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;

public class MaxIdea
{
    static Scanner SC;
    public static void main(String[] args) throws SQLException
    {
        //classes
        SC = new Scanner(System.in);
        Logic logicController = new Logic();


        //variables
        String formatDate;

        //methods

        WelcomeMsg(); //start of program
        customer client = getCustomerInfo();  //gets Initial customer info and stores customer Paid to zero
        /* Ask if above constructor should rather put paid amount under event */

        new Register(); //shows user they have been registered through a jframe pop-up

        formatDate = dateConfirm();
        System.out.println(formatDate);

        //closing 
        SC.close();
    }

    static void WelcomeMsg() 
    {
        System.out.println("Welcome to Delicious-Catering online booking system");
        System.out.println("To register please complete the following questions: ");
        System.out.println("---------------------------------------------------------"); 
    }

    static customer getCustomerInfo()
    {
        //classes
        SC = new Scanner(System.in);
        
        //method
        System.out.println("Please enter your first name:"); 
        String customerName = SC.nextLine();
        System.out.println("============"); 
        
        System.out.println("Please enter your last name:"); 
        String customerSurname = SC.nextLine();
        System.out.println("============"); 
        
        System.out.println("Please enter your Phone Number:"); 
        String customerPhoneNumber = SC.nextLine(); 
        System.out.println("============"); 

        Float customerPaid = 0f;

        
        customer cust = new customer(customerPaid, customerName, customerSurname, customerPhoneNumber);
        return cust;
    }

    static String getFunctionDate()
    {
        //classes
        Logic logicController = new Logic();
        SC = new Scanner(System.in);
        //vars
        String formatDate;

        //method
        System.out.println("Please enter the day the event will take place.");
        int day = SC.nextInt();
        System.out.println("Please enter the month the event will take place.");
        int month = SC.nextInt();
        System.out.println("Please enter the year the event will take place.");
        int year = SC.nextInt();

        System.out.println("Please enter the hour the event will take place.");
        int hours = SC.nextInt();
        System.out.println("Please enter the minute the event will take place.");
        int minutes = SC.nextInt();
        int seconds = 0;

        formatDate = logicController.DateFormat(day, month, year, hours, minutes, seconds);

        return formatDate;
    }

    static String dateConfirm()
    {
        //classes
        SC = new Scanner(System.in);

        //vars
        boolean dateConfirmFlag = false;
        String newDate = getFunctionDate();

        //method

        
        while (dateConfirmFlag != true)
        {
            System.out.println("Is this date correct: " + newDate);
            System.out.println("Please enter y for yes or n for no");
            String userInput = SC.nextLine();

            switch (userInput) 
            {
                case "y":
                    dateConfirmFlag = true;
                    break;

                case "n":
                    newDate = getFunctionDate();
                    break;
            
                default:
                    System.out.println("Please enter y or n");
                    break;
            } 
        }
        

        return newDate;
    }
}