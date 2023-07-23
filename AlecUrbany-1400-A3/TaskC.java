//Alec Urbany
//CS1400
//Assignment 3
//9/28/21

//This is where the magic begins
import javax.swing.JOptionPane;

public class TaskC 
{
    public static void main(String[] args)
    {
        //Setting the Strings and Integers
        //Runners
        String runnerOne;
        String runnerTwo;
        String runnerThree;

        //Times
        String One;
        String Two;
        String Three;

        Integer OneI;
        Integer TwoI;
        Integer ThreeI;

        

        //Now let's get the names and times of each runner
        runnerOne = JOptionPane.showInputDialog ("Please input the name of the runner 1");
        One = JOptionPane.showInputDialog ("Please input the time it took " + runnerOne + " to finish the race (in minutes)");

        runnerTwo = JOptionPane.showInputDialog ("Please input the name of the runner 2");
        Two = JOptionPane.showInputDialog ("Please input the time it took " + runnerTwo + " to finish the race (in minutes)");

        runnerThree = JOptionPane.showInputDialog ("Please input the name of the runner 3");
        Three = JOptionPane.showInputDialog ("Please input the time it took " + runnerThree + " to finish the race (in minutes)");

        //While we're at it, let's convert the Strings into Integers
        OneI = Integer.parseInt(One);
        TwoI = Integer.parseInt(Two);
        ThreeI = Integer.parseInt(Three);

        //Code for figuring out their order

        //This is so no negative time can exist
        if ((OneI < 0) & (TwoI < 0) & (ThreeI < 0))
        {
            JOptionPane.showMessageDialog (null, "Value less than 0 detected, please try again with a value greater than 0"); 
        }
        else if ((OneI > 0) & (TwoI > 0) & (ThreeI > 0))

            //Doing a lot of brute force 
            //this is for Runner 1 is faster than Runner 2, who is faster than Runner 3
            if ((OneI < TwoI) & (TwoI < ThreeI))
            {
                JOptionPane.showMessageDialog (null,"Coming in first is " + runnerOne + " with a time of " + OneI + 
                "\nComing in second is " + runnerTwo + " with a time of " + TwoI +
                "\nFinally, coming in third is " + runnerThree+ " with a time of " + ThreeI );  
            }

            //this is for Runner 2 is faster than Runner 1, who is faster than Runner 3
            else if((TwoI < OneI) & (OneI < ThreeI))
            {
                JOptionPane.showMessageDialog (null,"Coming in first is " + runnerTwo + " with a time of " + TwoI + 
                "\nComing in second is " + runnerOne + " with a time of " + OneI +
                "\nFinally, coming in third is " + runnerThree+ " with a time of " + ThreeI );  
            }

            //this is for Runner 3 is faster than Runner 1, who is faster than Runner 2
            else if((ThreeI < OneI) & (OneI < TwoI))
            {
                JOptionPane.showMessageDialog (null,"Coming in first is " + runnerThree + " with a time of " + ThreeI + 
                "\nComing in second is " + runnerOne + " with a time of " + OneI +
                "\nFinally, coming in third is " + runnerTwo+ " with a time of " + TwoI );  
            }

            //this is for Runner 1 is faster than Runner 3, who is faster than Runner 2
            else if((OneI < ThreeI) & (ThreeI < TwoI))
            {
                JOptionPane.showMessageDialog (null,"Coming in first is " + runnerOne + " with a time of " + OneI + 
                "\nComing in second is " + runnerThree + " with a time of " + ThreeI +
                "\nFinally, coming in third is " + runnerTwo+ " with a time of " + TwoI );  
            }

            //this is for Runner 2 is faster than Runner 3, who is faster than Runner 1
            else if((TwoI < ThreeI) & (ThreeI < OneI))
            {
                JOptionPane.showMessageDialog (null,"Coming in first is " + runnerTwo + " with a time of " + TwoI + 
                "\nComing in second is " + runnerThree + " with a time of " + ThreeI +
                "\nFinally, coming in third is " + runnerOne + " with a time of " + OneI );  
            } 
            //this is for Runner 3 is faster than Runner 2, who is faster than Runner 1
            else if((ThreeI < TwoI) & (TwoI < OneI))
            {       
                JOptionPane.showMessageDialog (null,"Coming in first is " + runnerThree + " with a time of " + ThreeI +
                "\nComing in second is " + runnerTwo + " with a time of " + TwoI +
                "\nFinally, coming in third is " + runnerOne+ " with a time of " + OneI ); 
            }
            System.exit (0);

    }
}