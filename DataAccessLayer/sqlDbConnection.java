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
    //Creating method to view bookings
    public ArrayList<String> viewConfirmedBookings() {     
        //Creating connection string
        String connectionUrl = "jdbc:sqlserver://(local).database.windows.net:1433; "
        + "database=DeliciousCateringDB; "
        + "user=gitjumpers@(local); "
        + "password=GIT!@#git123; ";

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
        String connectionUrl = "jdbc:sqlserver://(local).database.windows.net:1433; "
        + "database=DeliciousCateringDB; "
        + "user=gitjumpers@(local); "
        + "password=GIT!@#git123; ";
        
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

    //Method to view cutomers

}
