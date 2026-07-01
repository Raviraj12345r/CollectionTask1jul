package Comparetor.com;

import java.util.Comparator;

public class IdComparator implements Comparator<CricketWorld> {

	@Override
	public int compare(CricketWorld o1, CricketWorld o2) {
		return Integer.compare(o1.getTId(),  o2.getTId());
	}

	
}
