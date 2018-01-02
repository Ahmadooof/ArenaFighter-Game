package Arenafighter;

public class Character {
	//fields
		private int powerF;
		private int powerS;
		private boolean islive;
		public String name;
		
	//default constructor
		public Character(){
			this.islive=true;
			this.powerS=0;
			this.powerF=0;
			this.name=null;
		}
		
	//method to set the power of two players
		public void setpower(int powerF,int powerS)
		{
			this.powerF=powerF;
			this.powerS=powerS;
		}
		
	//methods to get the power for the players!
		public int getPowerF()
		{
			return this.powerF;
		}
		public int getPowerS()
		{
			return this.powerS;
		}

		
		
		
		
		
}
