package singletonpackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log1=Logger.getInst();
		log1.log("This is log 1");
		
		Logger log2=Logger.getInst();
		log2.log("This is log 2");
		
		if(log1==log2) {
			System.out.println("Same instance");
		}
		else {
			System.out.println("Different instance");
		}
	}

}
