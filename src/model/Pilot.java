package model;

public class Pilot{

	//Constant
	
	public enum Team{
		SCUDERIA_FERRARI, MCLAREN_F1_TEAM, RED_BULL_RACING, MERCEDES_AMG, RACING_POINT, ALFA_ROMEO, RENAULT, WILLIAMS;
	}

	//Attribute

	private Strign name;
	private int age;
	private Team team;
	private int[] scores;

	//Method

	public Pilot(String name, int age, Team team, int[] scores){

		this.name = name;
		this.age = age;
		this.team = team;
		this.scores = scores;
	}

	public double calculateAverage(){

	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String team(){
		return team;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public int getScores(){
		return scores;
	}

	public void setScores(){
		this.scores = scores;
	}
}
	