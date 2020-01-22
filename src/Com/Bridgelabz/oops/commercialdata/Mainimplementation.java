package Com.Bridgelabz.oops.commercialdata;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import Com.Bridgelabz.oops.commercialdata.Commersialimplementation;
import Com.Bridgelabz.oops.commercialdata.methodsimp;
import Com.Bridgelabz.oops.commercialdata.Company;
import Com.Bridgelabz.oops.commercialdata.Customer;
import Com.Bridgelabz.oops.commercialdata.Transaction;

public class Mainimplementation {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Commersialimplementation controller = new Commersialimplementation();
		methodsimp operations = new methodsimp();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add company\n2.Add customer\n3.Buy share from company\n4.Sell share to company\n"
					+ "5.Total shares of all companies\n6.Total shares of all customers\n7.Exit\nEnter your choice: ");
			try {
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					List<Company> read1 = controller.readFileCompany(); // reading json file of company
					List<Company> list1 = operations.addCompany(read1); // method to add company
					controller.writeFileCompany(list1); // writing json file
					break;
				case 2:
					List<Customer> read2 = controller.readFileCustomer();// reading json file of customer
					List<Customer> list2 = operations.addCustomer(read2);// method to add company
					controller.writeFileCustomer(list2);// writing json file
					break;
				case 3:
					List<Company> read5 = controller.readFileCompany();// reading json file of company
					List<Customer> read6 = controller.readFileCustomer();// reading json file of customer
					List<Transaction> transactionList1 = new LinkedList<>();
					List<Customer> customerList1 = operations.buyShare(read5, read6, transactionList1); // method
																												// to
																												// buy
																												// shares
					controller.writeFileCustomer(customerList1);// writing json file
					break;
				case 4:
					List<Company> read3 = controller.readFileCompany();// reading json file of company
					List<Customer> read4 = controller.readFileCustomer();// reading json file of customer
					List<Transaction> transactionList = new LinkedList<>();
					List<Customer> customerList = operations.sellShare(read3, read4, transactionList); // method	// shares
					controller.writeFileCustomer(customerList);// writing json file
					break;
				case 5:
					List<Company> read7 = controller.readFileCompany();// reading json file of company
					int noOfStocksComp = operations.totalSharesOfCompanies(read7); // method to calculate total shares
																					// of company
					System.out.println("Total number of stocks of all companies are: " + noOfStocksComp);
					break;
				case 6:
					List<Customer> read8 = controller.readFileCustomer();// reading json file of customer
					int noOfStocksCust = operations.totalSharesOfCustomers(read8); // method to calculate total shares
																					// of customer
					System.out.println("Total number of stocks of all customers are: " + noOfStocksCust);
					break;
				case 7:
					System.out.println("Thank you!");
					return;

				default:
					System.out.println("Enter correct choice");
				}
			} catch (InputMismatchException e) {
				System.out.println("Enter integer only");
				sc.next();
			}
		} while (choice != 7);
	}

}