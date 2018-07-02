package com.puzzle;

public class TwoCircles {
	
	private static final String TOUCHING="Touching";
	private static final String INTERSECTING="Intersecting";
	private static final String DISJOINT_OUTSIDE="Disjoint-Outside";
	private static final String DISJOINT_INSIDE="Disjoint-Inside";
	private static final String CONCENTRIC="Concentric";

	static String[] circles(String info[])
	{
		String[][] newString= new String[info.length][6];
		Integer[][] values= new Integer[info.length][6];
		String[] result=new String[info.length];
		for(int i=0;i<info.length;i++)
		{
			newString[i]=info[i].split(" ");
			for(int j=0;j<newString[i].length;j++)
			{
				values[i][j]=Integer.parseInt(newString[i][j].trim());
				System.out.print(values[i][j]);
			}
			System.out.println();
		}
		for(int k=0;k<values.length;k++)
		{
			int x1=values[k][0];
			int y1=values[k][1];
			int r1=values[k][2];
			int x2=values[k][3];
			int y2=values[k][4];
			int r2=values[k][5];
			int distSq=((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2));
			int radSumSq=(r1+r2)*(r1+r2);
			int radDiffSq=(r1-r2)*(r1-r2);
			int distance=(int)Math.sqrt(distSq);
			
			if(distSq==radSumSq || distSq==radDiffSq)
				result[k]=TOUCHING;
			else if(x1==x2 && y1==y2)
				result[k]=CONCENTRIC;
			else if((r2>=r1 && distance<=(r2-r1)) || (r1>=r2 && distance<=(r1-r2)))
				result[k]=DISJOINT_INSIDE;
			else if(distance>(r1+r2))
				result[k]=DISJOINT_OUTSIDE;
			else
				result[k]=INTERSECTING;
				
		}
		return result;
	}
}
