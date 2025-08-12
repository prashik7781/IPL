package service;
import repository.TeamRepository;
import entity.Team;
public class TeamService {
	public void printMITeamDetails() {
		Team team1=TeamRepository.getMITeamDetails();
		System.out.println(team1.getId());
		System.out.println(team1.getTeamName());
		System.out.println(team1.getCaptainName());
		System.out.println(team1.getCoachName());
		System.out.println(team1.getnRR());
		System.out.println(team1.isQualified());
	}
	public void printCskTeamDetails() {
		Team team1=TeamRepository.getCskTeamDetails();
		System.out.println(team1.getId());
		System.out.println(team1.getTeamName());
		System.out.println(team1.getCaptainName());
		System.out.println(team1.getCoachName());
		System.out.println(team1.getnRR());
		System.out.println(team1.isQualified());
	}
	public void printRcbTeamDetails() {
		Team team=TeamRepository.getRcbTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCoachName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}
	
	
}
