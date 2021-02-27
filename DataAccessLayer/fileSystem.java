//File created by Sibahle Mayekiso
package DataAccessLayer;

//Importing of Libraries
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class fileSystem {
    //Creating method to store Customers to textfile
    public void storeCustomers() throws IOExeption{
        FileWriter writer = new FileWriter("Customers.txt");

        ArrayList<String> customerList= new ArrayList<String>();
        //Create an object of sqlDbConnection
        sqlDbConnection objCustomer = new sqlDbConnection();

        //Retrieves customer details within the db
        customerList = objCustomer.viewCustomers();

        for (String data: customerList) {
            writer.write(data);
        }    
        
        writer.close();
    }
}