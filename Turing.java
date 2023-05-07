import java.util.Scanner;
public class Turing {

    
    public static void main(String[] args ) throws InterruptedException {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        boolean selectionValid = false;
        while (selectionValid == false) {
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
            Scanner myObj = new Scanner(System.in);
            Thread.sleep(1000);
            System.out.println("Enter Selection: ");
            int selection = 0;
            
            if (myObj.hasNextInt()) {
		        selection = myObj.nextInt();
                if (selection == 1) {
                    selectionValid = true;
                    Thread.sleep(750);
                    System.out.println("Your selection is: Encrypt");
                    Thread.sleep(2000);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    Scanner scnr = new Scanner(System.in);  
                    System.out.println("Enter message: ");
                    String clearMessage = scnr.nextLine();
                    Thread.sleep(750);  
                    System.out.println("You entered: " + clearMessage);
                } else if (selection == 2) {
                    selectionValid = true;
                    Thread.sleep(750);
                    System.out.println("Your selection is: Decrypt");
                    Thread.sleep(2000);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    Scanner scnr = new Scanner(System.in);  
                    System.out.println("Enter message: ");
                    String encryptedMessage = scnr.nextLine();
                    Thread.sleep(750);  
                    System.out.println("You entered: " + encryptedMessage);
                } else {
                    Thread.sleep(750);
                    System.out.println("Your selection is invalid");
                    Thread.sleep(2000);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                }
            } else {
                Thread.sleep(750);
                System.out.println("Your selection is invalid");
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");  
                System.out.flush();
            }
		    
		       
             
            
        }
           
    }
}