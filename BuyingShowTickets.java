package com.puzzle;

import java.util.ArrayList;
import java.util.List;

public class BuyingShowTickets {
	
	private static long waitingTime(int[] tickets, int p)
	{
		long count= 0L;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<tickets.length;i++)
		{
			list.add(tickets[i]);
		}
		final int size=list.size();
		boolean done=false;
		while(!done){
			for(int j=0;j<size;j++){
				if(list.get(j)==0)
					continue;
				if(list.get(p)==0){
					done=true;
					break;
				}
				list.set(j,list.get(j)-1);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int[] tickets={2,3,2,2};
		int p=2;
		long result=waitingTime(tickets,p);
		System.out.println(result);
	}

}
