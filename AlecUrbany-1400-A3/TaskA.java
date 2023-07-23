//Alec Urbany
//CS1400
//Assignment 3
//9/28/21

//This is where the magic begins
import java.util.Scanner;

public class TaskA 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter an integer");
        
        int number = keyboard.nextInt();
        
        System.out.println("The number is now " + (number*2));
    }
}
