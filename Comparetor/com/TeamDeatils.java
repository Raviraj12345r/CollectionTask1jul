package Comparetor.com;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TeamDeatils {

	public static void main(String[] args) {
		
		
		List <CricketWorld> Match=new ArrayList<>();
		
		Match.add(new CricketWorld(1,"CSK",5));
		Match.add(new CricketWorld(2,"RCB",2));
		Match.add(new CricketWorld(3,"KKR",3));
		Match.add(new CricketWorld(5,"MI",5));
		Match.add(new CricketWorld(6,"PSB",0));
		Match.add(new CricketWorld(4,"LSG",2));
		Match.add(new CricketWorld(7,"GT",1));

		System.out.println(Match);
		
		
		System.out.println("After Using Sorting Logic");
		//After sort using comparator
		Collections.sort(Match , new WinComparator());
		System.out.println(Match);
		
		
	}
}
