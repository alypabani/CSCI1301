import java.util.Scanner;
public class NetPay{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many hours did you work this week?");
		int Hours_Per_Week = keyboard.nextInt();
		double Gross_Pay;
		double Net_Pay;
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25; //thats a little low no?
		
		//Calculating gross pay here because it is easier to declare the other variables than doing the operation over and over again
		
		Gross_Pay = Hours_Per_Week * PAY_PER_HOUR;
		
		//I declared these variables and just divided by 100 to make it easier
		
		double Federal_Deduction = Gross_Pay * (FEDERAL_TAX_PERCENT / 100);
		double State_Deduction = Gross_Pay * (STATE_TAX_PERCENT / 100);
		double SS_Deduction = Gross_Pay * (SOCIAL_SECURITY_PERCENT / 100);
		double Medicare_Deduction = Gross_Pay * (MEDICARE_PERCENT / 100);
		
		//Net Pay has to be calculated here because I use those variables and they aren't initialized until I do so
		
		Net_Pay = Gross_Pay - Federal_Deduction - State_Deduction - SS_Deduction - Medicare_Deduction;
		
		//I tried to space them out evenly without using the tab or new line, I only used them to create space between actual outputs. I hope that's okay
		
		System.out.printf("%-20s %s\n", "Hours Per Week:", Hours_Per_Week);
		System.out.printf("%-20s %s\n", "Gross Pay:", Gross_Pay);
		System.out.printf("%-20s %s\n", "Net Pay:", Net_Pay);
		System.out.println("Deductions");
		System.out.printf("%-20s %s\n", "Federal:", Federal_Deduction);
		System.out.printf("%-20s %s\n", "State:", State_Deduction);
		System.out.printf("%-20s %s\n", "Social Security:", SS_Deduction);
		System.out.printf("%-20s %s\n", "Medicare:", Medicare_Deduction);
		keyboard.close();
		
	}
}
