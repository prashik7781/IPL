package repository;
import entity.Team;
public class TeamRepository {
	public static Team getMITeamDetails() {
		Team team=new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Mahila Jaywardhane");
		team.setQualified(true);
		team.setnRR(2.3f);
		team.setShortName("MI");
		
		return team;
	}
	
	public static Team getCskTeamDetails() {
		Team team=new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCoachName("Stephan Fleming");
		team.setCaptainName("MS Dhoni");
		team.setnRR(2.33f);
		team.setQualified(true);
		team.setShortName("CSK");
		
		return team;
	}
	
	public static Team getRcbTeamDetails() {
		Team team=new Team();
		team.setId(103);
		team.setTeamName("Royal Challengers Bangluru");
		team.setCoachName("Andy Flower");
		team.setCaptainName("Rajat Patidar");
		team.setnRR(2.01f);
		team.setQualified(true);
		team.setShortName("RCB");
		
		return team;
	}
	
	public static Team getKKRTeamDetails() {
		Team team=new Team();
		team.setId(104);
		team.setTeamName("Kolkata Knight Rideres");
		team.setCoachName("Chandrakant Pandit");
		team.setCaptainName("Ajinkya Rahane");
		team.setnRR(1.81f);
		team.setQualified(true);
		team.setShortName("KKR");
		return team;
	}
	
	public static Team getRRTeamDetails() {
		Team team=new Team();
		team.setId(105);
		team.setTeamName("Rajsthan Royals");
		team.setCoachName("Rahul Dravid");
		team.setCaptainName("Sanju Samson");
		team.setnRR(1.21f);
		team.setQualified(false);
		team.setShortName("RR");
		
		return team;
	}
	
	public static Team getGTTeamDetails() {
		Team team=new Team();
		team.setId(106);
		team.setTeamName("Gujrat Titans");
		team.setCoachName("Ashish Nehara");
		team.setCaptainName("Shubhman Gill");
		team.setnRR(1.81f);
		team.setQualified(false);
		team.setShortName("GT");
		return team;
	}
	
	public static Team getLSGTeamDetails() {
		Team team=new Team();
		team.setId(107);
		team.setTeamName("Lakhnow Super Giants");
		team.setCoachName("Ashish Nehara");
		team.setCaptainName("Rishabh Pant");
		team.setnRR(1.81f);
		team.setQualified(false);
		team.setShortName("LSG");
		return team;	
	}
	
	public static Team getPBKSTeamDetails() {
		Team team=new Team();
		team.setId(108);
		team.setTeamName("Punjab Kings");
		team.setCoachName("Ricky Ponting");
		team.setCaptainName("Shreyas Iyer");
		team.setnRR(0.81f);
		team.setQualified(false);
		team.setShortName("PBKS");
		return team;
	}
	
	public static Team getDCTeamDetails() {
		Team team=new Team();
		team.setId(109);
		team.setTeamName("Delhi Capitals");
		team.setCoachName("Hemang Badani");
		team.setCaptainName("Axar Patel");
		team.setnRR(-1.90f);
		team.setQualified(false);
		team.setShortName("DC");
		return team;
	}
	
	public static Team getSRHTeamDetails() {
		Team team=new Team();
		team.setId(110);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCoachName("Daniel Vettori");
		team.setCaptainName("Pat Cummins");
		team.setnRR(-1.66f);
		team.setQualified(false);
		team.setShortName("SRH");
		return team;
	}
}
