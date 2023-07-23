//Alec Urbany
//CS1400
//Assignment 3
//9/28/21

//This is where the magic begins
import javax.swing.JOptionPane;

public class TaskB 
{
    public static void main(String[] args)
    {
        //Setting the String and integer
        String music;
        Integer musicnum;

        //Get how much music was purchased
        music = JOptionPane.showInputDialog
        ("                       Thank you for choosing Crowdsurfers Music."+
        "\nAs a rewards member, you are eligible for up to 100 points per month." +
        "\n   Please input how many music tracks you've purchased this month.");
        
        // Turn the string into an integer
        musicnum = Integer.parseInt(music);

        //Bless the existence of switch statements
        
        switch (musicnum)
        {
        case 0:
            JOptionPane.showMessageDialog (null,"You have earned 0 points.");
            break;

        case 1:
            JOptionPane.showMessageDialog (null,"You have earned 10 points.");
            break;

        case 2:
            JOptionPane.showMessageDialog (null,"You have earned 30 points.");
            break;

        case 3:
             JOptionPane.showMessageDialog (null,"You have earned 60 points.");
             break;

        case 4:
            JOptionPane.showMessageDialog (null,"You have earned 100 points!");
            break;
        default:
            JOptionPane.showMessageDialog (null,"You have earned 100 points!");
            break;
        }


    }
}
