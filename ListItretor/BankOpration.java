package ListItretor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BankOpration {

	public static void main(String[] args) {

		List<String> bank = new ArrayList<>();

		bank.add("ICICI");
		bank.add("SBI");
		bank.add("MHB");
		bank.add("AXIS");
		bank.add("PNB");
		bank.add("CNTB");
		bank.add("UNB");

		System.out.println("Before Operation:");
		System.out.println(bank);

		ListIterator<String> itr = bank.listIterator();

		while (itr.hasNext()) {

			String b = itr.next();

			// Remove
			if (b.equals("MHB")) {
				itr.remove();
			}

			// Replace
			if (b.equals("SBI")) {
				itr.set("STATE BANK OF INDIA");
			}

			// Add
			if (b.equals("AXIS")) {
				itr.add("HDFC");
			}
		}

		System.out.println("After Operation:");
		System.out.println(bank);
	}
}
