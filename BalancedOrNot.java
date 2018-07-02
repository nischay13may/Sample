package com.puzzle;

import java.util.Stack;

public class BalancedOrNot {
	
	private static final char CH1='<';
	private static final char CH2='>';
	public static int[] balancedOrNot(String[] expressions, int[] maxReplacements)
	{
		int[] resultArr=new int[expressions.length];
		for(int i=0;i<expressions.length;i++)
		{
			resultArr[i]=check(expressions[i],maxReplacements[i]);
		}
		return resultArr;
	}
	public static int check(String expression, int maxReplacements)
	{
		int count=0;
		char[] charArray=expression.toCharArray();
		Stack<Character> stack= new Stack<Character>();
		for(char ch:charArray)
		{
			if(ch==CH1)
				stack.push(CH2);
			else if(stack.isEmpty())
				count++;
			else
				stack.pop();
		}
		if(stack.isEmpty())
			count+=stack.size();
		return count<=maxReplacements?1:0;
	}
	public static void main(String[] args)
	{
		String[] input = {"<>>>","<>>>>"};
		int[] maxRepInput={2,2};
		int[] result=balancedOrNot(input, maxRepInput);
		for(int i: result)
			System.out.println(i);
	}
	
}
