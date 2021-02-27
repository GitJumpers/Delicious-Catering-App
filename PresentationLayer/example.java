package PresentationLayer;
import java.util.Scanner;
import java.util.Date;

public class example {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Delicious-Catering online booking system"); 
        System.out.println("---------------------------------------------------------"); 
        System.out.println(" "); 
        System.out.println("Please enter your first name"); 
        String Fname = scanner.nextLine();
        System.out.println("Please enter your last name"); 
        String Lname = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Hallo " + Fname + " " + Lname + ", what is the date of youre required catering service?");
        System.out.println(" ");

        //get date from user

        

        //date is availeble or date is already taken

        System.out.println("What kind of event will the catering service be required for");
        System.out.println("Example.... Babtism or a Wedding");
        String EventType = scanner.nextLine();
        System.out.println("Will the " + EventType + " need any decorating");

        String Answer = scanner.nextLine();
        if (Answer == "Yes") {
            
            //Ask Questions about decoration spesifications
            System.out.println(""); 

        } else {
            // System.out.println("OK"); 
        }

        
        


        




        scanner.close();
    }
}
