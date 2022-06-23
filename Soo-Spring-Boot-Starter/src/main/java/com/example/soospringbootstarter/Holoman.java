package com.example.soospringbootstarter;

public class Holoman {

	String name;
	int howLog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHowLog() {
		return howLog;
	}

	public void setHowLog(int howLog) {
		this.howLog = howLog;
	}

	@Override
	public String toString() {
		return "Holoman{" +
			"name='" + name + '\'' +
			", howLog=" + howLog +
			'}';
	}
}
