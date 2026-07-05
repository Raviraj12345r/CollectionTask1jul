package MapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IplTeams {
	public static void main(String[] args) {

		Map<String, List<TeamInfo>> IPL26 = new HashMap<>();

		// RCB
		List<TeamInfo> RCB = new ArrayList<>();
		RCB.add(new TeamInfo(27, "Yash Dayal   ", 45000, 0, "RCB"));
		RCB.add(new TeamInfo(20, "Phil Salt    ", 62000, 0, "RCB"));
		RCB.add(new TeamInfo(23, "Tim David    ", 50000, 0, "RCB"));
		RCB.add(new TeamInfo(18, "Virat   Kohli", 78000, 0, "RCB"));
		RCB.add(new TeamInfo(26, "Jos Hazlewood", 60000, 0, "RCB"));
		RCB.add(new TeamInfo(19, "Rajat Patidar", 65000, 0, "RCB"));
		RCB.add(new TeamInfo(22, "Jitesh Sharma", 55000, 0, "RCB"));
		RCB.add(new TeamInfo(24, "Krunal Pandya", 52000, 0, "RCB"));
		RCB.add(new TeamInfo(25, "Bhuvneshwar Kumar", 58000, 0, "RCB"));
		RCB.add(new TeamInfo(21, "Liam  Livingstone", 60000, 0, "RCB"));


		// CSK
		List<TeamInfo> CSK = new ArrayList<>();
		CSK.add(new TeamInfo(28, "Ruturaj Gaikwad", 70000, 0, "CSK"));
		CSK.add(new TeamInfo(29, "MS Dhoni", 85000, 0, "CSK"));
		CSK.add(new TeamInfo(30, "Ravindra Jadeja", 75000, 0, "CSK"));
		CSK.add(new TeamInfo(31, "Shivam Dube", 62000, 0, "CSK"));
		CSK.add(new TeamInfo(32, "Devon Conway", 65000, 0, "CSK"));
		CSK.add(new TeamInfo(33, "Rahul Tripathi", 52000, 0, "CSK"));
		CSK.add(new TeamInfo(34, "Rachin Ravindra", 56000, 0, "CSK"));
		CSK.add(new TeamInfo(35, "Noor Ahmad", 50000, 0, "CSK"));
		CSK.add(new TeamInfo(36, "Matheesha Pathirana", 60000, 0, "CSK"));
		CSK.add(new TeamInfo(37, "Khaleel Ahmed", 47000, 0, "CSK"));

		// MI
		List<TeamInfo> MI = new ArrayList<>();
		MI.add(new TeamInfo(38, "Rohit Sharma", 82000, 0, "MI"));
		MI.add(new TeamInfo(39, "Hardik Pandya", 80000, 0, "MI"));
		MI.add(new TeamInfo(40, "Suryakumar Yadav", 76000, 0, "MI"));
		MI.add(new TeamInfo(41, "Tilak Varma", 65000, 0, "MI"));
		MI.add(new TeamInfo(42, "Jasprit Bumrah", 85000, 0, "MI"));
		MI.add(new TeamInfo(43, "Trent Boult", 70000, 0, "MI"));
		MI.add(new TeamInfo(44, "Deepak Chahar", 52000, 0, "MI"));
		MI.add(new TeamInfo(45, "Naman Dhir", 35000, 0, "MI"));
		MI.add(new TeamInfo(46, "Ryan Rickelton", 45000, 0, "MI"));
		MI.add(new TeamInfo(47, "Will Jacks", 48000, 0, "MI"));

		// KKR
		List<TeamInfo> KKR = new ArrayList<>();
		KKR.add(new TeamInfo(48, "Ajinkya Rahane", 62000, 0, "KKR"));
		KKR.add(new TeamInfo(49, "Venkatesh Iyer", 68000, 0, "KKR"));
		KKR.add(new TeamInfo(50, "Rinku Singh", 64000, 0, "KKR"));
		KKR.add(new TeamInfo(51, "Andre Russell", 78000, 0, "KKR"));
		KKR.add(new TeamInfo(52, "Sunil Narine", 76000, 0, "KKR"));
		KKR.add(new TeamInfo(53, "Varun Chakravarthy", 60000, 0, "KKR"));
		KKR.add(new TeamInfo(54, "Quinton de Kock", 65000, 0, "KKR"));
		KKR.add(new TeamInfo(55, "Moeen Ali", 56000, 0, "KKR"));
		KKR.add(new TeamInfo(56, "Harshit Rana", 45000, 0, "KKR"));
		KKR.add(new TeamInfo(57, "Anrich Nortje", 58000, 0, "KKR"));

		// SRH
		List<TeamInfo> SRH = new ArrayList<>();
		SRH.add(new TeamInfo(58, "Pat Cummins", 82000, 0, "SRH"));
		SRH.add(new TeamInfo(59, "Travis Head", 78000, 0, "SRH"));
		SRH.add(new TeamInfo(60, "Abhishek Sharma", 70000, 0, "SRH"));
		SRH.add(new TeamInfo(61, "Heinrich Klaasen", 75000, 0, "SRH"));
		SRH.add(new TeamInfo(62, "Ishan Kishan", 72000, 0, "SRH"));
		SRH.add(new TeamInfo(63, "Nitish Kumar Reddy", 62000, 0, "SRH"));
		SRH.add(new TeamInfo(64, "Mohammed Shami", 70000, 0, "SRH"));
		SRH.add(new TeamInfo(65, "Harshal Patel", 58000, 0, "SRH"));
		SRH.add(new TeamInfo(66, "Rahul Chahar", 47000, 0, "SRH"));
		SRH.add(new TeamInfo(67, "Adam Zampa", 52000, 0, "SRH"));

		// RR
		List<TeamInfo> RR = new ArrayList<>();
		RR.add(new TeamInfo(68, "Sanju Samson", 76000, 0, "RR"));
		RR.add(new TeamInfo(69, "Yashasvi Jaiswal", 74000, 0, "RR"));
		RR.add(new TeamInfo(70, "Riyan Parag", 65000, 0, "RR"));
		RR.add(new TeamInfo(71, "Dhruv Jurel", 55000, 0, "RR"));
		RR.add(new TeamInfo(72, "Shimron Hetmyer", 60000, 0, "RR"));
		RR.add(new TeamInfo(73, "Jofra Archer", 70000, 0, "RR"));
		RR.add(new TeamInfo(74, "Wanindu Hasaranga", 62000, 0, "RR"));
		RR.add(new TeamInfo(75, "Sandeep Sharma", 45000, 0, "RR"));
		RR.add(new TeamInfo(76, "Maheesh Theekshana", 50000, 0, "RR"));
		RR.add(new TeamInfo(77, "Nitish Rana", 58000, 0, "RR"));

		// DC
		List<TeamInfo> DC = new ArrayList<>();
		DC.add(new TeamInfo(78, "KL Rahul       ", 80000, 0, "DC"));
		DC.add(new TeamInfo(79, "Axar Patel     ", 72000, 0, "DC"));
		DC.add(new TeamInfo(80, "Kuldeep Yadav  ", 65000, 0, "DC"));
		DC.add(new TeamInfo(81, "Mitchell Starc ", 82000, 0, "DC"));
		DC.add(new TeamInfo(82, "Tristan Stubbs ", 60000, 0, "DC"));
		DC.add(new TeamInfo(83, "Jake Fraser-   ", 58000, 0, "DC"));
		DC.add(new TeamInfo(84, "T Natarajan    ", 55000, 0, "DC"));
		DC.add(new TeamInfo(85, "Faf du Plessis ", 68000, 0, "DC"));
		DC.add(new TeamInfo(86, "Ashutosh Sharma", 42000, 0, "DC"));
		DC.add(new TeamInfo(87, "Mukesh Kumar   ", 45000, 0, "DC"));

		// PBKS
		List<TeamInfo> PBKS = new ArrayList<>();
		PBKS.add(new TeamInfo(88, "Shreyas Iyer   ", 78000, 0, "PBKS"));
		PBKS.add(new TeamInfo(89, "Arshdeep Singh ", 70000, 9, "PBKS"));
		PBKS.add(new TeamInfo(90, "Yuzi Chahal    ", 72000, 9, "PBKS"));
		PBKS.add(new TeamInfo(91, "Marcus Stoinis ", 65000, 7, "PBKS"));
		PBKS.add(new TeamInfo(92, "Glenn Maxwell  ", 68000, 3, "PBKS"));
		PBKS.add(new TeamInfo(93, "Prabhsimran    ", 50000, 0, "PBKS"));
		PBKS.add(new TeamInfo(94, "Marco Jansen   ", 60000, 5, "PBKS"));
		PBKS.add(new TeamInfo(95, "Nehal Wadhera  ", 45000, 2, "PBKS"));
		PBKS.add(new TeamInfo(96, "Lockie Ferguson", 55000, 4, "PBKS"));
		PBKS.add(new TeamInfo(97, "Josh Inglis    ", 52000, 4, "PBKS"));

		// LSG
		List<TeamInfo> LSG = new ArrayList<>();
		LSG.add(new TeamInfo(98, "Rishabh Pant   ", 85000, 0, "LSG"));
		LSG.add(new TeamInfo(99, "Nicholas Pooran", 78000, 0, "LSG"));
		LSG.add(new TeamInfo(100, "Aiden Markram ", 65000, 0, "LSG"));
		LSG.add(new TeamInfo(101, "David Miller  ", 68000, 4, "LSG"));
		LSG.add(new TeamInfo(102, "Mitchell Marsh", 70000, 3, "LSG"));
		LSG.add(new TeamInfo(103, "Ravi Bishnoi  ", 62000, 9, "LSG"));
		LSG.add(new TeamInfo(104, "Avesh Khan    ", 52000, 7, "LSG"));
		LSG.add(new TeamInfo(105, "Abdul Samad   ", 45000, 4, "LSG"));
		LSG.add(new TeamInfo(106, "Mohsin Khan   ", 42000, 2, "LSG"));
		LSG.add(new TeamInfo(107, "Shahbaz Ahmed ", 40000, 0, "LSG"));

		IPL26.put("RCB", RCB);
		IPL26.put("CSK", CSK);
		IPL26.put("MI", MI);
		IPL26.put("KKR", KKR);
		IPL26.put("SRH", SRH);
		IPL26.put("RR", RR);
		IPL26.put("DC", DC);
		IPL26.put("PBKS", PBKS);
		
		IPL26.put("LSG", LSG);

		
		List<TeamInfo> rcbPlayers = IPL26.get("LSG");
		
		System.out.println(              "|Team Name|  "+      "| JNo |"             +"      | P Name |"+       "             |Player Total Runs|" +"  |Total Wikets |");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (TeamInfo player : rcbPlayers) {
		    System.out.println(player.getTName() +" :         "+player.getJno()+" :     "+player.getName ()+" :                 "+player.getRuns()+"          "+player.getWikets());
		    
		}
		
		
		
//		for (String team : IPL26.keySet()) {
//		    System.out.println("Team: " + team);
//		    for (TeamInfo player : IPL26.get(team)) {
//		        System.out.println( player.getRuns());
//		    }

	}
}
