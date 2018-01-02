package Arenafighter;
import java.util.Random;
import java.util.Scanner;
public class main {

	//this game has 1 Battle with 3 rounds, each round there is some one going win and the other die!
	//then it's show if you winning the battle by calculating how many rounds you win,,
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Random randomgenerator= new Random();
		Battle battleObject=new Battle();
		String answer;
		
		// Variables
		int roundcounter=0;
		int powerfirstplayer,powersecondplayer;
		Round roundObject=new Round();
		
		// Enter your name
		Character characterObject=new Character();
		System.out.print("Enter your name to Start the game: ");
		characterObject.name=input.nextLine();
		do {
			//generating two numbers every round to give the power to players 
			do {
				powerfirstplayer=randomgenerator.nextInt(6)+1;
				powersecondplayer=randomgenerator.nextInt(6)+1;
			}while((powerfirstplayer==powersecondplayer));
			
			characterObject.setpower(powerfirstplayer,powersecondplayer);
			
			System.out.println(characterObject.name+"\t\tVs\t\t"+"Computer");
			System.out.println("power:"+characterObject.getPowerF()+"\t\t\t\t"+"power:"+characterObject.getPowerS());
			
		do {
		if(powerfirstplayer>powersecondplayer)
		{
			System.out.print("Press any key for attacking opponent. . .");
			input.nextLine();
			System.out.println(characterObject.name+"\t\t\t\t"+"Computer");
			//attack
			roundObject.attack(powerfirstplayer,powersecondplayer);
			System.out.println("power:"+roundObject.getDamageF()+"\t\t\t\t"+"power:"+roundObject.getDamageS());
			powersecondplayer=roundObject.getDamageS();
		}
		if(powersecondplayer>powerfirstplayer)
		{
			System.out.print("Press any key for Defence. . .");
			input.nextLine();
			System.out.println();
			System.out.println(characterObject.name+"\t\t\t\t"+"Computer");
			//attack
			roundObject.attack(powerfirstplayer,powersecondplayer);
			System.out.println("power:"+roundObject.getDamageF()+"\t\t\t\t"+"power:"+roundObject.getDamageS());
			powerfirstplayer=roundObject.getDamageF();
		}
		}while(powerfirstplayer!=0 && powersecondplayer!=0);
		
		//this counter check if the Battle is end>>
		roundcounter++;
		
		if(powerfirstplayer==0)
		{
			battleObject.setSecondplayerwin();
			System.out.println("You die in this round, do u wanna retire(Y/N)?");
			answer=input.nextLine();

			if((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y")))
			{
				if(battleObject.getFirstplayerwin() > battleObject.getSecondplayerwin() )
				{
					System.out.println("you win the battle and the result is: you win "+battleObject.getFirstplayerwin()
					+" rounds the opponent "+battleObject.getSecondplayerwin()+" rounds");
				}
				if(battleObject.getFirstplayerwin() < battleObject.getSecondplayerwin() )
				{
					System.out.println("you loose the battle and the result is: you win "+battleObject.getFirstplayerwin()
					+" rounds the opponent "+battleObject.getSecondplayerwin()+" rounds");
				}
				
				System.exit(0);
			}
			if((answer.equalsIgnoreCase("n")) || (answer.equalsIgnoreCase("No")))
			{
				System.out.println("let's go to the next round. . .");
			}
			
		}

		if(powersecondplayer==0)
		{
			battleObject.setFirstplayerwin();
			System.out.println("The opponent die in this round, do u wanna retire(Y/N)?");
			answer=input.nextLine();

			if((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y")))
			{
				if(battleObject.getFirstplayerwin() > battleObject.getSecondplayerwin() )
				{
					System.out.println("you win the battle and the result is: you win "+battleObject.getFirstplayerwin()
					+" rounds the opponent "+battleObject.getSecondplayerwin()+" rounds");
				}
				if(battleObject.getFirstplayerwin() < battleObject.getSecondplayerwin() )
				{
					System.out.println("you loose the battle and the result is: you win "+battleObject.getFirstplayerwin()
					+" rounds the opponent "+battleObject.getSecondplayerwin()+" rounds");
				}
				
				System.exit(0);
			}
			if((answer.equalsIgnoreCase("n")) || (answer.equalsIgnoreCase("No") && (roundcounter!=3)))
			{
				System.out.println("let's go to the next round. . .");
			}
		}
		}while(roundcounter!=3);
		
		if(battleObject.getFirstplayerwin() > battleObject.getSecondplayerwin() )
		{
			System.out.println("you win the battle and the result is: you win "+battleObject.getFirstplayerwin()
			+" rounds the opponent "+battleObject.getSecondplayerwin()+" rounds");
		}
		if(battleObject.getFirstplayerwin() < battleObject.getSecondplayerwin() )
		{
			System.out.println("you loose the battle and the result is: you win "+battleObject.getFirstplayerwin()
			+" rounds the opponent "+battleObject.getSecondplayerwin()+" rounds");
		}
		
	}

}
