package Compareble.com;

import java.util.Set;
import java.util.TreeSet;

public class EmployeDetails {

	public static void main(String[] args) {

		Set<Employe> Data = new TreeSet<>();
		Data.add(new Employe(1, "Raviraj", 90000));
		Data.add(new Employe(2, "Tajas", 93000));
		Data.add(new Employe(3, "Suraj", 88000));
		Data.add(new Employe(6, "Satyam", 92000));
		Data.add(new Employe(5, "Rahul", 89000));
		Data.add(new Employe(4, "Kiran", 95000));

		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(Data);

		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

}
