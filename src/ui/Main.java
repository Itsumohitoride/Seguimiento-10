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
		int option = 3;

		do{
			option = objMain.menu();
		}while(option != 3);
	}

	public void createChampionship(){

		System.out.println("**********************************************************************");
		System.out.println("                           GRAN CAMPEONATO                            ");
		System.out.println("**********************************************************************");

		System.out.println("Cual es el nombre del campeonato?");
		String nameChampion = lector.nextLine();
		
		System.out.println("Cual es el anio en el que se realizo la carrera?");
		int year = lector.nextInt();

		System.out.println("Cuantos grandes premios hubieron?");
		int races = lector.nextInt();

		System.out.println("**********************************************************************\n");

		champion = new Championship(year, races);
	}

	public int menu(){

		int option;

		System.out.println("Que desea hacer?:");
		System.out.println("(1) Registrar un piloto");
		System.out.println("(2) Mostrar promedios");
		System.out.println("(3) Salir");
		option = lector.nextInt();lector.nextLine();

		switch(option){
			case 1:
			if(champion.getPilot()[14] != null){
				System.out.println("**********************************************************************");
				System.out.println("Ya se registro el numero maximo de pilotos");
				System.out.println("**********************************************************************");
			}else{
				createPiloto();
			}
			break;
			case 2:
			showPilot();
			break;
			case 3:
			System.out.println("**********************************************************************");
			System.out.println("Gracias por utilizar nuestro software");
			System.out.println("**********************************************************************");
			break;
			default:
			System.out.println("**********************************************************************");
			System.out.println("Opcion invalida, digite de nuevo");
			System.out.println("**********************************************************************");
			break;
		}
		return option;
	}

	public void createPiloto(){

		String verific;
		String name;
		String team;
		boolean find = true;
		boolean verificTeam = false;
		int[] scores = new int[champion.getRaces()];

		do{

			System.out.println("**********************************************************************");
			System.out.println("                          REGISTRO DE PILOTO                          ");
			System.out.println("**********************************************************************\n");

			do{
				System.out.println("Ingrese el nombre completo del piloto");
				name = lector.nextLine();

				find = champion.findPilot(name); 

				if(find){
					System.out.println("El piloto ya se encuentra registrado, por favor ingrese otro");
				}	
			}while(find);

			System.out.println("Ingrese la edad del piloto");
			int age = lector.nextInt();
			lector.nextLine();

			System.out.println("\nIngrese el equipo al cual pertenece el piloto\n");

			System.out.println("                        **********************                        ");
			System.out.println("                        *  LISTA DE EQUIPOS  *                        ");
			System.out.println("                        **********************                        ");
			System.out.println("                        * - Scuderia Ferrari *                        ");
			System.out.println("                        * - Mclaren F1 Team  *                        ");
			System.out.println("                        * - Red Bull Recing  *                        ");
			System.out.println("                        * - Mercedes Amg     *                        ");
			System.out.println("                        * - Racing Point     *                        ");
			System.out.println("                        * - Alfa Romeo       *                        ");
			System.out.println("                        * - Renault          *                        ");
			System.out.println("                        * - Williams         *                        ");
			System.out.println("                        **********************\n                        ");

			do{
				team = lector.nextLine();

				if(!team.equalsIgnoreCase("Scuderia Ferrari") && !team.equalsIgnoreCase("Mclaren F1 Team") && !team.equalsIgnoreCase("Red Bull Recing") && !team.equalsIgnoreCase("Mercedes Amg") && !team.equalsIgnoreCase("Racing Point") && !team.equalsIgnoreCase("Alfa Romeo") && !team.equalsIgnoreCase("Renault") && !team.equalsIgnoreCase("Williams")){
					System.out.println("Nombre de equipo incorrecto, ingreselo nuevamente");
				}
				else{
					verificTeam = true;
				}
			}while(!verificTeam);

			for(int i = 0; i<champion.getRaces(); i++){
				System.out.println("Ingrese el tiempo en segundos de la carrera #"+(i+1));
				scores[i] = lector.nextInt();lector.nextLine();
			}

			if(champion.getPilot()[13] != null){
				System.out.println("**********************************************************************");
				System.out.println("Este es el ultimo piloto que se puede registrar");
				System.out.println("**********************************************************************");
				verific = "no";
			}
			else{
				System.out.println("Desea ingresar otro piloto (Si/No)");
				verific = lector.nextLine();
			}

			champion.addPilot(name,age,team,scores);
		}while(verific.equalsIgnoreCase("Si"));
	}

	public void showPilot(){

		System.out.println("**********************************************************************");
		System.out.println("                       PROMEDIO DE LOS PILOTOS                        ");
		System.out.println("**********************************************************************\n");

		String message = champion.showAverageTimes();

		System.out.println(message);
	}

}