package GolfGame;
import java.util.*;

public class Result {
		public int counter;
		public int i;
		public int wincounter;
		
		ArrayList<Swing> SwingsList=new ArrayList<Swing>();
		
		public void StoreSwing(Swing StartObject) {
			
			Swing SwingObject=new Swing(StartObject.getAngle(),StartObject.getVelocity()
			,StartObject.getDistanceToGoal(),StartObject.getDistanceEachSwing());
			SwingsList.add(SwingObject);
		}

		public void PrintSwing() {
			System.out.printf("The Distance which travel the ball through"
					+ " this swing:%s Meter \n",
					(int)SwingsList.get(counter).getDistanceEachSwing());
			
			System.out.printf("The Distance to "
					+ "Goal is:%s Meter\n",
					(int)SwingsList.get(counter).getDistanceToGoal());
			
		}

			public void CheckForResultEachSwing() {
				
				if((int)SwingsList.get(counter).getDistanceToGoal()==0)
				{
					System.out.println("\n\n 							You Win						\n\n");
					wincounter++;
					StopGame();
				}
				StopGame();
				counter++;
			}
			public boolean StopGame()
			{
				if(wincounter==1)
				{
					return true;
				}
				if(wincounter==0 && counter==5)
				{
					System.out.println("\n\n 							You Lost						\n\n");
					return true;
				}
				return false;
			}

			public void PrintLog(Swing startObject) {
				
				System.out.println("		Velocity	Angle	Distance for this swing		Distance to Goal");
				System.out.print("First Swing:	   ");
				PrintValues();
				System.out.print("Second Swing:	   ");
				PrintValues();
				System.out.print("third Swing:	   ");
				PrintValues();
				System.out.print("Fourth Swing:	   ");
				PrintValues();
				System.out.print("Fifth Swing:	   ");
				PrintValues();
			}
			public void PrintValues()
			{
				
				System.out.println((int)SwingsList.get(i).getVelocity()+" 		 "
						+(int)SwingsList.get(i).getAngle()+"	        "+(int)SwingsList.get(i).getDistanceEachSwing()
						+"   	   	 	       "+(int)SwingsList.get(i).getDistanceToGoal());
				i++;
			}

			
			

}
