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
        
        //get date from user

        




        scanner.close();
    }
}
