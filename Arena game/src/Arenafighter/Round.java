package Arenafighter;

public class Round {

		private int damageF;
		private int damageS;
		
		
		//attacking each other
		public void attack(int powerF,int powerS) {
			if(powerF>powerS)
			{
				this.damageS=powerS/2;
				this.damageF=powerF;
			}
			else if(powerS>powerF)
			{
				this.damageF=powerF/2;
				this.damageS=powerS;
			}
		}
			
		//method to get the damage from player
			public int getDamageF()
			{
				return this.damageF;
			}
			public int getDamageS()
			{
				return this.damageS;
			}
					
	}
