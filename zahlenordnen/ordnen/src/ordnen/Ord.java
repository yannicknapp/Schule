package ordnen;

import java.util.ArrayList;
import java.util.Random;

public class Ord {
	
	public static ArrayList<Integer> zahlenvergleichen(ArrayList<Integer> zahl)
	{ 
		int z;
		int z2;
		
		for (int a=0;a<=9;a++)
		{
		for (int i=0;i<=8;i++)
		{
			if(zahl.get(i)>zahl.get(i+1))
			{
				z=zahl.get(i);
				z2=zahl.get(i+1);
				zahl.set(i+1,z);
				zahl.set(i,z2);
			}
		}
		}
		return zahl;
	}

	public static void main(String[] args) 
	{
		Random r=new Random();
		// TODO Auto-generated method stub
		ArrayList<Integer> zahlen=new ArrayList<Integer>();
		
		for(int i=0;i<=9;i++)
		{
			zahlen.add(r.nextInt(50));
		}
		System.out.println(zahlen);

		zahlenvergleichen(zahlen);
		
		System.out.println(zahlen);
		
	}

}
