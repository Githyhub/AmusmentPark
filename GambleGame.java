import java. lang. Math; 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GambleGame 
{
    private double balance;
   
    public GambleGame(double balance)
    {
        this.balance = balance;
        
    }
public double game() {
    int num = (int)((Math.random()*6) + 1);
    int guess = Integer.parseInt(JOptionPane.showInputDialog("Pick a number from 1 to 6"));
    double bet = Double.parseDouble(JOptionPane.showInputDialog("How much do you bet :/"));
    if (num == guess) {
        balance = balance + bet;
        JOptionPane.showMessageDialog(null, "You WON! Your Balance is now: " +balance );
        return balance;
    } else {
        balance = balance - bet;
        JOptionPane.showMessageDialog(null, "You lost! Your Balance is now: " +balance );
        return balance;
    }
}
}