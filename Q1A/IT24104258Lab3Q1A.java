import java.util.Scanner;

public class IT24104258Lab3Q1A{
	public static void main (String[]args){
		double pricePerkg,quantity,totalAmount;
		Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg rice:");
	pricePerkg = input.nextDouble();
	
	System.out.print ("Enter the number of KG you want to buy :");
	quantity = input.nextDouble();
	
	totalAmount = pricePerkg * quantity;
	
	System.out.println();
	System.out.println("The total amount is :" + totalAmount);
	
	
	
	}
}	