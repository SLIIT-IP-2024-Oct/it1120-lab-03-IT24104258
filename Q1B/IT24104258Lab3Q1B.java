import java.util.Scanner;
public class IT24104258Lab3Q1B {
	public static void main (String[]args){
		// Defining the variables
		double pricePerkg,quantity,totalAmount,Discount_amount, Discount;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg rice: ");
		pricePerkg= input.nextDouble();
		
		
		System.out.print("Enter the number of kg you want to buy: ");
		quantity=input.nextDouble();
		
		totalAmount= pricePerkg * quantity;
		
		System.out.println("The total amount is: " + totalAmount);
		
		Discount = 0.10;
		
		Discount_amount = totalAmount*Discount;
		
		System.out.println("The Discounted amount : " + Discount_amount);
		
		
	
	



	}
}