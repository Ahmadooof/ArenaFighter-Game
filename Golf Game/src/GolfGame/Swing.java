package GolfGame;
import java.util.*;
public class Swing {
		
		//Constructors --------------------------------	
		public Swing()
		{

		}
	
	
		public Swing(double angle,double velocity,double DistanceToGoal,double DistanceEachSwing)
		{
		this.angle=angle;
		this.velocity=velocity;
		this.DistanceEachSwing=DistanceEachSwing;
		this.DistanceToGoal=DistanceToGoal;
		}
	
	
		//Variables	--------------------------------	
		Scanner input=new Scanner(System.in);
		private double velocity,angle,RadAngle,DistanceEachSwing,DistanceToGoal=882;
		private final double Gravity=9.8;
		
		
		//Getters and Setters --------------------------------	
		public double getVelocity() {
			return velocity;
		}


		public double getAngle() {
			return angle;
		}


		public double getDistanceEachSwing() {
			return DistanceEachSwing;
		}


		public double getDistanceToGoal() {
			return DistanceToGoal;
		}

		// Methods --------------------------------	
		public void SwingBall()
		{
			//checking for Angle and Velocity input
			do {
			System.out.print("Enter the Angle: ");
			this.angle=input.nextDouble();
			RadAngle=(Math.PI/180)*angle;
			if(angle<=5 || angle >=85)
				System.out.println("Invalid input !!");
			}while(angle<=5 || angle >=80);
			
			do {
				System.out.print("Enter the Velocity: ");
				this.velocity=input.nextDouble();
				if(velocity<1 || velocity >=94)
					System.out.println("Invalid input !!");
			}while(velocity<1 || velocity>=94);
			
		}
		// Calculating Distance for each Swing and to goal
		public void CalculateDistance()
		{
			DistanceEachSwing=Math.pow(this.velocity,2)/Gravity*Math.sin(2*RadAngle);
			DistanceToGoal=DistanceToGoal-DistanceEachSwing;
			if(DistanceToGoal<-0.1)
			{
				DistanceToGoal=-DistanceToGoal;
			}
		}


		
		
	
	
}
