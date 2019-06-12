package com.pennant.CricketSecondExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunsImpl {
	Scanner scanner=new Scanner(System.in);
	public void allT20Ditails(List<Cricketer> cricketers){
		Collections.sort(cricketers,new TotalRunsComparator());
		System.out.println("T20 Ditailsof all Cricketers");
		for (Cricketer c : cricketers) {
			System.out.println(c.getName()+" "+c.getHighestWicketsInT20()+" "+c.getHighScoreInT20()+" "+c.getNumberOfMatchesInT20()+" "+c.getTotalScoreInT20());
			}
		
	}
	public void singleT20Score(List<Cricketer> cricketers){
		Collections.sort(cricketers,new TotalRunsComparator());
		System.out.println("Enter cricketer name");
		String name=scanner.nextLine();
		for (Cricketer c : cricketers) {
			
			if(name.equals(c.getName())){
				System.out.println(c.getName()+" "+c.getHighestWicketsInT20()+" "+c.getHighScoreInT20()+" "+c.getNumberOfMatchesInT20()+" "+c.getTotalScoreInT20());
			}
		}
	}
	public void allOddDitails(List<Cricketer> cricketers){
		Collections.sort( cricketers,new TotalRunsComparatorInOds());
		System.out.println("Odds Ditailsof all Cricketers");
		for (Cricketer cricketer :  cricketers) {
			System.out.println(cricketer.getName()+" "+cricketer.getTotalScoreInOds()+" "+cricketer.getHighScoreInOds()+" "+cricketer.getNumberOfMatchesInOds()+" "+cricketer.getTotalWicketsInOds());
			}
	}
	public void singleOddsScore(List<Cricketer> cricketers){
		Collections.sort(cricketers,new TotalRunsComparatorInOds());
		System.out.println("Enter cricketer name");
		String name=scanner.nextLine();
		for (Cricketer c : cricketers) {
			
			if(name.equals(c.getName())){
				System.out.println(c.getName()+" "+c.getTotalScoreInOds()+" "+c.getHighScoreInOds()+" "+c.getNumberOfMatchesInOds()+" "+c.getTotalWicketsInOds());
			}
		}
	}
	public void allTestScore(List<Cricketer> cricketers){
		Collections.sort( cricketers,new TotalRunsComparatorTests());
		System.out.println("Odds Ditailsof all Cricketers");
		for (Cricketer cricketer :  cricketers) {
			System.out.println(cricketer.getName()+" "+cricketer.getTotalScoreInTests()+" "+cricketer.getHighScoreInTests()+" "+cricketer.getNumberOfMatchesInTests()+" "+cricketer.getTotalWicketsInTests());
			}
	}
	public void singleTestScore(List<Cricketer> cricketers){
		Collections.sort(cricketers,new TotalRunsComparatorInOds());
		System.out.println("Enter cricketer name");
		String name=scanner.nextLine();
		for (Cricketer c : cricketers) {
			
			if(name.equals(c.getName())){
				System.out.println(c.getName()+" "+c.getTotalScoreInTests()+" "+c.getHighScoreInTests()+" "+c.getNumberOfMatchesInTests()+" "+c.getTotalWicketsInTests());
			}
		}
	}
	public void batsmenAverage(List<Cricketer> cricketers){
		Collections.sort(cricketers);
		System.out.println("Enter Player name for Average");
		String name=scanner.nextLine();
		System.out.println("Enter Player Type");
		String type=scanner.nextLine();
		for (Cricketer cricketer : cricketers) {
			if(name.equals(cricketer.getName())&&type.equals(cricketer.getPlayerType())){
			/*int	totalScore=cricketer.getTotalScoreInOds()+cricketer.getTotalScoreInT20()+cricketer.getTotalScoreInTests();
			int totalMatches=cricketer.getNumberOfMatchesInOds()+cricketer.getNumberOfMatchesInT20()+cricketer.getNumberOfMatchesInTests();
			
			int average=(totalScore/totalMatches)*100;*/
				double num1=(cricketer.getTotalScoreInOds()/cricketer.getNumberOfMatchesInOds());
			    double num2=(cricketer.getTotalScoreInT20()/cricketer.getNumberOfMatchesInT20());
			    double num3=(cricketer.getTotalScoreInTests()/cricketer.getNumberOfMatchesInTests());
			    double average=(num1+num2+num3)/3;
			    
			System.out.println("Average of "+name +" is "+average);
			}
			
		}
		
	}
	public void bowlerAverage(List<Cricketer> cricketers){
		Collections.sort(cricketers);
		System.out.println("Enter player name for Average");
		String name=scanner.nextLine();
		System.out.println("Enter Player Type");
		String type=scanner.nextLine();
		for (Cricketer cricketer : cricketers) {
			if(name.equals(cricketer.getName())&&type.equals(cricketer.getPlayerType())){
			/*int	totalScore=cricketer.getTotalWicketsInOds()+cricketer.getTotalWicketsInT20()+cricketer.getTotalWicketsInTests();
			int totalMatches=cricketer.getNumberOfMatchesInOds()+cricketer.getNumberOfMatchesInT20()+cricketer.getNumberOfMatchesInTests();
			
			double average=(totalScore/totalMatches)*100;*/
			double num1=(cricketer.getTotalWicketsInOds()/cricketer.getNumberOfMatchesInOds());
		    double num2=(cricketer.getTotalWicketsInT20()/cricketer.getNumberOfMatchesInT20());
		    double num3=(cricketer.getTotalWicketsInTests()/cricketer.getNumberOfMatchesInTests());
		    double average=(num1+num2+num3)/3;
		System.out.println("Average of "+name +" is "+average);
			//System.out.println("Average of "+name+"is "+average);
			}
			
		}
		
	}
	public void allRownder(List<Cricketer> cricketers){
		Collections.sort(cricketers);
		System.out.println("Enter player name for Average");
		String name=scanner.nextLine();
		System.out.println("Enter Player Type");
		String type=scanner.nextLine();
		for (Cricketer cricketer : cricketers) {
			if(name.equals(cricketer.getName())&&type.equals(cricketer.getPlayerType())){
				/*int	totalScore1Runs=cricketer.getTotalWicketsInOds()+cricketer.getTotalWicketsInT20()+cricketer.getTotalWicketsInTests();
				int totalMatches1=cricketer.getNumberOfMatchesInOds()+cricketer.getNumberOfMatchesInT20()+cricketer.getNumberOfMatchesInTests();
			int	totalScoreWickets=cricketer.getTotalWicketsInOds()+cricketer.getTotalWicketsInT20()+cricketer.getTotalWicketsInTests();
			int totalMatches=cricketer.getNumberOfMatchesInOds()+cricketer.getNumberOfMatchesInT20()+cricketer.getNumberOfMatchesInTests();
			*/
			/*double average1=((totalScore1Runs/totalMatches))*100;
			double average2=((totalScoreWickets/totalMatches))*100;*/
			/*double  total=(average1+average2)/200;*/
			double num1=(cricketer.getTotalScoreInOds()/cricketer.getNumberOfMatchesInOds());
		    double num2=(cricketer.getTotalScoreInT20()/cricketer.getNumberOfMatchesInT20());
		    double num3=(cricketer.getTotalScoreInTests()/cricketer.getNumberOfMatchesInTests());
		    double average1=(num1+num2+num3)/3;
		System.out.println("Average of Bating "+name +" is "+average1);
		double number1=(cricketer.getTotalWicketsInOds()/cricketer.getNumberOfMatchesInOds());
	    double number2=(cricketer.getTotalWicketsInT20()/cricketer.getNumberOfMatchesInT20());
	    double number3=(cricketer.getTotalWicketsInTests()/cricketer.getNumberOfMatchesInTests());
	    double average2=(num1+num2+num3)/3;
	System.out.println("Average of Bowling "+name +" is "+average2);
		
			/*System.out.println("Average of "+name+"is "+total*100);*/
			}
			
		}
	}
	 
	}
	

