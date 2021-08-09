package aug5;

public class ItemList implements Comparable<ItemList>
{
	private String itemname;
	private double cost;
	private int quantity;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity2) {
		quantity = quantity2;
	}
	
	public ItemList(String itemname, double cost, int quantity2) {
		super();
		this.itemname = itemname;
		this.cost = cost;
		quantity = quantity2;
		
	}
	@Override
	public int compareTo(ItemList arg0) {
	    if(	this.itemname==arg0.itemname)
	    	return 2;
	    else
	    	return -2;
	}
public void printStatement() {
		
		System.out.printf("  %8s %5.2f %6d %10.2f\n",itemname,cost,quantity,cost*quantity);

	}
	

}
