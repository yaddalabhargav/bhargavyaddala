package aug5;




//Task 2 - Calculate total and print bill.
//          Item Name          Price    Qty.    Line Total
//          Line Total = Price * Qty.
//          Bill Total = Total of Line Total + 5% tax;
//          Items needs to be sorted based on Item Name.


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.*;
public class TotalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ItemList> bill = new ArrayList<>();
		bill.add(new ItemList("Samosa",5,10));
		bill.add(new ItemList("Dosa",6,2));
		bill.add(new ItemList("Jalebi",10,10));
		bill.add(new ItemList("Rosgulla",10,18));
		Collections.sort(bill);
		System.out.println("\n\n *********Welcome To ShivamDhaba********\n");
		System.out.println("  ItemName  "+"Price    "+"Qty  "+"LineTotal  ");
		for (ItemList transaction : bill) {
			transaction.printStatement();
		}
		System.out.println("                           .........");
		
		double s=bill.stream().map(e->e.getCost()*e.getQuantity()).reduce(0.0, (sum, element) -> sum + element);
		System.out.println("                      Total= "+s);
		System.out.println("                           .........");
		System.out.println("                  BillTotal= "+s*1.05+"\n "
				+ "          (Inclusive of 5% tax)");
		System.out.println("\n\n **************Keep Coming*****************");
		
	}
}