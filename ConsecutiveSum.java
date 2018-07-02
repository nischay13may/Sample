package com.puzzle;

public class ConsecutiveSum {

	static int consecutive(long num)
	{
		int sum=0;
		int count=0;
		for(int i=1;i<=num/2+1;i++)
		{
			sum=0;
			for(int j=i;j<=num/2+1;j++)
			{
				sum+=j;
				if(sum>num)
					break;
				else if(sum==num)
				{
					count++;
					break;
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(consecutive(10));
	}

}