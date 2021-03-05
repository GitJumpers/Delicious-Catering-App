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
        customer client = getCustomerInfo();  //gets Initial customer info
        event eventObjInfo = getEventInfo();  //gets Initial event info


        formatDate = dateConfirm();



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

        
        customer cust = new customer(customerName, customerSurname, customerPhoneNumber);
        new Register(); //shows user they have been registered through a jframe pop-up
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
            String userInput = SC.nextLine().toLowerCase();

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

    static event getEventInfo()
    {
        //classes
        SC = new Scanner(System.in);
        //vars
        boolean ThemeFlag = false;
        boolean DecorationFlag = false;
        boolean loopEnd = false;
        boolean loopEnd2 = false;
        //method
        
        System.out.println("Enter event name: ");
        String EventName = SC.nextLine();

        System.out.println("Enter event type: ");
        String EventType = SC.nextLine();
        
        
        System.out.println("Enter event venue: ");
        String EventVenue = SC.nextLine();



        System.out.println("Enter number of people at event: ");
        int EventNumberOfPeople = SC.nextInt();

        

        //theme parameters
        do 
        {
            System.out.println("Do you have a theme? Y or N");
            String ThemeAnswer = SC.nextLine().toLowerCase();

            switch (ThemeAnswer) 
            {
                case "y":
                    ThemeFlag = true;
                    loopEnd = true;
                    break;

                case "n":
                    ThemeFlag = false;
                    loopEnd = true;
                    break;
            
                default:
                    System.out.println("Please enter y or n");
                    break;
            }
        } while (loopEnd != true);

        String Theme;
        if (ThemeFlag == true)
        {
            System.out.println("Enter theme of the event: ");
            Theme = SC.nextLine();
        }
        else
        {
            Theme = "NA";
        }
        
        
        
        //decoration parameters
        do 
        {
            System.out.println("Do you have a theme? Y or N");
            String ThemeAnswer = SC.nextLine().toLowerCase();
            
            switch (ThemeAnswer) 
            {
                case "y":
                ThemeFlag = true;
                loopEnd2 = true;
                break;
                
                case "n":
                ThemeFlag = false;
                loopEnd2 = true;
                break;
                
                default:
                System.out.println("Please enter y or n");
                break;
            }
        } while (loopEnd2 != true);
        
        
        String DecorationDetails;
        if (DecorationFlag == true) 
        {
            System.out.println("Enter decorations needed for the event: ");
            DecorationDetails = SC.nextLine();
        }
        else
        {
            DecorationDetails  = "NA";
        }



        Float EventCost = SC.nextFloat();
        /*put in a method to calculate eventCost based off of previous parameters */



        event eventInfo = new event(EventName, EventType, EventVenue, EventNumberOfPeople, EventCost, ThemeFlag, Theme, DecorationFlag, DecorationDetails);
        return eventInfo;
    }
}