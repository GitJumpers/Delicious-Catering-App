package BusinessLogicLayer;

public class Logic 
{
    //class's
    
    
    //variables



    //methods



    /* Starting logic */
    //People order food from her for different events
    //If any client requests to decorate the venue she does that according to client’s recommended theme.
    //Once the booking has taken place she gives a booking number.
    public  customerEvent GetEventInfo(int CustomerID, int bookingNumber, String CustomerName, String CustomerSurname, String EventName, String eventType, Boolean themeFlag, String theme)
    {
        //get customer ID from database
        
        customerEvent eventInfo = new customerEvent(CustomerID, bookingNumber, CustomerName, CustomerSurname, EventName, eventType, themeFlag, theme);
        return eventInfo;
    }
    
    //one booking a day.

    //confirm the booking by 15 days prior to the event by giving 50 % of the calculated total price.
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