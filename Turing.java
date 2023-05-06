import java.util.Scanner;
public class Turing {

    public static void main(String[] args ) throws InterruptedException {

        System.out.println("        ##      ## ######## ##        ######   #######  ##     ## ########    ########  #######     ######## ##     ## ########  #### ##    ##  ######");   
        System.out.println("        ##  ##  ## ##       ##       ##    ## ##     ## ###   ### ##             ##    ##     ##       ##    ##     ## ##     ##  ##  ###   ## ##    ##");  
        System.out.println("        ##  ##  ## ##       ##       ##       ##     ## #### #### ##             ##    ##     ##       ##    ##     ## ##     ##  ##  ####  ## ##");        
        System.out.println("        ##  ##  ## ######   ##       ##       ##     ## ## ### ## ######         ##    ##     ##       ##    ##     ## ########   ##  ## ## ## ##   ####"); 
        System.out.println("        ##  ##  ## ##       ##       ##       ##     ## ##     ## ##             ##    ##     ##       ##    ##     ## ##   ##    ##  ##  #### ##    ##");  
        System.out.println("        ##  ##  ## ##       ##       ##    ## ##     ## ##     ## ##             ##    ##     ##       ##    ##     ## ##    ##   ##  ##   ### ##    ##");  
        System.out.println("        ###  ###  ######## ########  ######   #######  ##     ## ########       ##     #######        ##     #######  ##     ## #### ##    ##  ######");
        System.out.println("    *********************************************************************************************************************************************************");
        System.out.println("");
        System.out.println("");   
        System.out.println("");
        Thread.sleep(1500);

        System.out.println("Do you want to encrypt or decrypt a message?");
        System.out.println("1 - Encrypt");   
        System.out.println("2 - Decrypt");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Thread.sleep(1000);
        System.out.println("Enter Selection: ");
        int selection = myObj.nextInt();
       
        
        if (selection == 1) {
            Thread.sleep(750);
            System.out.println("Your selection is: encrypt");
        } else if (selection == 2) {
            Thread.sleep(750);
            System.out.println("Your selection is: decrypt");
        } else {
            Thread.sleep(750);
            System.out.println("Your selection is invalid");
        }
        Thread.sleep(2000);
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
   

        
        
        /*System.out.println("Welcome to Turing!");
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input*/
        
        return;   
    }
        




}