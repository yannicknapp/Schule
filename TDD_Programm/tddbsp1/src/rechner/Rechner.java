package rechner;

public class Rechner {
	
	public static int add(String input, String del) throws InvalidFormatException
	{
		int wert=0;
		String[] stringNumbers = input.split(del);
		if (stringNumbers.length<2)
		{
			throw new InvalidFormatException();
		}
		try 
		{
			for(int i=0;i<stringNumbers.length;i++)
			{
				wert+=Integer.parseInt(stringNumbers[i]);
			}
			return wert;
		} catch(NumberFormatException e)
		{
			throw new InvalidFormatException();
		}
		
	}
	
	public static int add(String input) throws InvalidFormatException
	{
		return add(input,";");
	}

}
