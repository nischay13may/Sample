package com.puzzle;

public class PyschometricTesting{
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits)
	{
		int[] result= new int[lowerLimits.length];
		for(int j=0;j<lowerLimits.length;j++)
		{
			for(int i=0;i<scores.length;i++)
			{
				if(scores[i]>=lowerLimits[j] && scores[i]<=upperLimits[j])
				result[j]++;
			}
		}
		return result;
	}
	public static void main(String[] args){
		int[] scores={4,8,7};
		int[] lowerLimits={2,4};
		int[] upperLimits={8,4};
		for(int i:jobOffers(scores,lowerLimits,upperLimits))
		{
			System.out.println(i);
		}
	}
}