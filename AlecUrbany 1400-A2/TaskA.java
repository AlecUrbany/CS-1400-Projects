/*Alec Urbany
  CS1400*/

import java.util.Scanner;
public class TaskA {
    public static void main(String[] args)
    {
        //Butter Weights
        double ButterG;
        ButterG = 250;
        double ButterOZ;
        ButterOZ = 8;

        //Sugar Weights
        double SugarG;

        SugarG = 110;
        double SugarOZ;
        SugarOZ = 4;

        //Plain Flour Weights
        double PlainFlourG;
        PlainFlourG = 360;
        double PlainFlourOZ;
        PlainFlourOZ = 12;

        //Amount of Slices input Code
        Scanner s;
        s = new Scanner(System.in);
        String userInput;
        System.out.print("Enter Number of Slices to Make");
        double userDoubleInput = s.nextDouble();
        s.nextLine();


        /*This is the: "program 4
          that displays the g and oz of each
          ingredient needed for two different amounts of shortbread"*/

        //This is for Slices  in Grams
        System.out.println("For " + userDoubleInput + " Dozen Loaves, use " + (ButterG*userDoubleInput)/48 + " Grams of Butter");
        System.out.println("For " + userDoubleInput + " Dozen Loaves, use " + (SugarG*userDoubleInput)/48 + " Grams of Sugar");
        System.out.println("For " + userDoubleInput + " Dozen Loaves, use " + (PlainFlourG*userDoubleInput)/48 + " Grams of Plain Flour");
        //This is a Spacer
        System.out.println();
        // This is for Slices in OZ
        System.out.println("For " + userDoubleInput + " Dozen Loaves, use " + (ButterOZ*userDoubleInput)/48 + " Ounces of Butter");
        System.out.println("For " + userDoubleInput + " Dozen Loaves, use " + (SugarOZ*userDoubleInput)/48 + " Ounces of Sugar");
        System.out.println("For " + userDoubleInput + " Dozen Loaves, use " + (PlainFlourOZ*userDoubleInput)/48 + " Ounces of Plain Flour");
        
    }
}
