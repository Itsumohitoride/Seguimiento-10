package model;

public class Championship{

	//Attributte

	public int year;
	public int races;

	//Relations

	private Pilot[] pilot;

	//Methods

	public Championship(int year, int races){

		this.year = year,
		this.races = races;
	}

	public String addPilot(String name, int age, Team team, int[] scores){

		boolean verific = false;
		String message = "Piloto registrado";

		for(int i = 0; i<14 && !verific; i++){

			if(pilot[i] == null){
				if(pilot[i].equalsIgnoreCase(Pilot.getName())){
					message = "El piloto ya se encuentra registrado";
				}
				else{
					pilot[i] = new Pilot(name, age, team, scores);
				}
				
				verific = true;
			}
			else{
				message = "Ya se registraron todos los pilotos, no se pueden agregar mas";
			}
		}
	}

	public boolean findPilot(String name){

		boolean verific = false;

		for(int i = 0; i<14 && !verific; i++){

			if(name.equalsIgnoreCase(pilot[i])){
				verific = true;
			}
		}
		return verific;
	}

	public String showAverageTimes(){


	}

	public int 


}