package BusinessLogicLayer;

import java.text.SimpleDateFormat;
import java.util.*;

public class Logic 
{
    //class's
    
    
    //variables



    //methods
    //setDate format
    public String DateFormat(int day,int month,int year, int hours, int minutes, int seconds)
    {
        String newDate;
        //DD-MM-YYYY
        newDate = day + "-" + month + "-" + year + " " + hours + "-" + minutes + "-" + seconds;;
        // SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
        // Date date = sdf.parse(newDate);
        return newDate;
    }


    /* Starting logic */
    //one booking a day. (checks dataBase if there is an event stored on the day.)
    public Boolean oneBookingDayCheck(String FormattedDate)
    {
        Boolean dateExists = false;

        if (/*insert database method*/ true) 
        {
            dateExists = true;
        }

        return dateExists;
    }

    //confirm the booking by 15 days prior to the event by giving 50 % of the calculated total price.
    public boolean processConfirmationpayment(String eventDate, Float paidAmount, Float amountOutstanding)
    {
        boolean confirmationFlag = false;
        int dateDiff = 2 - 1; /* subtrack event date from todaysDate */

        if (dateDiff >= 15 && paidAmount >= amountOutstanding) 
        {
            confirmationFlag = true;
        }

        return confirmationFlag;
    }
    

    
    //If the total number of people is above 40 there is a 15% discount from the calculated total adult's meal price.
    public float discountCheck(int amountOfPeople, Float eventCost)
    {
        float newMealCost = eventCost;
        float discountPercentage = 0.15f;

        if (amountOfPeople > 40)
        {
            newMealCost = newMealCost - (newMealCost * discountPercentage);
        }

        return newMealCost;
    }

    
    
    
    
    
    //The client can update the selected food menu before booking confirmation.
    //ask how food will be implemented????????
    /* Booking Questions */
    //Food- selection from the menu

    
    /* Ending logic */
    //Miss. Raheal should be able to see all her bookings,
    public ArrayList<String> viewAllBookings()
    {   
        ArrayList<String> allBookings = new ArrayList<String>(); /* replace with sql funciton */

        return allBookings;
    }

    //see all confirmed/non confirmed bookings
    public ArrayList<String> viewAllConfirmedCases()
    {
        ArrayList<String> viewAllCOnfirmed = new ArrayList<String>();  /* replace with sql funciton */

        return viewAllCOnfirmed;
    }

    public ArrayList<String> viewAllNonConfirmedCases()
    {
        ArrayList<String> viewAllNonCOnfirmed = new ArrayList<String>();  /* replace with sql funciton */

        return viewAllNonCOnfirmed;
    }

    

    //The system must send a notification to the client once the booking is confirmed by Miss. Rachael.
    /* Use this method to set the confirmation status on the customer object to true */
    public boolean ConfirmedByMissRachael(event PlannedEvent)
    {
        return true;
    }


    /* extra features */
    //show available dates for customers
}