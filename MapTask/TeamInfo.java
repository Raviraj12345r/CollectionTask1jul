package MapTask;

public class TeamInfo {

	private int Jno;
	private String Name;
	private int runs;
	private int Wikets;
	private String TName;
	
	
	public TeamInfo(int jno, String name, int runs, int wikets, String tName) {
		super();
		Jno = jno;
		Name = name;
		this.runs = runs;
		Wikets = wikets;
		TName = tName;
	}


	public int getJno() {
		return Jno;
	}


	public void setJno(int jno) {
		Jno = jno;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWikets() {
		return Wikets;
	}


	public void setWikets(int wikets) {
		Wikets = wikets;
	}


	public String getTName() {
		return TName;
	}


	public void setTName(String tName) {
		TName = tName;
	}


	@Override
	public String toString() {
		return "TeamInfo [Jno=" + Jno + ", Name=" + Name + ", runs=" + runs + ", Wikets=" + Wikets + ", TName=" + TName
				+ "]";
	}
	
	
	
}
