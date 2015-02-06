// Timothy Berrill
// CSE 02
// February 2nd 2015
// Hw02, Arithmatic

public class Arithmetic{
    public static void main(String[] args){

//Initializing variables        
    // The number of socks and cost per sock in dollars
        int nSocks=3;
        double sockCost=2.58;
        
    // The number of glasses and cost per glass in dollars
        int nGlasses=6;
        double glassCost=2.29;
        
    // The number of boxes of envelopes and cost per box
        int nEnvelopes=1;
        double envelopeCost=3.25;
        
    // The tax percentage
        double taxPercent=0.06;
        
    // Calculate individual totals:
        double totalSockCost=nSocks*sockCost;// calculate the cost of the socks
        double totalGlassesCost=nGlasses*glassCost;// calculate the total cost of glasses
        double totalEnvelopeCost=nEnvelopes*envelopeCost;// calculate the total cost of envelopes
        
    // Calculate total pre/post tax:
        double totalCost=totalSockCost+totalGlassesCost+totalEnvelopeCost;// calculate total cost
        double totalCostTax=(totalCost);
        
// Printing the information
        //printing totals and costs for socks
        System.out.println("Socks:");
        System.out.println("Total number bought: "+nSocks);
        System.out.println("Cost per sock: $"+sockCost);
        System.out.println("Total cost of socks bought: $"+totalSockCost);
        double tax= (double) Math.round((totalSockCost*taxPercent)*100)/100;//Round and calculate tax
        System.out.println("Sales tax for item: $"+tax);
        
        //printing totals and costs for glasses
        System.out.println("\nGlasses:");
        System.out.println("Total number bought: "+nGlasses);
        System.out.println("Cost per Glass: $"+glassCost);
        System.out.println("Total cost of glasses bought: $"+totalGlassesCost);
        tax= (double) Math.round((totalGlassesCost*taxPercent)*100)/100;//Round and calculate tax
        System.out.println("Sales tax for item: $"+tax);
        
        //printing totals and costs for envelopes
        System.out.println("\nEnvelopes:");
        System.out.println("Total number bought: "+nEnvelopes);
        System.out.println("Cost per box of envelopes: $"+envelopeCost);
        System.out.println("Total cost of envelopes bought: $"+totalEnvelopeCost);
        tax= (double) Math.round((totalEnvelopeCost*taxPercent)*100)/100;//Round and calculate tax
        System.out.println("Sales tax for item: $"+tax+"0");
        
        //printing totals
        System.out.println("\nTotals:\nTotal cost of purchase before tax: $"+totalCost);
        
        // Calculate total tax and print
        double totalTax=(totalEnvelopeCost*taxPercent*100+totalGlassesCost*taxPercent*100+
        totalSockCost*taxPercent*100);//total tax times 100, to remove decimals
        totalTax=(int)totalTax;
        totalTax/=100;//to get rid of excess decimals
        System.out.println("Total tax on purchase: $"+totalTax);
        
        // Get total plus tax
        totalCostTax+=totalTax;
        //print out total with tax
        System.out.println("Total cost of purchase with tax: $"+totalCostTax);
    }
}