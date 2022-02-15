import java.util.Date;
import java.lang.Math;

public class Loan
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan()
	{
		this.annualInterestRate = 2.5;
		this.numberOfYears = 1;
		this.loanAmount = 1000;
		loanDate = new Date();

	}
	public Loan(double annualInterestRate, int numberOfYears, 
		    double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}
	
	public double getAnnualInterestRate()
	{
		return this.annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getNumberOfYears()
	{
		return this.numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears)
	{
		this.numberOfYears = numberOfYears;
	}
	
	public double getLoanAmount()
	{
		return this.loanAmount;
	}
	public void setLoanAmount(double loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	
	public Date getLoanDate()
	{
		return this.loanDate;
	}

	public double getMonthlyPayment()
	{
		double monthlyInterestRate = this.annualInterestRate / 12 / 100;
		return (this.loanAmount * monthlyInterestRate) / 
		       (1 - 1 / Math.pow(1 + monthlyInterestRate, this.numberOfYears * 12));
	}
	public double getTotalPayment()
	{
		return getMonthlyPayment() * this.numberOfYears * 12;
	}
}