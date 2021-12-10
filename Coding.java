import java.util.Scanner; // Used for the scanner command, can't work without this
//Creation of Coding class

public class Coding {
    //Initializing of Variables
    String Lowercase = "abcdefghijklmnopqrstuvwxyz";
    String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String SpecialChar= "!@#$%^&*()_+-=";

    public static void PassGen() {
        Scanner input = new Scanner(System.in); //Making a new object of Scanner class
        //Declearing Variables Lengthcheck and Redirect as boolean and initializing their values.
        boolean LengthCheck = true;
        boolean Redirect = true;
        int digits = 0; //Declaring digits as 0 and as an integer
        String Redirecter;
        Coding pass = new Coding(); //Making a pass object from this class to call it later on
        Generator Color = new Generator(); //Making a Color object from Generator class
        String password = "";
        System.out.println();
        System.out.println(Color.CGreen + "Hi, welcome to the Password Generator :)");
        // Using a while loop to check the user's input length for the desired length of password
        while (LengthCheck == true) { //This loop will work whilst Lengthcheck is equal to true
            System.out.print(Color.CGreen + "Please enter the length of the password: " + Color.ColReset); //Printing out the text. Color.CGreen makes the text green and Color.ColReset resets the console back to default color
            if (input.hasNextInt()) { //Use of an IF conditional statement. ".hasNextInt" if the input taken is an integer it would work otherwise would ask to input it again
                digits = input.nextInt(); //User's input value is stored in digits
                if (digits >= 7) { //Checks if length is greater than or equal to 7, it displays that the length is Strong and breaks the loop
                    System.out.println();
                    System.out.println("Strong Strength, good choice! :D");
                    LengthCheck = false; //Declaring Lengthcheck to false
                    break; //Exits the loop and goes to the calculation of the password part
                } else if (digits == 6 || digits == 5 || digits == 4) { //If the user's input length is equal to 6 or 5 or 4 then it displays "Medium Strength" and asks if the user wants to enter the length again or not
                    System.out.println();
                    System.out.println("Medium Strength, would you like to re-enter the length? ");
                    while (Redirect != false) { //This while loop will keep on working whilst the value of Redirect is not equal to false
                        Redirecter = input.nextLine(); //Takes the input from the user
                        if (Redirecter.equals("Y") || Redirecter.equals("y")) { //Checks for case sensitive if the user inputs "Y" or "y", so that it accepts both
                            break; //Exits the loops and goes on to the calculation path
                        } else if (Redirecter.equals("N") || Redirecter.equals("n")) {
                            //If user selects "N" or "n" it would ask the user to re-enter the length
                            LengthCheck = false;
                            Redirect = false;
                        } else {
                            System.out.println(Color.CYellow + "Please select either Y or N" + Color.ColReset);
                        }
                    }
                } else if (digits == 3 || digits == 2) { //If users input length is equal to 3 or 2 then displays Poor Strength and the same while loop is executed again
                    System.out.println();
                    System.out.println("Poor Strength, would you like to re-enter the length? ");
                    while (Redirect != false) {
                        Redirecter = input.nextLine();
                        if (Redirecter.equals("Y") || Redirecter.equals("y")) {
                            break;
                        } else if (Redirecter.equals("N") || Redirecter.equals("n")) {
                            LengthCheck = false;
                            Redirect = false;
                        } else {
                            System.out.println(Color.CYellow + "Please select either Y or N" + Color.ColReset);
                        }
                    }
                } else if (digits <= 1) { // If user's length is less than or equal to 1, it would ask the user to reenter the length, as a password cannot be of a single character
                    System.out.println();
                    System.out.println("Password cannot be generated for this length, please re-enter the length. ");
                    input.nextLine();
                }
            }
            else {
                System.out.println("Please enter positive numbers only.");
                input.nextLine();
            }
        }
        for (int i = 0; i < digits; i++) {
            int rand = (int) (4 * Math.random());
            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    rand = (int) (pass.Lowercase.length() * Math.random());
                    password += String.valueOf(pass.Lowercase.charAt(rand));
                    break;
                case 2:
                    rand = (int) (pass.Uppercase.length() * Math.random());
                    password += String.valueOf(pass.Uppercase.charAt(rand));
                    break;
                case 3:
                    rand = (int) (pass.SpecialChar.length() * Math.random());
                    password += String.valueOf(pass.SpecialChar.charAt(rand));
                    break;
            }
        }
        System.out.println(Color.CBlue + "Your password is: "+ Color.ColReset + Color.CRed + password + Color.ColReset);
        System.out.println("Hope you liked your new password!");
        Generator.Menu(); //To call the Menu method from Generator Class
    }
}
