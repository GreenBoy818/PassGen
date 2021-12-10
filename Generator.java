import java.util.Scanner; // Used for the scanner command, can't work without this
public class Generator {
    public static void main(String[] args) { // The main method
        String welcome;
        Scanner input = new Scanner(System.in); // Making a new object of the Scanner class and storing the variable input in it. System.in is used
                                                // to read from the standard input stream of the program.
        System.out.println(CBlue + "Welcome to My Password Wizard :D" + ColReset);
        Welcome.DelayMsg(); // Calling the DelayMsg method from "Welcome Class"
        Menu(); // Calling the Menu Method
        // Use of the while loop for the main menu. Loop keeps on repeating until the user inputs a correct value to proceed forward or either to quit.
        while (input.hasNextLine()) {
            welcome = input.nextLine();
            if (welcome.equals("1")) { // IF Conditional Statement and acts accordingly to the user's input
                Coding.PassGen(); //Calling PassGen method from Coding class
            }
            else if (welcome.equals("2")) {
                System.out.println("Thank you for using the program. ");
                break; // Exits the loop and stops the program
            }
            else {
                System.out.println();
                System.out.println(CYellow + "Please select one of the available options"); //CYellow is called which makes the color of the text Yellow
                Menu(); // Calling the Menu method
            }
        }
    }
    // Creating a Menu Method which is displayed at the very beginning of the program
    public static void Menu() {
        System.out.println();
        System.out.println(CPurple + "Enter 1 - Password Generator"); //CPurple to make the color Purple of the text.
        System.out.println("Enter 2 - Quit");
        System.out.print("Enter Choice: " + ColReset); //ColReset resets the color of the console/text back to default.
    }
    //Color codes which I declared as final so their value would remain constant throughout
    //These are called throughout the program for making it a cool and unique effect of the console. Research was done upon it to get it.
    public static final String CRed = "\u001B[31m"; // Color Code for Red
    public static final String CBlue = "\033[0;34m"; // Color Code for Blue
    public static final String CGreen = "\033[0;32m";   // Color Code for Green
    public static final String CBoldRed = "\033[1;91m";   // Bold Color Code for Red
    public static final String CYellow = "\033[0;33m";  // Color code for Yellow
    public static final String CPurple = "\033[0;35m";  // Color Code for Purple
    public static final String ColReset = "\033[0m";  // To reset the color of the text/console back to normal
}