
public class Datentypen {
	
	public static void modifyPrimitive(int a)
	{
		a=5;
	}
	public static void modifyPrimitiveInteger(Integer a)
	{
		a=5;
	}
	
	public static void modifyString(String s)
	{
		s="hallo";
	}
	
	public static void modifyObject(DtContainer c)
	{
		c.a=4;
		c.s="hallo";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a =8;
		modifyPrimitive(a);
		System.out.println(a);
		
		Integer b =8;
		modifyPrimitive(b);
		System.out.println(b);
		
		String s="h";
		modifyString(s);
		System.out.println(s);
		
		DtContainer d=new DtContainer();
		modifyObject(d);
		System.out.println(d);
		

	}

}
