package Itretor;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BankName {

	public static void main(String[] args) {

		List<String> bank = new ArrayList<>();

		bank.add("ICICI");
		bank.add("SBI");
		bank.add("MHB");
		bank.add("AXIS");
		bank.add("PNB");
		bank.add("CNTB");
		bank.add("UNB");

		System.out.println(bank);
   
		
		System.out.println("**********************After Remove name************************");
		Iterator<String> Bank_Itretor = bank.iterator();
		while (Bank_Itretor.hasNext()) {
			if (Bank_Itretor.next().equals("MHB")) {
				Bank_Itretor.remove();
			}
		}
		System.out.println(bank);

	}
}
