package aug3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*1)Recreate exception handling, create your own custom exceptions(checked and unchecked) with Business and Presentation Layer
handle the exceptions for validating email or password or aadhar number or DL number.
2)Revisit on Lists and work with Comparable and Comparator using both Java7 and Java8 style(lambda(->)) for
Product(id,name,cost,rating,quantity), perform sorting for different options like byname,bycost, byrating and cost and byquantity.
3)Work on Queue interface, do research and get the difference between LinkedList and PriorityQueue with code example
also do check on blocking and non blocking Queue, based on your interest go ahead and also explore Dequeue interface if you wish to.
4)Work with Set Interface for the same object created in Task2 and eliminate duplicates in it.*/



public class Task1 {


			public static void main(String[] args)  {
				
				
				Bussinessvalid b1=new Bussinessvalid();
				
			      
			    
			  			
					try {
						if(b1.isValidEmail("pratyusha@gmail.in")) {
							System.out.println("eMAIL VALIDATED");
						}
					} catch (InvalidEmailException e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}
					
			//	} catch (InvalidAgeException e) {
				//	System.out.println(e.getMessage());
				//}
				
				
				try {
					if(b1.isValidPassword("ABCDE1222Q")) {
						System.out.println("Password Validated");}
				} catch (InvalidPassException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
						try {
							if(b1.isValidAdhar("987733323278")) {
								System.out.println("Adhar Validated");}
						} catch (InvalidAdharException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					
				//}catch(InvalidPanException e){
					//System.out.println(e.getMessage());
				//}

			
					}
		

	

	}


