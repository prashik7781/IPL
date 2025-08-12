package repository;
import entity.Team;
public class TeamRepository {
	public static Team getMITeamDetails() {
		Team team1=new Team();
		team1.setId(101);
		team1.setTeamName("Mumbai Indians");
		team1.setCaptainName("Hardik Pandya");
		team1.setCoachName("Mahila Jaywardhane");
		team1.setQualified(true);
		team1.setnRR(2.3f);
		
		return team1;
	}
	
	public static Team getCskTeamDetails() {
		Team team2=new Team();
		team2.setId(102);
		team2.setTeamName("Chennai Super Kings");
		team2.setCoachName("Stephan Fleming");
		team2.setCaptainName("MS Dhoni");
		team2.setnRR(2.33f);
		team2.setQualified(true);
		
		return team2;
	}
	
	public static Team getRcbTeamDetails() {
		Team team=new Team();
		team.setId(103);
//		team3.setTeamName("Royal Challengers Bangluru");
//		team3.setCoachName("Andy Flower");
//		team3.setCaptainName("Rajat Patidar");
//		team3.setnRR(2.01f);
//		team3.setQualified(true);
		
		return team;
	}
	
	public static Team getKKRTeamDetails() {
		Team team4=new Team();
		team4.setId(104);
		team4.setTeamName("Kolkata Knight Rideres");
		team4.setCoachName("Chandrakant Pandit");
		team4.setCaptainName("Ajinkya Rahane");
		team4.setnRR(1.81f);
		team4.setQualified(true);
		
		return team4;
	}
	
	public static Team getRRTeamDetails() {
		Team team5=new Team();
		team5.setId(105);
		team5.setTeamName("Rajsthan Royals");
		team5.setCoachName("Rahul Dravid");
		team5.setCaptainName("Sanju Samson");
		team5.setnRR(1.21f);
		team5.setQualified(false);
		
		return team5;
	}
	
	public static Team getGTTeamDetails() {
		Team team6=new Team();
		team6.setId(106);
		team6.setTeamName("Gujrat Titans");
		team6.setCoachName("Ashish Nehara");
		team6.setCaptainName("Shubhman Gill");
		team6.setnRR(1.81f);
		team6.setQualified(false);
		
		return team6;
	}
	
	public static Team getLSGTeamDetails() {
		Team team7=new Team();
		team7.setId(107);
		team7.setTeamName("Lakhnow Super Giants");
		team7.setCoachName("Ashish Nehara");
		team7.setCaptainName("Rishabh Pant");
		team7.setnRR(1.81f);
		team7.setQualified(false);
		
		return team7;	
	}
	
	public static Team getPBKSTeamDetails() {
		Team team8=new Team();
		team8.setId(108);
		team8.setTeamName("Punjab Kings");
		team8.setCoachName("Ricky Ponting");
		team8.setCaptainName("Shreyas Iyer");
		team8.setnRR(0.81f);
		team8.setQualified(false);
		
		return team8;
	}
	
	public static Team getDCTeamDetails() {
		Team team9=new Team();
		team9.setId(109);
		team9.setTeamName("Delhi Capitals");
		team9.setCoachName("Hemang Badani");
		team9.setCaptainName("Axar Patel");
		team9.setnRR(-1.90f);
		team9.setQualified(false);
		
		return team9;
	}
	
	public static Team getSRHTeamDetails() {
		Team team10=new Team();
		team10.setId(110);
		team10.setTeamName("Sunrisers Hyderabad");
		team10.setCoachName("Daniel Vettori");
		team10.setCaptainName("Pat Cummins");
		team10.setnRR(-1.66f);
		team10.setQualified(false);
		
		return team10;
	}
}
