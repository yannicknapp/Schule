package pack;

public class Main {

	public static void main(String[] args) 
	{
		BiTree n=new BiTree();
		n.add(5);
		n.add(6);
		n.add(10);
		n.add(8);
		n.add(12);
		n.add(11);
		n.delete(10);
		//System.out.print(n.get(10));
		n.ausgeben(null);
	}

}
