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

		for(int i = 0; i<15; i++){

			if(){
				message += "El piloto "+pilot[i].getName()+" tuvo un promedio de \n";
			}

		}
		return message;
	}
}