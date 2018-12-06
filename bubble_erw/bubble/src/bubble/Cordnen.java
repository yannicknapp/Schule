package bubble;

import java.util.ArrayList;
import java.util.Random;

public class Cordnen 
{
	
	public static ArrayList<Integer> getRandomList(int size)
	{
		Random r=new Random();
		ArrayList<Integer> zahlen=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			zahlen.add(r.nextInt(50));
		}
		return zahlen;
	}
	
	
	
	public static ArrayList<Integer> zahlenvergleichen(ArrayList<Integer> zahl)
	{
		long startTime=System.nanoTime();
		
		int z;
		int z2;
		int wert=zahl.size()-1;
		for (int a=0;a<zahl.size();a++)
		{
			for (int i=0;i<wert;i++)
			{
				if(zahl.get(i)>zahl.get(i+1))
			
				{
				z=zahl.get(i);
				z2=zahl.get(i+1);
				zahl.set(i+1,z);
				zahl.set(i,z2);
				}
				if(zahl.get(wert-i)<zahl.get(wert-(i+1)))
					
				{
				z=zahl.get(wert-i);
				z2=zahl.get(wert-(i+1));
				zahl.set(wert-(i+1),z);
				zahl.set(wert-i,z2);
				}
				
			}
		}long stopTime=System.nanoTime();
		System.out.println(stopTime-startTime);
		return zahl;
	}

	public static void main(String[] args) 
	{
		Random r=new Random();
		// TODO Auto-generated method stub
		ArrayList<Integer> zahlen=new ArrayList<Integer>();
		
		for(int i=0;i<=20;i++)
		{
			zahlen.add(r.nextInt(50));
		}
		System.out.println(zahlen);

		zahlenvergleichen(zahlen);
		
		System.out.println(zahlen);
		System.out.println(getRandomList(4));
		
	}

}
