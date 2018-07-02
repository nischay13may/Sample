package com.puzzle;

public class FindTheWinner {

	static String winner(int[] andrea, int[] maria, String s)
	{
		int sumOfAndrea=0;
		int sumOfMaria=0;
		if(s.equals("EVEN"))
		{
			sumOfAndrea=0;
			sumOfMaria=0;
			int length=andrea.length<=maria.length?andrea.length:maria.length;
			for(int i=0;i<length;i=i+2)
			{
				sumOfAndrea+=andrea[i]-maria[i];
				sumOfMaria+=maria[i]-andrea[i];
			}
		}
		else if(s.equals("ODD"))
		{
			sumOfAndrea=0;
			sumOfMaria=0;
			int length=andrea.length<=maria.length?andrea.length:maria.length;
			for(int i=1;i<length;i=i+2)
			{
				sumOfAndrea+=andrea[i]-maria[i];
				sumOfMaria+=maria[i]-andrea[i];
			}
		}
		else
			return null;
		
		if(sumOfAndrea==sumOfMaria)
			return "Tie";
		else
		{
			if(sumOfAndrea>sumOfMaria)
				return "Andrea";
			else
				return "Maria";
		}
	}
	public static void main(String[] args)
	{
		int[] andrea={1,2,3}; 
		int[] maria={2,1,3};
		String s="ODD";
		String result=winner(andrea,maria,s);
		System.out.println(result);
	}
}
