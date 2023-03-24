import javax.swing.JOptionPane;
public class AttractionTester {
     static String[] options = {"Casino", "Amusment park"};
     static String[] optionsTwo = {"wetRide", "rollercoaster", "show"};

     

    public static void main(String[] args) {
        boolean cont = true;
        boolean loopOne = true;
        boolean isKicked = false;
        int tempUnit =0 ;
        while(cont==true){
            int x = JOptionPane.showOptionDialog(null, "Where are you, casino or amusment park?",
            "Click a button",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                switch (x){
                    case 0:
                        loopOne = true;

                        if(isKicked) {
                            JOptionPane.showMessageDialog(null, " banned lmao");
                            break;
                        }
                        else {
                            while (loopOne){
                                String input = JOptionPane.showInputDialog("What is your balance on your Casion card? ( round to the whole value ) ");
                                if (input.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, " you are broke and you get kicked out");
                                    loopOne = false;
                                    isKicked = true;
                                    break;
                                        }   
                                else {
                                    
                                    tempUnit = Integer.parseInt(input);
                                    GambleGame user = new GambleGame (tempUnit);
                                    user.game();
                                int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
                                    if (result != JOptionPane.YES_OPTION) {
                                            loopOne=false;
                                        }   

                                        }        
                                

                                }
                                    break;
                            }
                            
                    case 1:
                        amusmentPlay();
                            break;

                    default:
                        JOptionPane.showMessageDialog(null, "You hopp in your car and the casino and the amusment park fade out the distance.");
                        cont =false;
                            break;
                          
                       }
                    }
                 }
    
    
    
    public static void amusmentPlay(){
        boolean cont = true;
          
        while(cont==true){
            int x = JOptionPane.showOptionDialog(null, "Where are you wetRide , shows, or rollercoaster?",
                "Click a button",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsTwo, optionsTwo[0]);
            switch (x){
               case 0:
                    wetRide Splashy = new wetRide("splashy",8, 168, 2.0, 12.3, 500.0, 7.00, true, false, false );
                    Splashy.ride();
                    break;
           
                case 1:
                rollercoaster wildWacky  = new rollercoaster ("Willy's wacky ride", 28, 400, 25.5, 15.0, 500.0, 7.0, true, 12,"solo");
                JOptionPane.showMessageDialog(null, wildWacky.rideCaculation());

                    wildWacky.rideWait();
                    break;
                    
                case 2:
                    shows physicLab = new shows ("Yaskis show", 28, 400, 25.5, 15.0, 500.0, 7.0, false,200, false);
                    JOptionPane.showMessageDialog(null, physicLab.BlurbSup() + " "+   physicLab.getName() + "You go into the delapitaed tent and see a dicombobulated crowd, it seems like a very shotty show." + physicLab.perform());
                 
                       
                    break;
                
                
                default:
                    JOptionPane.showMessageDialog(null, "You decide too leave this very dinky park, bidding the dangerous coasters a good bye. And you return too the cross ways.");
                    cont = false;
                    break;
                          
                    }
        }
    }
    
   
    
}