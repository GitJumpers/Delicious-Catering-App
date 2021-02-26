package BusinessLogicLayer;

import java.text.SimpleDateFormat;
import java.util.*;

public class Logic 
{
    //class's
    
    
    //variables



    //methods
    //setDate format
    public String DateFormat(int day,int month,int year)
    {
        String newDate;
        //DD-MM-YYYY
        newDate = day + "-" + month + "-" + year;
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

        if (dateDiff >= 15 && paidAmount >= amountOutstanding) {
            confirmationFlag = true;
        }

        return confirmationFlag;
    }

    
    //If the total number of people is above 40 there is a 15% discount from the calculated total adult's meal price.
    //The client can update the selected food menu before booking confirmation.
    //The client must be able to register into the system with required details such as name, surname and phone number etc.


    /* Booking Questions */
    //Type of event?
    //Event date and time?
    //Event venue address?
    //The total number of people?
    //Food- selection from the menu
    //Any decorations? If the answer is yes ask additional questions.

    /* Ending logic */
    //Miss. Raheal should be able to see all her bookings,
    //see all confirmed/non confirmed bookings
    //proposed system must generate a booking number so the client can check the status of the booking or can update the menu.
    //The system must send a notification to the client once the booking is confirmed by Miss. Rachael.
    //notification if the client makes any changes in the order

    /* extra features */
    //show available dates for customers
}