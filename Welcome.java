public class Welcome {
    // This class is to make the starting interface of the program unique by displaying the characters, charcter by character to make it look as
    // If it's actually loading. It looks cool and research was done upon it for the Thread.Sleep
    // Creation of the method Delay
    public static void Delay() {
        try { // try is to test for errors while the block of code is being executed. Which in this case is "Thread.sleep"
            Thread.sleep(600); // Thread.sleep is used to pause the current execution of code for the described amount of milliseconds
        } catch (InterruptedException ex) { //InterruptedException is thrown when a thread is interrupted while it's waiting, in other words
                                            // Thread.sleep won't work without InterruptedException
        }
    }
    // Creation of DelayMsg Method
    public static void DelayMsg(){
        Generator Color = new Generator(); //Creation of Color object from Generator class
        Delay(); //Calling of Delay Method
        System.out.print(Color.CRed + "L"); //Printing each letter and using Color.CRed to call out the color variable to make it print in red color
        //Delay method is called so that the first letter "L" is displayed then before displaying "o" it waits for 600 milliseconds and then displays "o"
        //Same goes for every other letter till it's done displaying
        Delay();
        System.out.print(Color.CRed + "o");
        Delay();
        System.out.print(Color.CRed + "a");
        Delay();
        System.out.print(Color.CRed + "d");
        Delay();
        System.out.print(Color.CRed + "i");
        Delay();
        System.out.print(Color.CRed + "n");
        Delay();
        System.out.print(Color.CRed + "g");
        Delay();
        System.out.print(Color.CBoldRed + ".");
        Delay();
        System.out.print(Color.CBoldRed + ".");
        Delay();
        System.out.print(Color.CBoldRed + "." + Color.ColReset); //Color.ColReset is called to reset the color of the console back to normal
        //
    }
}