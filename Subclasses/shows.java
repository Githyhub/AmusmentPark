public class shows extends Attraction
{
    private int performers;
    private boolean luckyTicket;
    private final double discount = 0.2;
    
   public shows(String Name, int rideCapacity, int riders, double ticketCost,
        double rideLength, double rideRate,double hourOpen,
        boolean open, int performers, boolean luckyTicket)
    {
        super(Name, rideCapacity, riders, ticketCost, rideLength, rideRate, 
            hourOpen, open);
        this.performers = performers;
        this.luckyTicket = luckyTicket;
        checkDiscount();
    }
    
    private void checkDiscount()
    {
        if (this.luckyTicket || (int) Math.random() * 100 == 69)
        {
            super.discountTicket(discount);
        }
    }
    
    public String perform()
    {
        return " "+  super.getName() + " is happening! \nThe audience is mildly pleased!";
    }
}