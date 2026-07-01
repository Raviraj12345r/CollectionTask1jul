package Comparetor.com;

public class CricketWorld {
	
	private  int TId;
	private String TName;
	private int TWin;
	public CricketWorld(int tId, String tName, int tWin) {
		TId = tId;
		TName = tName;
		TWin = tWin;
	}
	public int getTId() {
		return TId;
	}
	public void setTId(int tId) {
		TId = tId;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	public int getTWin() {
		return TWin;
	}
	public void setTWin(int tWin) {
		TWin = tWin;
	}
	@Override
	public String toString() {
		return "CricketWorld [TId=" + TId + ", TName=" + TName + ", TWin=" + TWin + "]";
	}
	
	
	

}
