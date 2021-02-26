package BusinessLogicLayer;

public class event 
{
    //client id
    int customerID;
    //Type of event?
    //Event date and time?
    //Event venue address?
    //The total number of people?
    
    int eventID;
    String eventDate;
    String eventName;
    String eventType;
    String eventVenue;
    int eventNumberOfPeople;
    Float eventCost;

    //Any decorations? If the answer is yes ask additional questions.
    Boolean decorationFlag;
    String decorationDetails;

    //If any client requests to decorate the venue she does that according to client’s recommended theme.
    Boolean themeFlag;
    String theme;

    public event(int CustomerID, int EventID, String EventName, String EventType,String EventVenue, int EventNumberOfPeople, Float EventCost, Boolean ThemeFlag, String Theme)
    {
        this.customerID = CustomerID;
        this.eventID = EventID;
        this.eventName = EventName;
        this.eventType = EventType;
        this.eventVenue = EventVenue;
        this.eventNumberOfPeople = EventNumberOfPeople;
        this.eventCost = EventCost;
        this.themeFlag = ThemeFlag;
        this.theme = Theme;
    }
}
