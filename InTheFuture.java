package com.puzzle;

public class InTheFuture {
	
	static int minNum(int A, int K, int P)
	{
		int count=0;
		int A1=A;
		int K1=K;
		if(A>=K)
			return -1;
		else if(A+P==K)
			return 1;
		else
		{
			do
			{
				count++;
				A=A+A1;
				K=K+K1;
						
			}
			while(K<=A+P);
			return count+1;
		}
	}
	public static void main(String[] args)
	{
		int result=minNum(3,5,1);
		System.out.println(result);
	}

}
