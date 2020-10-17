package ui;
import java.util.Scanner;
import model.Championship;

public class Main{

	//Attribute

	private Championship champion;

	//Global variable

	public Scanner lector;

	public Main(){

		lector = new Scanner(System.in);
		createChampionship();
	}

	public static void main(String[] args){

		Main objMain = new Main();
		objMain.createPiloto(races);
		champion.showAverageTimes();
	}

	public void createChampionship(){

		System.out.println("**********************************************************************");
		System.out.println("                           GRAN CAMPEONATO                            ");
		System.out.println("**********************************************************************");

		System.out.println("Cual es el nombre del campeonato?");
		String nameChampion = lector.nextLine();
		
		System.out.println("Cual es el año en el que se realizo la carrera?");
		int year = lector.nextInt();

		System.out.println("Cuantos grandes premios hubieron?");
		int races = lector.nextInt();

		System.out.println("**********************************************************************\n");

		champion = new Championship(year, races);
	}

	public void createPiloto(int races){

		String verific = "si";
		int[] scores = new int[races];

		while(verific.equalsIgnoreCase("si")){

			System.out.println("**********************************************************************");
			System.out.println("                          REGISTRO DE PILOTO                          ");
			System.out.println("**********************************************************************\n");

			do{
				System.out.println("Ingrese el nombre completo del piloto");
				String name = lector.nextLine();lector.nextLine();

				if(champion.findPilot() == true){
					System.out.println("El piloto ya se encuentra registrado, por favor ingrese otro");
				}	
			}while(champion.findPilot() == true);

			System.out.println("Ingrese la edad del piloto");
			int age = lector.nextInt();

			System.out.println("Ingrese el equipo al cual pertenece el piloto");
			String team = lector.nextLine();

			for(int i = 0; i<=races; i++){
				System.out.println("Ingrese el tiempo de la carrera #"+i);
				scores[i] = lector.nextInt();
			}

			do{
				System.out.println("Desea ingresar otro piloto (Si/No)");
				verific = lector.nextLine();
			}while(verific.equalsIgnoreCase("si") || verific.equalsIgnoreCase("No"));

			champion.addPilot(name,age,team,scores);
			
		}
	}

	public void showPilot(){


	}

}