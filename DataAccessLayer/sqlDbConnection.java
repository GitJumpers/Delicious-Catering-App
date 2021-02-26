package DataAccessLayer;

//Adding necassery 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlDbConnection {
    //Creating connection method for DB
    public static void ConnectSqlDb() {
        //Creating connection string
        String connectionUrl = "jdbc:sqlserver://(local).database.windows.ne:1433; "
        + "database=DeliciousCateringDB; "
        + "user=gitjumpers@(local); "
        + "password=GIT!@#git123; ";

        
        try (Connection connection = DriverManager.getConnection(connectionUrl)){
            //code
        } 
        catch (SQLException e) {
            //TODO: handle exception
        }
    }
}
