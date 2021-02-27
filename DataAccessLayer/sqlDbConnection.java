package DataAccessLayer;

//Adding necassery packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import BusinessLogicLayer.customer;

import java.sql.ResultSet;

public class sqlDbConnection {
    //Creating connection string constant
    private String connectionUrl = "jdbc:sqlserver://(local).database.windows.net:1433; "
    + "database=DeliciousCateringDB; "
    + "user=gitjumpers@(local); "
    + "password=GIT!@#git123; ";

    //Creating method to view bookings
    public ArrayList<String> viewConfirmedBookings() {     
        ResultSet rsResult = null;
        ArrayList<String> bookingsList= new ArrayList<String>();
        
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement()){
            //code
            String selectBookingSql = "SELECT * FROM tblBookings WHERE BookingConfirmed = 1";
            rsResult = statement.executeQuery(selectBookingSql);

            
            while (rsResult.next()) {
                //add values in ResultSet to ArrayList as an object type Bookings
                bookingsList.add(rsResult.getString(1) + "," + rsResult.getString(2) + "," + rsResult.getString(3)
                + "," + rsResult.getString(4));
            }
        } 
        catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }  
        
        
        return bookingsList;
    }

    //Creating method to insert customer information
    public void insertCustomer(int CustomerID, int BookingNumber, Float CustomerPaid, String CustomerName, String CustomerSurname,String CustomerPhoneNumber) {    
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement()){
            //SQL Insert statement
            String insertCustSql = "INSERT INTO tblBookings VALUES(" + CustomerID + "," + BookingNumber + "," + 
            CustomerPaid + "," + CustomerName + "," + CustomerSurname + "," + CustomerPhoneNumber +");";
            statement.executeUpdate(insertCustSql);

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }  
    }

    //Creating Method to view cutomers
    public ArrayList<String> viewCustomers() {     
        ResultSet rsResult = null;
        ArrayList<String> customerList= new ArrayList<String>();
        
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement()){
            //code
            String selectCustomerSql = "SELECT * FROM tblCustomers";
            rsResult = statement.executeQuery(selectCustomerSql);

            while (rsResult.next()) {
                //add values in ResultSet to ArrayList as an object type Bookings
                customerList.add(rsResult.getString(1) + "," + rsResult.getString(2) + "," + rsResult.getString(3)
                + "," + rsResult.getString(4) + "," + rsResult.getString(5) + "," + rsResult.getString(6));
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }  
        
        
        return customerList;
    }

    //Creating method to insert event information
    public void insertEvent(int CustomerID, int EventID, String EventName, String EventType,String EventVenue, int EventNumberOfPeople
    , Float EventCost, Boolean ConfirmationStatus, Boolean ThemeFlag, String Theme) {  

        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement()){
            //SQL Insert statement
            String insertEventSql = "INSERT INTO tblEvents VALUES(" + CustomerID + "," + EventID + "," + 
            EventName + "," + EventVenue + "," + EventNumberOfPeople + "," + EventNumberOfPeople + "," + EventCost
            + "," + ConfirmationStatus + "," + ThemeFlag + "," + Theme +");";
            statement.executeUpdate(insertEventSql);

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }  
    }

    
}
