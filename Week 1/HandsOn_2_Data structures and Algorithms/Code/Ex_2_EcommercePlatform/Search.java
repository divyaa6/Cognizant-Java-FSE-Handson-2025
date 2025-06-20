package EcomSearch;

public class Search {
	public static Product Linear(Product[] items,int itemID) {
		for(Product p: items) {
			if(p.ProID==itemID)
				return p;
		}
		return null;
		
	}
	
	public static Product Binary(Product[] items,int itemID) {
		int low=0,high=items.length-1;
		
		while(low<high) {
			int mid=(low+high)/2;
			if(items[mid].ProID==itemID)
				return items[mid];
			else if(items[mid].ProID<itemID)
				low=mid+1;
			else
				high=mid-1;
				
		}
		return null;
	}
}
