package Day4_Ass;



public class Qus2{
static int Batsman_in_Team=0;
static int Bowler_in_Team=0;
static int AllRounder_in_Team=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[] {"Sachin-Batsman","RAHUL-Batsman","Dhoni-AllRounder",
				"Virat-Batsman","Jadeja-AllRounder","Bhuvi-Bowler","Shami-Bowler","Bumrah-Bowler","Rohit-Batsman","Raina-AllRounder"
				,"Dhawan-Batsman","Harbhajan-AllRounder"};
		
		for (int i=0; i<strArray.length; i++)  
		{  
			if (strArray[i].contains("Batsman")) { 
			Batsman_in_Team++;
			}
			else if(strArray[i].contains("Bowler")){ 
				Bowler_in_Team++;
				}
			else {
					AllRounder_in_Team++;		
			}
		}
		System.out.println("BatmanCount:"+ Batsman_in_Team);
		
		System.out.println("BowlerCount:"+ Bowler_in_Team);

		System.out.println("AllRounderCount:"+ AllRounder_in_Team);
	}

}

