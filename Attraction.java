public class Attraction {
    private String Name;
    private int rideCapacity;
    private int riders;
    private double ticketCost;
    private double rideLength;
    private double rideRate;
    private double hourOpen;
    private boolean open;
    private double balance;
    private String Parkname = "Mr.Yasskis budget friendly family fun";
    
   public Attraction(){
        Name="";
        rideCapacity=0;
        riders=0;
        ticketCost=0;
        rideLength=0;
        rideRate=0;
        hourOpen=0;
        open=true;
        balance = 0.0;
   }
   public Attraction(String Name, int rideCapacity, int riders, double ticketCost,double rideLength, double rideRate,double hourOpen,boolean open){
        this.Name=Name;
        this.rideCapacity = rideCapacity;
        this.riders = riders;
        this.ticketCost = ticketCost;
        this.rideLength = rideLength;
        this.rideRate = rideRate;
        this.hourOpen = hourOpen;
        this.open = open;
       
   }
    
    public boolean parkOpen(){
        if (open=true){
            return true;
        }
        else{
            return false;
        }
        
    }
        
    public String getParkName(){
            return Parkname;
        }
    
    
    public int waitTime(){
        return (int)(riders/rideRate);
    }
    
    public void discountTicket(double newTicket)
    {
        this.ticketCost = ticketCost - (ticketCost * newTicket);
    }
    
    public String getName(){
        return Name;
    }
    
      public int getRiders(){
        return riders;
    }
    
      public double getrideRate(){
        return rideRate;
    }
    
    public double getTime(){
       return hourOpen;
    }
    
    
    
    public String toString(){
        return ("Name of attraction: "+ Name + "\n"+
                "Ride Capacity: " + rideCapacity + "\n"+
                "Number of Riders: "+ riders +"\n"+
                "Ticket Cost: "+ ticketCost + "\n" +
                "Length of Ride: " + rideLength + "\n" +
                "Rate of Riders Riding:" + rideRate + "\n"+ 
                "Hours Open: " + hourOpen + 
                "Location");
    }
    
    public String BlurbSup(){
      return( "You walk towards panel of text near the entrance of "+ Name + ". \n"+
                "It seems each cart could fit  " + rideCapacity + " people per cart. \n"+
                "There seems to be an average of  "+ riders +" riders per hour for this ride. \n"+
                "Looking down at the panel the cost of one ride is "+ ticketCost + " $. \n" +
                "In bold bright red letters it state a " + rideLength + " minute ride time. \n" +
                "It seems like this ride can take in " + rideRate + " riders per hour. \n"+ 
                "Looking at the wait time there is also a time of activity for this ride from the parks opening to  " + hourOpen + " pm. \n");
                
    }
    public double getBalance()
    {
        return balance;
    }
    public double addBalance(double input)
    {
        return ( balance + input);
    }
    public double removeBalance(double input)
    {
        return balance - input;
    }
    
    
    
    
    
    
}