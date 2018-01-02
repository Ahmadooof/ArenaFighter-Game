package GolfGame;

import java.awt.Checkbox;
import java.awt.im.InputContext;
import java.util.*;

public class main{

	public static void main(String[] args) {
		//You can swing 5 times until you win or loose;
		Swing StartObject=new Swing();
		Result ResultObject=new Result();
		do
		{
		StartObject.SwingBall();
		StartObject.CalculateDistance();
		ResultObject.StoreSwing(StartObject);
		ResultObject.PrintSwing();
		ResultObject.CheckForResultEachSwing();
		}while((ResultObject.StopGame()!=true));
		ResultObject.PrintLog(StartObject);
		
	}

}
