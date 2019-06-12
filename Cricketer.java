package com.pennant.CricketSecondExample;

import java.util.Comparator;

public class Cricketer implements Comparable<Cricketer>{
private String name;
private int rank;
private  int numberOfMatchesInOds;
private int numberOfMatchesInTests;
private int numberOfMatchesInT20;
private int highScoreInOds;
private int highScoreInTests;
private int highScoreInT20;
private int totalScoreInOds;
private int totalScoreInTests;
private int totalScoreInT20;
private int totalWicketsInOds;
private int totalWicketsInTests;
private int totalWicketsInT20;

private String playerType;
private String countryName;
private int highestWicketsInOds;
private int highestWicketsInTests;
private int highestWicketsInT20;
public Cricketer(String name, int rank, int numberOfMatchesInOds, int numberOfMatchesInTests, int numberOfMatchesInT20,
		int highScoreInOds, int highScoreInTests, int highScoreInT20, int totalScoreInOds, int totalScoreInTests,
		int totalScoreInT20, int totalWicketsInOds, int totalWicketsInTests, int totalWicketsInT20, String playerType,
		String countryName, int highestWicketsInOds, int highestWicketsInTests, int highestWicketsInT20) {
	super();
	this.name = name;
	this.rank = rank;
	this.numberOfMatchesInOds = numberOfMatchesInOds;
	this.numberOfMatchesInTests = numberOfMatchesInTests;
	this.numberOfMatchesInT20 = numberOfMatchesInT20;
	this.highScoreInOds = highScoreInOds;
	this.highScoreInTests = highScoreInTests;
	this.highScoreInT20 = highScoreInT20;
	this.totalScoreInOds = totalScoreInOds;
	this.totalScoreInTests = totalScoreInTests;
	this.totalScoreInT20 = totalScoreInT20;
	this.totalWicketsInOds = totalWicketsInOds;
	this.totalWicketsInTests = totalWicketsInTests;
	this.totalWicketsInT20 = totalWicketsInT20;
	this.playerType = playerType;
	this.countryName = countryName;
	this.highestWicketsInOds = highestWicketsInOds;
	this.highestWicketsInTests = highestWicketsInTests;
	this.highestWicketsInT20 = highestWicketsInT20;
}

public String getName() {
	return name;
}

public int getRank() {
	return rank;
}

public int getNumberOfMatchesInOds() {
	return numberOfMatchesInOds;
}

public int getNumberOfMatchesInTests() {
	return numberOfMatchesInTests;
}

public int getNumberOfMatchesInT20() {
	return numberOfMatchesInT20;
}

public int getHighScoreInOds() {
	return highScoreInOds;
}

public int getHighScoreInTests() {
	return highScoreInTests;
}

public int getHighScoreInT20() {
	return highScoreInT20;
}

public int getTotalScoreInOds() {
	return totalScoreInOds;
}

public int getTotalScoreInTests() {
	return totalScoreInTests;
}

public int getTotalScoreInT20() {
	return totalScoreInT20;
}

public int getTotalWicketsInOds() {
	return totalWicketsInOds;
}

public int getTotalWicketsInTests() {
	return totalWicketsInTests;
}

public int getTotalWicketsInT20() {
	return totalWicketsInT20;
}

public String getPlayerType() {
	return playerType;
}

public String getCountryName() {
	return countryName;
}

public int getHighestWicketsInOds() {
	return highestWicketsInOds;
}

public int getHighestWicketsInTests() {
	return highestWicketsInTests;
}

public int getHighestWicketsInT20() {
	return highestWicketsInT20;
}

@Override
public String toString() {
	return "Cricketer [name=" + name + ", rank=" + rank + ", numberOfMatchesInOds=" + numberOfMatchesInOds
			+ ", numberOfMatchesInTests=" + numberOfMatchesInTests + ", numberOfMatchesInT20=" + numberOfMatchesInT20
			+ ", highScoreInOds=" + highScoreInOds + ", highScoreInTests=" + highScoreInTests + ", highScoreInT20="
			+ highScoreInT20 + ", totalScoreInOds=" + totalScoreInOds + ", totalScoreInTests=" + totalScoreInTests
			+ ", totalScoreInT20=" + totalScoreInT20 + ", totalWicketsInOds=" + totalWicketsInOds
			+ ", totalWicketsInTests=" + totalWicketsInTests + ", totalWicketsInT20=" + totalWicketsInT20
			+ ", playerType=" + playerType + ", countryName=" + countryName + ", highestWicketsInOds="
			+ highestWicketsInOds + ", highestWicketsInTests=" + highestWicketsInTests + ", highestWicketsInT20="
			+ highestWicketsInT20 + "]\n";
}









@Override
public int compareTo(Cricketer o) {
	// TODO Auto-generated method stub
	return this.getRank()-o.getRank();
}
}

