package singletonpackage;

public class Logger {
	private static Logger inst;
	
	private Logger(){
		System.out.println("Logger created.");
	}
	
	public static Logger getInst() {
		if(inst==null)
			inst=new Logger();
		return inst;
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
	

}
