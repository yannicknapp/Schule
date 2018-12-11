import java.util.ArrayList;
import java.util.Random;

public class QuickSort {
	
	public static void qSort(ArrayList<Integer> array, ArrayList<Integer> a, int anz)
	{
		if((anz==1)||(anz==0))return;
		Random rand=new Random();
		int x=rand.nextInt(anz);
		for(int i=0;i<=x;i++)a.add(array.get(i));
		
		qSort(array, a,anz-1);
		
	}
	
	
	public static ArrayList<Integer> getRandom(int size)
	{
		ArrayList<Integer> randomNumbers = new ArrayList<>();
		Random rand = new Random();
		for(int j=0;j<size;j++)
		{
			randomNumbers.add(rand.nextInt(50)+1);
		}
		
		return randomNumbers;
	}

	
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<>(getRandom(10));
		ArrayList<Integer> array=new ArrayList<>();
		
		qSort(a, array, 9);
		System.out.print(a);
		System.out.print(array);
	}
}
