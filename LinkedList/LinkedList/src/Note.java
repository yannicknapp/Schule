
public class Note<T> 
{
	private T value;
	private Note<T> next=null;
	private Note<T> previous=null;
	
	
	public Note(T value)
	{
		this.value=value;
		
	}
	
	public T getValue()
	{
		return value;
	}
	
	public void setValue(T value)
	{
		this.value=value;
	}
	
	public Note<T> getNext()
	{
		return next;
	}
	
	public void setNext(Note<T> next)
	{
		this.next=next;
	}
	
	public Note<T> getPrevious()
	{
		return previous;
	}
	
	public void setPrevious(Note<T> previous)
	{
		this.previous=previous;
	}
	
	
	

}
