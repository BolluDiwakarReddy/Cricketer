package com.pennant.CricketSecondExample;

import java.util.Comparator;

public class TotalRunsComparator implements Comparator<Cricketer>{

	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		if(o1.getTotalScoreInT20()<o2.getTotalScoreInT20()){
			return 1;
		}else{
		return -1;	
		}
		
	}

}
