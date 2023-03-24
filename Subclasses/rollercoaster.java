import java.time.LocalTime;
import javax.swing.JOptionPane;

public class rollercoaster extends Attraction
{
    //
    LocalTime currentTime = LocalTime.now();
    LocalTime riderTime =currentTime.plusHours((int)(getRiders()/getrideRate()));
    private int carts;
    private String railType;
    
    public rollercoaster(String Name, int rideCapacity, int riders, double ticketCost,
        double rideLength, double rideRate,double hourOpen,
        boolean open, int carts, String railType)
    {
    super(Name, rideCapacity, riders, ticketCost, rideLength, rideRate, 
            hourOpen, open);
        this.carts = carts;
        this.railType= railType;
    }

  
    public String rideCaculation()
    {
      return(" You have to wait at least " + getRiders()/getrideRate() + " more hours for " + getName() );
      
    }

    public void rideWait(){
        
        boolean alert = true;
        LocalTime time = LocalTime.of((int)getTime(), 0);
        
        while (alert){
            if (time.isAfter(LocalTime.now())){
                 JOptionPane.showMessageDialog(null, "....This ride is closed... seen by no staff atending it");
                 alert = false;
            }
            
            if (riderTime.compareTo(LocalTime.now())>0){
                JOptionPane.showMessageDialog(null, "waiting....");
            }
            
             int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (result != JOptionPane.YES_OPTION) {
                    alert=false;
                }   
        }
    }
}