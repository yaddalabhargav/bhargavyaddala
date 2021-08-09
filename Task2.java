package aug3;
/*2)Revisit on Lists and work with Comparable and Comparator using both Java7 and Java8 style(lambda(->)) for
Product(id,name,cost,rating,quantity), perform sorting for different options like byname,bycost, byrating and cost and byquantity.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Task2 {

	private static final int List = 0;

	public static void main(String[] args) {
		List<Laptop> lap = new ArrayList<>();
		lap.add(new Laptop(2,300,"a",8.9,1));
		lap.add(new Laptop(3,400,"b",7.8,2));
		lap.add(new Laptop(9,900,"j",9.9,3));
		lap.add(new Laptop(5,600,"d",4.9,8));
		lap.add(new Laptop(8,700,"d",4.9,8));
		Collections.sort(lap);
		Collections.sort(lap,(Laptop l2,Laptop l3)->{
			if(l2.getCost()>l3.getCost())
				return 2;
			else
				return -2;
			
			
		});
		Collections collections;
		Collections.sort(lap,new RatingComparator());
		System.out.println("laptops sorted by rating:");
		printLaptop(lap);
		
		
		
	

	}
	public static void printLaptop(List<Laptop> lap) {
		for (Laptop b : lap) {
			System.out.println(b);
		}
	}

}
