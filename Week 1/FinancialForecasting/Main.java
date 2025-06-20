import java.util.Scanner;
public class Main {
	public static double futureValueRecursive(double val, double rate, int periods) {
        if (periods == 0)
            return val;
        else
            return futureValueRecursive(val*(1+rate), rate, periods-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Present Value: ");
        double val = sc.nextDouble();
        
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();
        
        double result = futureValueRecursive(val, rate/100, years);
        System.out.printf("Future value after %d years: %.2f\n", years, result);
        sc.close();
        
        
		
		
		
		
		

	}

}
