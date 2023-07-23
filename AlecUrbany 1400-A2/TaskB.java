/*Alec Urbany
  CS1400*/

import javax.swing.JOptionPane;

public class TaskB 
{
    public static void main(String[] args)
    {
        //Setting the Strings.
        String party, bill;

        //Get Number of people in a party + turning a string into an integer.
        party =
        JOptionPane.showInputDialog("How many people in your party?");
        Double partnum = Double.parseDouble(party);
        
        //Get the bill of the party + turning a string into an integer.
        bill =
        JOptionPane.showInputDialog("What was the total bill amount before tax?");
        Double billnum = Double.parseDouble(bill);


        //Misc Fees and Total.
        Double tax;
        tax = .0725;

        Double tip;
        tip =.20;

        Double total;
        total = (billnum + billnum*tax + billnum*tip);

        //List of numbers used in calculations, as well as calculations to find prices.

        JOptionPane.showMessageDialog
        (null, "Party Size = " + party +
        "\nBill Amount = " + bill +
        "\nTax = 7.25%" +
        "\nTip = 20%" + 
        "\nThe Total After Tax = $" + total +
        "\n" +
        "\nFor a party of " + party + " who spent $" + total + 
        "\nEach person needs to pay: $" + ((total)/partnum));
        
       //So the computer doesn't harass you with infinite prompts.
        System.exit(0);
    }
}
