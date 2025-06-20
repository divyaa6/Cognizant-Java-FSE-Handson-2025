package EcomSearch;

public class Product {
	int ProID;
	String ProName;
	String ProCat;
	
	public Product(int id, String name,String cat) {
		ProID=id;
		ProName=name;
		ProCat=cat;
	}
	
	@Override
	public String toString() {
		return ProID+"->"+ProName+"->"+ProCat;
	}
	
	

}
