import java.util.Scanner;
public class Turing {

    public static void main(String[] args) {
        System.out.println("Welcome to Turing!");
        System.out.println("*************************");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        return;   
    }
        




}