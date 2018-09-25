package zahlenordnen3;

import java.util.ArrayList;
import java.util.Random;

public class Zordnen 
{
	public static ArrayList<Integer> zahlenvergleichen(ArrayList<Integer> zahl)
	{
		ArrayList<Integer> z=new ArrayList<Integer>();
		int wert = zahl.get(0);
		int index=0;
		while(zahl.size()>0)
		{
			index=0;
			wert = zahl.get(0);
		
		for(int i=0;i<zahl.size();i++)
		{
			if(wert>zahl.get(i))
			{
				wert=zahl.get(i);
				index=i;
			}

		}
		zahl.remove(index);
		z.add(wert);
		}
		
		return z;
			
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

		
		
		System.out.println(zahlenvergleichen(zahlen));
	}

}
