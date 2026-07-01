package Compareble.com;

public class Employe implements Comparable<Employe> {

	private int EId;
	private String EName;
	private double ESalary;

	@Override

//	public int compareTo(Employe o) {
//   return this.EId - o.EId;
//   
//	}

	// sort list in lowest salary to highest salary
	public int compareTo(Employe o) {
		return (int) (this.ESalary - o.ESalary);
	}

	public Employe(int eId, String eName, double eSalary) {
		EId = eId;
		EName = eName;
		ESalary = eSalary;
	}

	public int getEId() {
		return EId;
	}

	public void setEId(int eId) {
		EId = eId;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public double getESalary() {
		return ESalary;
	}

	public void setESalary(double eSalary) {
		ESalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employe [EId=" + EId + ", EName=" + EName + ", ESalary=" + ESalary + "]";
	}

}
