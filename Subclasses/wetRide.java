import javax.swing.JOptionPane;

public class wetRide extends Attraction
{
    //alex
    private boolean chlorinated;
    private boolean needTube;
    
    public wetRide(String Name, int rideCapacity, int riders, double ticketCost,
        double rideLength, double rideRate,double hourOpen,
        boolean open,boolean chlorinated, boolean needTube )
    {
        super(Name, rideCapacity, riders, ticketCost, rideLength, rideRate, 
            hourOpen, open);
               
        this.needTube = needTube;
        this.chlorinated = chlorinated;
        
    }
    
    public String getName(){
        return super.getName();
    }
    
    public void ride (){
        String name = getName();
        JOptionPane.showMessageDialog(null, "You ride the " + name + ". You get infintely splashed. ");
      
    }
    
public void Blurb(){
    JOptionPane.showMessageDialog(null, "You are in the Water Park Area of the delapidated park of "+ super.getParkName() + " it reeks of chlorine! ");
    JOptionPane.showMessageDialog(null, super.BlurbSup());
}
        
public String toString(){
    super.toString();
    return( "Has Chlorine: "+ chlorinated + "\n"+
    "Needs Tube: " + needTube + "\n");
    
}
}