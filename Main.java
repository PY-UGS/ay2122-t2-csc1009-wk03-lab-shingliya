import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double ir, la;
		int noy;
		Loan loan;		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter annual intrest rate, for example, 8.25: ");
		ir = scan.nextDouble();
		System.out.print("Enter number of years as an integer: ");
		noy = scan.nextInt();
		System.out.print("Enterloan amount, for example, 120000.95: ");
		la = scan.nextDouble();
		
		loan = new Loan(ir, noy, la);

		System.out.println("The loan was created on " + loan.getLoanDate());
		System.out.printf("The monthly payment is %.2f\n", loan.getMonthlyPayment());
		System.out.printf("The total payment is %.2f\n", loan.getTotalPayment());
	}
}