// Timothy Berrill
// CSE 02
// January 30th 2015
// Lab 2, Cyclometer
// Simulating a cyclometer for two bike trips
// For given time elapsed and rotations of front tire for two trips output:
//      Minutes per trip
//      Number of counts
//      Distance of trip in miles
//      Combined distance of trips

public class Cyclometer{
  public static void main(String [] args){
      
// Time and counts      
	int secsTrip1=480;  // The time for trip #1 in seconds
	int secsTrip2=3220;  // The time for trip #2 in seconds
	int countsTrip1=1561;  // The counts of the front tire for trip #1
	int countsTrip2=9037; // The counts of the front tire for trip #2
	
// Given information
	double wheelDiameter=27.0,  // The wheel diameter
  	PI=3.14159, // Estimated value for pi
  	   feetPerMile=5280,  // Feet in one mile
  	   inchesPerFoot=12,   // Inches in one foot
  	   secondsPerMinute=60;  // Seconds in one minute
  	   
// Initialize varialbles for individual and total distances
	double distanceTrip1, distanceTrip2,totalDistance;

// Print how long trip one took in minutes and the number of counts
	System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
       	
// Print how long trip two took in minutes and the number of counts
	System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
       	
// Calculations for distances       	
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
    	
	distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
	
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        // Above gives distance for trip two in miles. Each count is a
        // rotation of the wheel traveling a diameter length times pi. 
        // Then converted from inches to miles
        
	totalDistance=distanceTrip1+distanceTrip2; // Calculates the total distance

// Print the individual and total distances
	System.out.println("Trip 1 was "+distanceTrip1+" miles"); // Trip one distance
	System.out.println("Trip 2 was "+distanceTrip2+" miles"); // Trip two distance
	System.out.println("The total distance was "+totalDistance+" miles"); // Total distance
  }
}
