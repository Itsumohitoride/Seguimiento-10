package model;

public class Pilot{

	//Constant
	
	enum Team{
		DEFAULT,SCUDERIA_FERRARI, MCLAREN_F1_TEAM, RED_BULL_RACING, MERCEDES_AMG, RACING_POINT, ALFA_ROMEO, RENAULT, WILLIAMS;
	}

	//Attribute

	private String name;
	private int age;
	private Team team;
	private int[] scores;

	//Method

	public Pilot(String name, int age, int[] scores){

		this.name = name;
		this.age = age;
		this.team = Team.DEFAULT;
		this.scores = scores;
	}


	public double calculateAverage(){

		double average = 0;

		for(int i = 0; i<scores.length; i++){
			average += scores[i];
		}

		average = average/scores.length;

		return average;
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

	public Team getTeam(){
		return team;
	}

	public void setTeam(Team team){
		this.team = team;
	}

	public int[] getScores(){
		return scores;
	}

	public void setScores(int[] scores){
		this.scores = scores;
	}

	public void addTeam(String team){

		if(team.equalsIgnoreCase("Scuderia Ferrari")){
			setTeam(Team.SCUDERIA_FERRARI);
		}
		if(team.equalsIgnoreCase("Mclaren F1 Team")){
			setTeam(Team.MCLAREN_F1_TEAM);
		}
		if(team.equalsIgnoreCase("Red Bull Recing")){
			setTeam(Team.RED_BULL_RACING);
		}
		if(team.equalsIgnoreCase("Mercedes Amg")){
			setTeam(Team.MERCEDES_AMG);
		}
		if(team.equalsIgnoreCase("Racing Point")){
			setTeam(Team.RACING_POINT);
		}
		if(team.equalsIgnoreCase("Alfa Romeo")){
			setTeam(Team.ALFA_ROMEO);
		}
		if(team.equalsIgnoreCase("Renault")){
			setTeam(Team.RENAULT);
		}
		if(team.equalsIgnoreCase("Williams")){
			setTeam(Team.WILLIAMS);
		}
	}
}
