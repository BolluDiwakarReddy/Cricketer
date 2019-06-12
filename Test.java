package com.pennant.CricketSecondExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Cricketer cricketer1 = new Cricketer("Dhoni", 2, 200, 250, 750, 150, 200, 120, 8000, 7500, 6500, 100, 150,
				200, "batsmen", "india", 5, 6, 3);
		;
		Cricketer cricketer2 = new Cricketer("Abd", 1, 20, 30, 600, 18, 250, 130, 800, 7600, 6700, 110, 160, 240,
				"batsmen", "SouthAfrica", 4, 6, 3);
		Cricketer cricketer3 = new Cricketer("JosButtler", 3, 150, 220, 850, 151, 202, 128, 8001, 7550, 6550, 150,
				154, 270, "batsmen", "England", 4, 8, 3);
		;
		Cricketer cricketer4 = new Cricketer("Maxiwell", 4, 210, 756, 200, 180, 203, 120, 8050, 7540, 6570, 170, 157,
				240, "allRounder", "Australia", 7, 6, 5);
		Cricketer cricketer5 = new Cricketer("Styne", 5, 100, 140, 80, 90, 86, 120, 900, 500, 500, 450, 255, 455,
				"bowler", "SouthAfrica", 7, 8, 8);
		Scanner scanner = new Scanner(System.in);
		ArrayList<Cricketer> al = new ArrayList<Cricketer>();
		al.add(cricketer1);
		al.add(cricketer2);
		al.add(cricketer3);
		al.add(cricketer4);
		al.add(cricketer5);
		RunsImpl ri=new RunsImpl();
		System.out.println("Enter the Option");
		System.out.println(
				"1-->getAllCricketersDitails\n 2-->get CountyWise Ditails\n3-->get DitailsOf T20\n4-->get DitailsOf Ods\n5-->get DitailsOf Test\n6-->Batting Average of Batters\n7-->Bowling Avereage of Bowlers\n8-->Batting And Bowling Averge of All Rownders\n9-->get single player T20 ditails \n 10-->get single player odds ditails\n11-->get single player test Players");
		int option = Integer.parseInt(scanner.nextLine());
		switch (option) {
		case 1: {
			Collections.sort(al);
			System.out.println("All cricketers ditails");
			for (Cricketer cricketer : al) {
				System.out.println(cricketer);
			}
			break;
		}
		case 2: {
			Collections.sort(al);
			System.out.println("Enter Country Name");
			String name = scanner.nextLine();
			for (Cricketer cricketer : al) {

				if (name.equals(cricketer.getCountryName())) {
					System.out.println(cricketer);
				}
			}
			break;
		}
		case 3:{
			ri.allT20Ditails(al);
			break;
		}
		case 4:{
			
			ri.allOddDitails(al);
			break;
		}
		case 5:{
			ri.allTestScore(al);
			break;
		}
		case 6:{
			Collections.sort(al);
			System.out.println("All cricketers details");
			System.out.println(al);
			ri.batsmenAverage(al);
			break;
		}
		case 7:{
			Collections.sort(al);
			System.out.println("All cricketers details");
			System.out.println(al);
			ri.bowlerAverage(al);
			break;
		}
		case 8:{
			Collections.sort(al);
			System.out.println("All cricketers details");
			System.out.println(al);
			ri.allRownder(al);
			break;
		}
		case 9:{
			ri.singleT20Score(al);
			break;
		}
		case 10:{
			ri.singleOddsScore(al);
			break;
		}
		case 11:{
			ri.singleTestScore(al);
			break;
		}
		}

	}

}
