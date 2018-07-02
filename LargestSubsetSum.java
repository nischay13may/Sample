package com.puzzle;

public class LargestSubsetSum {

	static long[] maxSubsetSum(int[] k)
	{
		int sum=0;
		long[] result= new long[k.length];
		for(int i=0;i<k.length;i++)
		{
			sum=0;
			for(int j=1;j<=k[i];j++)
			{
				if(k[i]%j==0)
					sum+=j;
			}
			result[i]=sum;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int[] input={2,4};
		long[] result=maxSubsetSum(input);
		for(long r:result)
			System.out.println(r);
	}
}
