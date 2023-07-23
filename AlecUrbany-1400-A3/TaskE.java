//Alec Urbany
//CS1400
//Assignment 3
//9/29/21

public class TaskE 
{
        public static void main(String[] args)
    {
        //Creating the initial loop. This loop will repeat once it's inside is finished repeating
        //This dictates how many "rows" there will be
        for (int shrug = 6; shrug > 0; shrug--)
        {
            System.out.print(":)");
            //Creating the inside, this dictates how many "columns" there will be 
            for (int shrug2 = 6; shrug2 > shrug; shrug2--)
            {
                //This pattern will duplicate 5 times, then 4, then 3, etc
                System.out.print(" ");
            
            }
            //This is to create the next line for the pattern to repeat again.
            System.out.println(":)");
        }
    }
}
