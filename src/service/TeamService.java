package service;
import repository.TeamRepository;
import entity.Team;
import java.util.*;
public class TeamService {
	
	public static void printTeamDetails() {
		System.out.println(TeamRepository.getMITeamDetails());
		System.out.println(TeamRepository.getCskTeamDetails());
		System.out.println(TeamRepository.getRcbTeamDetails());
		System.out.println(TeamRepository.getKKRTeamDetails());
		System.out.println(TeamRepository.getGTTeamDetails());
		System.out.println(TeamRepository.getRRTeamDetails());
		System.out.println(TeamRepository.getDCTeamDetails());
		System.out.println(TeamRepository.getLSGTeamDetails());
		System.out.println(TeamRepository.getSRHTeamDetails());
		System.out.println(TeamRepository.getPBKSTeamDetails());
	}
	public void selectOption() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to IPL portal");
		System.out.println("Enter your choices(1,2 & 3)");
		System.out.println("1:Get All teams Details");
		System.out.println("2:Get team detail based on short name ");
		System.out.println("3:Get team details based on id");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("you enter 1");
			System.out.println("All Teams Details: ");
			printTeamDetails();
			break;
		case 2:
			System.out.println("Enter the short name of your team: ");
			String teamShortName=sc.next().toUpperCase();
			System.out.println("You enter: "+teamShortName);
			getTeamByShortName(teamShortName);
			break;
		case 3:
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			System.out.println("You enter id: "+id);
			getTeamById(id);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: "+choice);
		}
		
	}
	// method to get the team by short name
	public static void getTeamByShortName(String sn) {
		switch(sn) {
		case "MI":
			System.out.println(TeamRepository.getMITeamDetails());
			break;
		case "CSK":
			System.out.println(TeamRepository.getCskTeamDetails());
			break;
		case "RCB":
			System.out.println(TeamRepository.getRcbTeamDetails());
			break;
		case "KKR":
			System.out.println(TeamRepository.getKKRTeamDetails());
			break;
		case "GT":
			System.out.println(TeamRepository.getGTTeamDetails());
			break;
		case "RR":
			System.out.println(TeamRepository.getRRTeamDetails());
			break;
		case "PBKS":
			System.out.println(TeamRepository.getPBKSTeamDetails());
			break;
		case "DC":
			System.out.println(TeamRepository.getDCTeamDetails());
			break;
		case "LSG":
			System.out.println(TeamRepository.getLSGTeamDetails());
			break;
		case "SRH":
			System.out.println(TeamRepository.getSRHTeamDetails());
			break;
		default:
				throw new IllegalArgumentException("Unexpected value: "+sn);
		}
	}
	// method to get the team by id
	public static void getTeamById(int teamId) {
		if(teamId==101) {
			System.out.println(TeamRepository.getMITeamDetails());
		}else if(teamId==102) {
			System.out.println(TeamRepository.getCskTeamDetails());
		}else if(teamId==103) {
			System.out.println(TeamRepository.getRcbTeamDetails());
		}else if(teamId==104) {
			System.out.println(TeamRepository.getKKRTeamDetails());
		}else if(teamId==105) {
			System.out.println(TeamRepository.getRRTeamDetails());
		}else if(teamId==106) {
			System.out.println(TeamRepository.getGTTeamDetails());
		}else if(teamId==107) {
			System.out.println(TeamRepository.getLSGTeamDetails());
		}else if(teamId==108) {
			System.out.println(TeamRepository.getPBKSTeamDetails());
		}else if(teamId==109) {
			System.out.println(TeamRepository.getDCTeamDetails());
		}else if(teamId==110) {
			System.out.println(TeamRepository.getSRHTeamDetails());
		}
		else {
			throw new IllegalArgumentException("Unexpected value: "+teamId);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
//	public void printMITeamDetails() {
//		Team team1=TeamRepository.getMITeamDetails();
//		System.out.println(team1.getId());
//		System.out.println(team1.getTeamName());
//		System.out.println(team1.getCaptainName());
//		System.out.println(team1.getCoachName());
//		System.out.println(team1.getnRR());
//		System.out.println(team1.isQualified());
//	
	
}
