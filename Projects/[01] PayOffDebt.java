/*
* [CSCI1301/PayOffDebt].java
* Author: [Aly Pabani]
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the School of Computing
* at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited.
*/
import java.util.Scanner;
public class PayOffDebt{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//user inputs
		System.out.println("What is the Principal amount in USD?:");
		double principal = keyboard.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double annualIntRate = keyboard.nextDouble();
		System.out.println("What is your monthly payment?: ");
		double monthlyPay = keyboard.nextDouble();
		
		//months needed formulas
			double monthPayLog = Math.log(monthlyPay);
		//numerator calculations
			double numLog = (monthlyPay - (annualIntRate/1200) * principal);
			double nLog = Math.log(numLog);
		//denominator calculations
			double denoLog = ((annualIntRate/1200) + 1);
			double denominatorLog = Math.log(denoLog);
		//totalMonths is the output
			double totalMonths = (monthPayLog-nLog) / denominatorLog;
			
		//ceiling of the total months
			double ceilMonths = Math.ceil(totalMonths);
			int monthsInteg = (int) ceilMonths;
		
		//total amount and interest paid calcs
			double totalPaid = monthsInteg * monthlyPay;
			double totalIntPaid = (principal - totalPaid) * -1;
			
		//overpayment calcs
			double ovrTotalPaid = totalMonths * monthlyPay;
			double ovrTotalIntPaid = (principal - ovrTotalPaid) * -1;
			double ovrPayment = totalIntPaid - ovrTotalIntPaid;
			
		//rounding total amount and total interest paid
			totalPaid *= 100;
			totalIntPaid *= 100;
			int iTotalPaid = (int) totalPaid;
			int iTotalIntPaid = (int) totalIntPaid;
			
			double rndTotalPaid = (double) iTotalPaid;
			double rndTotalIntPaid = (double) iTotalIntPaid;
			
			rndTotalPaid = rndTotalPaid / 100;
			rndTotalIntPaid = rndTotalIntPaid / 100;
			
		//rounding of overpayment
			ovrPayment *= 100;
			int iOvrPayment = (int)	ovrPayment;
			double rndOvrPayment = (double) iOvrPayment;
			rndOvrPayment = rndOvrPayment / 100;
			
		//print statements
			System.out.println("Principal\t\t\t" + principal);
			System.out.println("Annual Interet Rate (%):\t" + annualIntRate);
			System.out.println("Monthly Payment:\t\t" + monthlyPay + "\n");
			System.out.println("Months Needed to Pay Off:\t" + monthsInteg);
			System.out.println("Total Amount Paid:\t\t$" + rndTotalPaid);
			System.out.println("Total Interest Paid:\t\t$" + rndTotalIntPaid);
			System.out.println("Overpayment:\t\t\t$" + rndOvrPayment);
			
		keyboard.close();

	}
}
