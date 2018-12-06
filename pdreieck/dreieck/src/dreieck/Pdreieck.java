package dreieck;

import java.util.ArrayList;

public class Pdreieck 
{
	
	public static int getWert(int w1,int w2)
	{
		if(w2==0)return 1;
		if(w2==w1)return 1;
		
		return (getWert(w1-1,w2)+getWert(w1-1,w2-1));
	}
	
//Fibonachi	
	public static int getWertf(int a)
	{
        if(a==0||a==-1) 
        	{
        	   return 1;
        	}
		
		return getWertf(a-2)+getWertf(a-1);
	}
//faculty EndRekursiv	
	public static int fac(int i, int b)
	{
		if(i==0)return b;
		
		return fac(i-1,i*b);
		
	}
// faculty Rekursiv
	public static int faculty(int i)
	{
		if(i==0)return 1;
		
		return faculty(i-1)*i;
		
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println(getWert(10,5));
		System.out.println(getWertf(5));
		System.out.println(fac(5,1));
		System.out.println(faculty(5));
		// TODO Auto-generated method stub

	}

}
