import java.util.ArrayList;

public class TuemreHanoi {

	
	public static void ordnen(int zahl)
	{
		boolean richtig=false;
		ArrayList<Integer> a=new ArrayList<Integer>();		
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=1;i<=zahl;i++) a.add(i);
		
		while(richtig==false)
		{
			
		}
		
	}
	
	public static void move(int n,ArrayList<Integer> src,ArrayList<Integer> aux,ArrayList<Integer> target )
	{
		if(n==0)return;
		move(n-1, src, target, aux);
		System.out.println("src:"+src);
		System.out.println("aux"+aux);
		System.out.println("target:"+target);
		target.add(src.remove(src.size()-1));
		move(n-1,aux,src,target);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();		
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		for (int i=3;i>=1;i--)
		{
			a.add(i);
		}
		move(a.size(),a,b,c);
		System.out.println(c);
	}

}
