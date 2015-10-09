import java.util.*;

public class Eleven
{
	public static Set<Integer []> makeChange(muny)
	{
		return makeChange(muny, 0);
	}

	public static Set<Integer []> makeChange(double muny, int coin)
	{	
		Set <Integer []> allSets = new Set<Integer []>();

		switch(coin)
		{
			case 0: //Quarters
			for (int quarters = 0; i < (int) muny/quarters; i -= .25)
			{	

			}
				break;
			case 1: //Dimes
				break;
			case 2: //Nickels 
				break;
			case 3: // Pennys
			break;
		}
	}
	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		Double muny = s.nextDouble();
		System.out.println(makeChange(muny));
	}
}