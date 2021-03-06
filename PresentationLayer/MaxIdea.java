package PresentationLayer;

import BusinessLogicLayer.*;
import DataAccessLayer.sqlDbConnection;


import javax.swing.text.ChangedCharSetException;
import javax.swing.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
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
        

        //methods

        WelcomeMsg(); //start of program
        //customer client; //gets Initial customer info
        // logicController.storeCustomer(client); /* uncomment when method is fixed */
        //event eventObjInfo; //gets Initial event info
        // logicController.storeEvent(eventObjInfo);

        //make this a method
        
            boolean loopEnd3 = false;

            
            do
            {
            System.out.println("Menu: ");
            System.out.println("================================================");
            System.out.println("1. Make a new booking");
            System.out.println("2. Edit a booking");
            System.out.println("3. Check confermation status");
            System.out.println("4. Make a payment");             
            System.out.println("5. Exit");
            int choose = SC.nextInt(); 

                switch (choose) 
                {
                    case 1:
                    customer client = getCustomerInfo();
                    event eventInfo = getEventInfo();
                        break;
                    case 2:
                    changes();
                        break;
                    case 3:
                    Confermation();
                        break;
                    case 4:
                    Payment();
                        break;
                    case 5:
                    loopEnd3 = true;
                        break;

                    default:
                        break;
                }
            } while (loopEnd3 != true);




        

        
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

    static String dateConfirm() throws SQLException
    {
        //classes
        SC = new Scanner(System.in);
        Logic LC = new Logic();
        //vars
        boolean dateConfirmFlag = false;
        String newDate = getFunctionDate();
        // boolean oneDayCheck = LC.oneBookingDayCheck(newDate);            /* This checks for One booking a day VERY IMPORTANT!!!! */
        // //method
        // while (oneDayCheck == false) 
        // {
        //     newDate = getFunctionDate();
        //     oneDayCheck = LC.oneBookingDayCheck(newDate);
        // }
        
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

    static event getEventInfo() throws SQLException
    {
        //classes
        Logic LC = new Logic();
        SC = new Scanner(System.in);
        //vars
        boolean ThemeFlag = false;
        boolean DecorationFlag = false;
        boolean loopEnd = false;
        boolean loopEnd2 = false;
        
        //method
        String formatDate = dateConfirm();

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
            System.out.println("Do you have decorations? Y or N");
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


        //process adultFood values
        System.out.println("Number of chicken meals: ");
        int ChickenMeals = SC.nextInt();
        System.out.println("Number of Steak Meals: ");
        int SteakMeals = SC.nextInt();
        System.out.println("Number of GammonRoast Meals: ");
        int GammonRoastMeals = SC.nextInt();
        System.out.println("Number of Pasta Meals: ");
        int PastaMeals = SC.nextInt();
        System.out.println("Number of Soup Meals: ");
        int SoupMeals = SC.nextInt();
        System.out.println("Number of LobsterBisque Meals: ");
        int LobsterBisqueMeals = SC.nextInt();

        adultFood numberOfAdultMeals = new adultFood(ChickenMeals, SteakMeals, GammonRoastMeals, PastaMeals, SoupMeals, LobsterBisqueMeals);

        adultFood adultMealCost = LC.getAdultMealValues(numberOfAdultMeals);


        //process childFood values
        System.out.println("Number of HotDog Meals: ");
        int HotDogMeals = SC.nextInt();
        System.out.println("Number of Chickenburger Meals: ");
        int ChickenburgerMeals = SC.nextInt();
        System.out.println("Number of BeefBurger Meals: ");
        int BeefBurgerMeals = SC.nextInt();
        System.out.println("Number of FishChips Meals: ");
        int FishChipsMeals = SC.nextInt();
        System.out.println("Number of Pizza Meals: ");
        int PizzaMeals = SC.nextInt();
        System.out.println("Number of Pie Meals: ");
        int PieMeals = SC.nextInt();

        childFood numberOfChildMeals = new childFood(HotDogMeals, ChickenburgerMeals, BeefBurgerMeals, FishChipsMeals, PizzaMeals, PieMeals);

        childFood childMealCost = LC.getChildMealValues(numberOfChildMeals);
        //final calculation
        Float EventCost = LC.calculateEventCosts(EventNumberOfPeople, adultMealCost, childMealCost);



        event eventInfo = new event(formatDate, EventName, EventType, EventVenue, EventNumberOfPeople, EventCost, ThemeFlag, Theme, DecorationFlag, DecorationDetails);
        return eventInfo;
        



    }

    // public adultFood(int ChickenMeals, int SteakMeals, int GammonRoastMeals, int PastaMeals, int SoupMeals, int LobsterBisqueMeals)
    // {
    //     this.chickenMeals = ChickenMeals;
    //     this.steakMeals = SteakMeals;
    //     this.gammonRoastMeals = GammonRoastMeals;
    //     this.pastaMeals = PastaMeals;
    //     this.soupMeals = SoupMeals;
    //     this.lobsterBisqueMeals = LobsterBisqueMeals;
    // }

    static void menu(customer client, event eventInfo) throws SQLException{
            SC = new Scanner(System.in);
            boolean loopEnd3 = false;

            
            do
            {
            System.out.println("Menu: ");
            System.out.println("================================================");
            System.out.println("1. Make a new booking");
            System.out.println("2. Edit a booking");
            System.out.println("3. Check confermation status");
            System.out.println("4. Make a payment");             
            System.out.println("5. Exit");
            int choose = SC.nextInt(); 

            switch (choose) {
                case 1:
                client = getCustomerInfo();
                eventInfo = getEventInfo();
                    break;
                case 2:
                //do you need another menu?
                    break;
                case 3:
                //dont think so
                    break;
                case 4:
                //make payment
                    break;
                case 5:
                loopEnd3 = true;
                    break;
                
                default:
                    break;
            }
            } while (loopEnd3 != true);
            
        

    }

    static void changes() throws SQLException{
        SC = new Scanner(System.in);
            boolean loopEnd4 = false;

            
            do
            {
            System.out.println("What do you want to change: ");
            System.out.println("================================================");
            System.out.println("1. First Name, Last Name or phone number");
            System.out.println("2. Function Date");
            System.out.println("3. Event info like, location, venue, decoration, theme or food");          
            System.out.println("4. Exit");
            System.out.println("5. Back"); 
            int choose = SC.nextInt(); 

            switch (choose) {
                case 1:
                getCustomerInfo();          
                    break;
                case 2:
                getFunctionDate();
                dateConfirm();
                    break;
                case 3:
                getEventInfo();
                    break;
                case 4:
                loopEnd4 = true;
                    break;
                case 5:
                
                    break;           
                default:
                    break;
            }
            } while (loopEnd4 != true);

    }

    static void Confermation(event info)
    {
        //event output constructor date
        Logic LC = new Logic();
        
        String eventDate; 

        SimpleDateFormat Date = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss");

        Date eventDateFormat = new Date();
           

    }

    static void Payment(event info)
    {
        //event output constructer paidAmount
        Logic LC = new Logic();

        Float paidAmount;
        Float amountOutstanding;

        Float halfOutStandingAmount = amountOutstanding * 0.5f;


    }


}

