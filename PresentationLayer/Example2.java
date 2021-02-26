package PresentationLayer;

import  java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println(" Delicous- Catering");
        System.out.println(" wellcom To Delicous- Catering");
        System.out.println(" To register please fill in the following questions: ");

        //get user input:Register
        System.out.println("Enter your FullName");
        String FullName = sc.nextLine();

        System.out.println("Enter your IdNumber");
        int IdNumber= sc.nextInt();

        System.out.println("Enter your PhoneNumber");
        int PhoneNumber= sc.nextInt();

        //the will be a pop up that we say "Registed"

        // Get user input: Catering

        System.out.println(" Enter the type of event :  'Wedding','Birthday parties', ' baptism', 'Year-end function'");
        String EventType = sc.nextLine();

        //call a class from the BusinessLayer and Declare it object
        // have an if statement on user choice 

        System.out.println("Enter the Date of the Event");
        int Date = sc.nextInt(); // not sure about the data type of the date

        //call a class from the BusinessLayer and Declare it object
        // have an if statement on user choice to check if the day is available

        System.out.println("Would you like the Delicous- Catering to decorate the venue? ");
        System.out.println("The answer must be Yes or No!");
        String decoration = sc.nextLine();

        //if statement that will ask fot the theme if the client said yes, but if it said no it move to date

        System.out.println("Enter Vanue Address");
        String Address = sc.nextLine();

        System.out.println("Enter Number of aldults to cater for");
        int aldults = sc.nextInt();
        
        System.out.println("Enter Number of Kids to cater for");
        int Kids = sc.nextInt();

        System.out.println(" Enter the type of dish :  'BEEFplate','PorkPlate', 'Chickenplate','Vegetarianplate','Pastadish','TripePlate'");
        String dish = sc.nextLine();

         //call a class from the BusinessLayer and Declare it object
        // have an if statement on user choice 
    }
   
}
