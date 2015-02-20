// Timothy Berrill
// CSE02 lab 05 (Space Exploration)
// 2/20/15
// This program will pick a randomly generated number from 2000 to 2010, it will then
// output significant advances in space exploration from 2000 to the year randomly selected.
// If there is no event listed for that year it will print out N/A

public class SpaceExploration{//standard class needed in all java program
    public static void main(String[] args){//main method for the program
    
    int randYear=(int)(Math.floor((Math.random()*11))+2000);//create random number from 1 to ten then add to 2000 to get the year
    //this will create a random year ranging from 2001 to 2010
    System.out.println("Here is the timeline of space exploration events from 2000 to "+randYear);//print out the random year for the user
    switch(randYear){//start a switch with the random year as the input
    
    //The switch will start at 2010, and then fall through all the way to 2000. This way it will show
    //every event from the random year chosen until 2000.
    
    case 2010://if the year = 2010
        System.out.println("2010: SpaceX sucessfully sends spacecraft in to orbit and back.");//event for 2010 printed on new line
    case 2009://if the year = 2009
        System.out.println("2009: N/A");//no event for this year
    case 2008://if the year = 2008
        System.out.println("2008: Kepler launched to study deep space.");//event for 2008 printed on new line
    case 2007://if the year = 2007
        System.out.println("2007: N/A");//no event for this year
    case 2006://if the year = 2006
        System.out.println("2006: Spacecraft returns with collections from comet.");//event for 2006 printed on new line
    case 2005://if the year = 2005
        System.out.println("2005: Spacecraft collides with comet.");//event for 2005 printed on new line
    case 2004://if the year = 2004
        System.out.println("2004: N/A");//no event for this year
    case 2003://if the year = 2003
        System.out.println("2003: Largest infrared telescope released.");//event for 2003 printed on new line
    case 2002://if the year = 2002
        System.out.println("2002: N/A");//no event for this year
    case 2001://if the year = 2001
        System.out.println("2001: First spacecraft lands on asteroid.");//event for 2001
    default://the year 2000 will be on each one
        System.out.println("2000: First spacecraft orbits an asteroid.");//event for 2000 printed out no matter what
        break;//get out of the switch
    
    }//end switch for random year
    
    }//end main method
}//End main class