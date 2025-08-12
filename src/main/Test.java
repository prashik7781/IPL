package main;
import service.TeamService;
public class Test {

	public static void main(String[] args) {
		TeamService service=new TeamService();
		service.printMITeamDetails();
		System.out.println("==================");
		service.printCskTeamDetails();
		System.out.println("==================");
		service.printRcbTeamDetails();
		System.out.println("==================");
		System.out.println("Test github");
		
	}

}
