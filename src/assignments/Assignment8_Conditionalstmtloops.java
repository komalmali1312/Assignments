package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_Conditionalstmtloops {

	public static void main(String[] args) {
//1.Create List collection to store all bank Transactions.
		List<Integer> Transactions = new ArrayList<>();
		Transactions.add(50000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(-3000);
		System.out.println(Transactions);

//1. Print total number of credit and debit transactions completed
		int creditTransactions = 0;
		int debitTransactions = 0;
		for (int i = 0; i < Transactions.size(); i++) {
			if (Transactions.get(i) > 0)
				creditTransactions++;
			else
				debitTransactions++;
		}
		System.out.println("total number of credit transactions completed:" + creditTransactions);
		System.out.println("total number of debit transactions completed:" + debitTransactions);

//Print the total amount credited and debited in account
		int Totalcreditedamount = 0;
		int Totaldebitedamount = 0;
		for (int i = 0; i < Transactions.size(); i++) {
			if (Transactions.get(i) > 0)
				Totalcreditedamount += Transactions.get(i);
			else
				Totaldebitedamount += Transactions.get(i);
		}
		System.out.println("total amount credited in account:" + Totalcreditedamount);
		System.out.println("total amount debited in account:" + Totaldebitedamount);

//Print total amount remaining at the end in Bank Account
		int TotalAmount = 0;
		for (int i = 0; i < Transactions.size(); i++)
			TotalAmount += Transactions.get(i);
		System.out.println("Print total amount remaining at the end in Bank Account is: " + TotalAmount);

//4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
//Transaction with Amount” and also print total number of suspicious transactions
		int susptrancount = 0;
		for (int i = 0; i < Transactions.size(); i++) {
			if (Transactions.get(i) > 10000) {
				System.out.println("Suspicious credit Transaction with Amount:" + Transactions.get(i));
				susptrancount++;
			}
			if (Transactions.get(i) < -10000) {
				System.out.println("Suspicious debit Transaction with Amount:" + Transactions.get(i));
				susptrancount++;
			}
		}
		System.out.println("print total number of suspicious transactions are:" + susptrancount);
	}
}
