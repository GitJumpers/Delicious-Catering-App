
package PresentationLayer;

//import javax.swing.text.ChangedCharSetException;
import BusinessLogicLayer.*;


//import javax.swing.*;
//import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
//import javax.swing.JFrame;


public class UserInput {
    // enum changes { NAME, SURNAME, ID, PHONENUMBER, EVENT, DATE, DECORATIONS, ADRESS, NUMBER_OF_ADULTS, NUMBER_OF_KIDS,
    //     ADULTSFOOD, KIDSFOOD;
    //}

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Delicous- Catering");
        System.out.println(" wellcom To Delicous- Catering");
        System.out.println("________________________________________________________________________________");
        System.out.println(" To register please fill in the following questions: ");

        //get user input:Register
        System.out.println("Enter your Name");
        String customerName = sc.nextLine();

        System.out.println("Enter your Surname");
        String customerSurname = sc.nextLine();

        System.out.println("Enter your IdNumber");
        int customerID= sc.nextInt();

        System.out.println("Enter your PhoneNumber");
        String customerPhoneNumber= sc.nextLine();
        
        //  Pop up message
        new Register();

        // Get user input: Catering
        System.out.println(" Enter the type of event :  'Wedding','Birthday parties', ' baptism', 'Year-end function'");
        String eventType = sc.nextLine();

        System.out.println("Enter the Date  of the event: (DD-MM-YYYY-HR-MIN-S) ");
        String Date = sc.nextLine();

        //call a class from the BusinessLayer and Declare it object
        Logic date = new Logic();

        //  check if the day is exist
        //having a problem with date
        //what i  want to do is: i want to check if the date exist, and if it exist i wnat to print that it exist and allowthe user to add new one
        //if it doesnt exist then print that they have choosen this date

        if(date.oneBookingDayCheck(Date)) 
        {
            System.out.println("That day is already booked, Please enter another Date:");
            Date = sc.nextLine();
        }
        else{
        System.out.println("The day that you have choosen is " +Date);
        }
        

        //decoration
        System.out.println("Would you like the Delicous- Catering to decorate the venue? ");
        System.out.println("The answer must be Yes or No!");
        String decoration = sc.nextLine();

        //if statement that will ask fot the theme if the client said yes, but if it said no it move to date
       if (decoration == "Yes"){
        
        System.out.println("Enter the theme");
        String theme = sc.nextLine();

       }
       else if (decoration == "NO" ){
        System.out.println("Thank you for answer");
       } 
       else {
        System.out.println("You have entered incorrect answer, your answer must be 'no' or 'yes'");
       }
        
    
        System.out.println("Enter Vanue Address");
        String Address = sc.nextLine();

        System.out.println("Enter Number of people:");
        int People = sc.nextInt();

        System.out.println("Enter Number of adults to cater for:");
        String adults= sc.nextLine();

        System.out.println("Enter Number of Kids to cater for:");
        String Kids= sc.nextLine();

        System.out.println("Type of food for adults: 'chickenMeals', 'steakMeals', 'gammonRoastMeals', 'pastaMeals', 'soupMeals',lobsterBisqueMeals;");
        String adultsFood = sc.nextLine();
        
        
        System.out.println("Type of food for kids: 'hotDogMeals', 'chickenburgerMeals', 'beefBurgerMeals', 'fishChipsMeals', 'pizzaMeals','pieMeals' ");
        String KidsFood = sc.nextLine();
       

        //output
        System.out.println("The reciept");
        customer ct = new customer(customerID, null, customerName, customerSurname, customerPhoneNumber);
        System.out.println("Client Name: " + customerName + 
        "Client Surname: " + customerSurname +
        " ID Number: " + customerID+
         " Phone number: "  + customerPhoneNumber );

         System.out.println( 
            "Addres: " + Address +
            "Number or adults: " + adults +
            "Number or kids: " + Kids +
            "AdultsFood: " + adultsFood +
            "KidsFood: " + KidsFood );

         
        System.out.println(" Type of Event:  " + eventType + 
        "Date or the event: "+ Date +
         "Decor:" + decoration+
         "The overall total for the event is :" +date.discountCheck(People, null));

         System.out.println("Enter the amount you would like to deposit: ");
         Float customerPaid =sc.nextFloat();

         if(date.processConfirmationPayment(Date, customerPaid, null)){
            System.out.println("Payment successful"); 
         }else{
            System.out.println("Payment was not successful, please fix the date the booking must be 15 days before the event day "); 
            System.out.println("The payment must be 15% of the ovarall cost"); 
            Date =sc.nextLine();
            customerPaid =sc.nextFloat();

         }

         
        //making changes
        System.out.println("would you like to make changes:  ");
        String ans =sc.nextLine();
        if (ans == "Yes") {

            boolean exit = false;
            do{

            System.out.println("Enter what you would like to change:  ");
            System.out.println("================================================");
            System.out.println("1. Name");
            System.out.println("2. Surname");
            System.out.println("3. ID");
            System.out.println("4. Phone number");
            System.out.println("5. Event");
            System.out.println("6. Date");
            System.out.println("7. Decorations");
            System.out.println("8. Address");
            System.out.println("9. Number of adults");
            System.out.println("10. Number of kids");
            System.out.println("11. Adults food");
            System.out.println("12. Kids food");
            System.out.println("13. Exit"); 

            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                System.out.println("Enter your Name");
                customerName = sc.nextLine();
                  break;
                case 2:
                System.out.println("Enter your Surname");
                customerSurname = sc.nextLine();
                  break;
                case 3:
                System.out.println("Enter your IdNumber");
                customerID= sc.nextInt();
                  break;
                case 4:
                System.out.println("Enter your PhoneNumber");
                customerPhoneNumber= sc.nextLine();
                  break;
                case 5:
                System.out.println(" Enter the type of event :  'Wedding','Birthday parties', ' baptism', 'Year-end function'");
                eventType = sc.nextLine();
                  break;
                case 6:
                System.out.println("Enter the Date  of the event: (DD-MM-YYYY-HR-MIN-S) ");
                Date = sc.nextLine();
        
                //call a class from the BusinessLayer and Declare it object
                Logic date2 = new Logic();
                //looks like there is only place for one date in logic layer, how to overwrite?

                        if(date.oneBookingDayCheck(Date)) 
                {
                    System.out.println("That day is already booked, Please enter another Date:");
                    Date = sc.nextLine();
                }
                else{
                System.out.println("The day that you have choosen is " +Date);
                }
                  break;
                case 7:
                System.out.println("Would you like the Delicous- Catering to decorate the venue? ");
                System.out.println("The answer must be Yes or No!");
                decoration = sc.nextLine();
        
                //if statement that will ask fot the theme if the client said yes, but if it said no it move to date
               if (decoration == "Yes"){
                
                System.out.println("Enter the theme");
                String theme = sc.nextLine();
                //theme doesnt know where he should be
        
               }
               else if (decoration == "NO" ){
                System.out.println("Thank you for answer");
               } 
               else {
                System.out.println("You have entered incorrect answer, your answer must be 'no' or 'yes'");
               }
                  break;
                case 8:
                System.out.println("Enter Venue Address");
                Address = sc.nextLine();
                  break;
                case 9:
                System.out.println("Enter Number of adults to cater for:");
                adults= sc.nextLine();
                  break;
                case 10:
                System.out.println("Enter Number of Kids to cater for:");
                Kids= sc.nextLine();
                  break;
                case 11:
                System.out.println("Type of food for adults: 'chickenMeals', 'steakMeals', 'gammonRoastMeals', 'pastaMeals', 'soupMeals',lobsterBisqueMeals;");
                adultsFood = sc.nextLine();
                  break;
                case 12:
                System.out.println("Type of food for kids: 'hotDogMeals', 'chickenburgerMeals', 'beefBurgerMeals', 'fishChipsMeals', 'pizzaMeals','pieMeals' ");
                KidsFood = sc.nextLine();
                  break;
                case 13:
                exit = true;
                  break;
              }
            }
            while (exit == false);
            
            /*changes enumVar = new changes.NAME;
            MChanges GC = GetGC(enumVar);
            System.out.println(enumVar);
            GC.Render();*/

       
        }
       else if (ans == "no") {
        System.out.println("Thank you for trusting us with your event, you will recieve the comfimation message on yor phone within 24hrs ");
       } else {
        System.out.println(" Please enter 'Yes' or 'No'"); 
        ans =sc.nextLine();
       }
        
        sc.close();
        
    }
}
    
