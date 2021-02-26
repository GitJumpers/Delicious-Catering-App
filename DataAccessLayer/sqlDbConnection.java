package DataAccessLayer;

//Adding necassery packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.ResultSet;

public class sqlDbConnection {
    

    //Creating connection method for DB
    /*
    public static void ConnectSqlDb() {
        //Creating connection string
        String connectionUrl = "jdbc:sqlserver://(local).database.windows.net:1433; "
        + "database=DeliciousCateringDB; "
        + "user=gitjumpers@(local); "
        + "password=GIT!@#git123; ";

        ResultSet rsResult = null;
        
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement()){
            //code
            rsResult = statement.executeQuery(bookingsTable());
        } 
        catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    */

    //Creating method to view bookings
    public ArrayList<String> bookingsTable() {     
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
                bookingsList.add("");
            }
        } 
        catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }  
        
        
        return bookingsList;
    }
}
