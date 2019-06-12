package com.pennant.CricketSecondExample;

import java.util.Comparator;

public class TotalRunsComparatorTests implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		if(o1.getTotalScoreInTests()<o2.getTotalScoreInTests()){
			return 1;
			
		}else{
			return -1;
		}
	}

}
