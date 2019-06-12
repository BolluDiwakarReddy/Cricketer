package com.pennant.CricketSecondExample;

import java.util.Comparator;

public class TotalRunsComparatorInOds implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		if(o1.getTotalScoreInOds()<o2.getTotalScoreInOds()){
			return 1;
		}else{
			return -1;
		}
		
	}

}
