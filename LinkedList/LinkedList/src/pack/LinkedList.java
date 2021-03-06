package pack;

public class LinkedList <T> 
{
	private Note<T> head=null;
	private Note<T> tail=null;
	public LinkedList()
	{
		
	}

	public void add(T value)
	{
		Note<T> note=new Note<>(value);
		//list empty
		if(head==null)
		{
			head=note;
			tail=note;
			return;
		}
		
		/* list ha one element überflüssig wegen while-Schleife
		if(head.getNext()==null);
		{
			head.setNext(note);
		}*/
		
		Note<T> tmp=head;
		
		
		while(tmp.getNext()!=null)
		{
			tmp=tmp.getNext();
		}
		tmp.setNext(note);
		note.setPrevious(tmp);
		tail=note;
	}
	
	public void addback(T value)
	{
		Note<T> note=new Note<>(value);
		//list empty
		if(tail==null)
		{
			head=note;
			tail=note;
			return;
		}
		
		/* list ha one element überflüssig wegen while-Schleife
		if(head.getNext()==null);
		{
			head.setNext(note);
		}*/
		
		Note<T> tmp=tail;
		
		
		while(tmp.getPrevious()!=null)
		{
			tmp=tmp.getPrevious();
		}
		tmp.setPrevious(note);
		note.setNext(tmp);
		head=note;
			
	}
	
	public T get(int p)
	{
		Note<T> tmp=head;
		for(int i=0;i<p;i++)
		{
			tmp=tmp.getNext();
		}
		return tmp.getValue();
		 
	}
	
	public T getBack(int p)
	{
		Note<T> tmp=tail;
		for(int i=0;i<p;i++)
		{
			tmp=tmp.getPrevious();
		}
		return tmp.getValue();
		 
	}
	
	
	
	
	public void delete(int p)
	{
		Note<T> a=head;
		Note<T> b=head;
		if(p==0)
		{
			head=head.getNext();
			tail=tail.getPrevious();
		}else
		{
		for(int i=0;i<p-1;i++)
		{
			
			a=a.getNext();
			
			
		}
		Note<T> c=tail;
		for(int i=0;i<p;i++)
		{
			
			b=b.getNext();
			
			
		}
		Note<T> d=tail;
		a.setNext(b.getNext());
		c.setPrevious(d.getPrevious());
		}
		
	}
	
}
