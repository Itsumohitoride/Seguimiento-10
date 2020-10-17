package model;

public class Championship{

	//Attribute

	public int year;
	public int races;

	//Relations

	private Pilot[] pilot;

	//Methods

	public Championship(int year, int races){

		this.year = year,
		this.races = races;
	}

	public void addPilot(String name, int age, Team team, int[] scores){

		boolean verific = false;
		String message = "Piloto registrado";

		for(int i = 0; i<15 && verific; i++){

			if(pilot[i] == null){
				
				pilot[i] = new Pilot(name, age, team, scores);
				verific = true;
			}
		}
	}

	public boolean findPilot(String name){

		boolean verific = false;

		for(int i = 0; i<15 && verific; i++){

			if(name.equalsIgnoreCase(pilot[i])){
				verific = true;
			}
		}
		return verific;
	}

	public String showAverageTimes(){

		String message = "";
		double residue;
		double hour;
		double minute;
		double second;

		for(int i = 0; i<15; i++){

			if(pilot[i] != null){

				residue = (pilot[i].calculateAverage() % 3600);
				hour = ((pilot[i].calculateAverage()-residue)/3600);
				minute = (residue/60);
				second = (residue % 60);

				message += "El piloto "+pilot[i].getName()+" tuvo un tiempo promedio de:"+hour+" horas "+minute+" minutos "+second+"segundos\n";
			}

		}
		return message;
	}

	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getRaces(){
		return races;
	}

	public void setRaces(int races){
		this.races = races;
	}
}