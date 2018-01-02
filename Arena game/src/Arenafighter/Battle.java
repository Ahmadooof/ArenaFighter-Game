package Arenafighter;

public class Battle {
		
		private int firstplayerwin=0;
		private int secondplayerwin=0;
	
			//counting winnings times for the players each round
		
			public void setFirstplayerwin()
			{
				this.firstplayerwin++;
			}
			public void setSecondplayerwin()
			{
				this.secondplayerwin++;
			}
			
			public int getFirstplayerwin()
			{
				return this.firstplayerwin;
			}
			public int getSecondplayerwin()
			{
				return this.secondplayerwin;
			}
}
