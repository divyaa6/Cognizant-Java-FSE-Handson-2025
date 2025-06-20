package EcomSearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product items[]= {
				new Product(101,"Facewash","Beauty"),
				new Product(104,"Noodles","Food"),
				new Product(105,"HandBag","Fashion"),
				new Product(102,"Eyeliner","Beauty"),
				new Product(107,"Chocolate","Food")
				
		};
		
		Product res1=Search.Linear(items, 102);
		System.out.println("Linear Search: "+(res1!=null? res1:"Item not found"));
		
		Arrays.sort(items,(a,b)-> a.ProID-b.ProID);
		
		Product res2=Search.Binary(items, 105);
		System.out.println("Binary Search: "+(res2!=null? res2:"Item not found"));
		

	}

}
