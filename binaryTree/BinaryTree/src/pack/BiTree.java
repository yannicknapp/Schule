package pack;

import java.util.ArrayList;

public class BiTree
{
	private Node head=null;

	
	public BiTree()
	{
		
	}
	
	public void add(int value)
	{
		Node node=new Node(value);
		if(head==null)
		{
			head=node;
		}
		
		Node tmp=head;
		boolean a=false;
		while(!a)
		{
				if(value>tmp.getValue())
				{
					
					if(tmp.getRight()==null)tmp.setRight(node);
					else
					{
						tmp=tmp.getRight();
					}
				}
				else
				{
					if(value<tmp.getValue())
					{
						
						if(tmp.getLeft()==null)tmp.setLeft(node);
						else
						{
							tmp=tmp.getLeft();
						}
					}
					else
					{
						a=true;
					}
				}
			
		}
		
	}
	
	
	
	
	
	public int get(int value)
	{
		Node tmp=head;

		
		
		while(value!=tmp.getValue())
		{
			
			if(value>tmp.getValue())tmp=tmp.getRight();
			else
			{
				if(value<tmp.getValue())tmp=tmp.getLeft();
			}
			if(tmp==null)
			{
				return -3;
			}
			
		}
		
		return tmp.getValue();
		
	}
		
	
	public void delete(int value)
	{
		Node tmp=head;
		int v=0;
		int richtung=0;
		
		while(value!=tmp.getValue())
		{
			v=tmp.getValue();
			if(value>tmp.getValue())
			{
				tmp=tmp.getRight();
				richtung=1;
			}
			else
			{
				if(value<tmp.getValue())
				{
					tmp=tmp.getLeft();
					richtung=-1;
				}
			}
			if(tmp==null)
			{
				System.out.print("Zahl nich vorhanden");
				return;
			}
			
		}
		
		if(tmp.getRight()==null&&tmp.getLeft()==null)
		{
			tmp=move(v,0);
			if(richtung==-1)
			{
				tmp.setLeft(null);
				return;
			}
			if(richtung==1)
			{
				tmp.setRight(null);
				return;
			}
			
		}
		Node a=null;
		if(tmp.getLeft()!=null&&tmp.getRight()==null)
		{
			a=tmp.getLeft();
			if(richtung==-1)
			{
				tmp=move(v,0);
				tmp.setLeft(a);
				return;
			}
				
			if(richtung==1)
			{
				tmp=move(v,0);
				tmp.setRight(a);
				return;
			}
		}
		if(tmp.getRight()!=null&&tmp.getLeft()==null)
		{
			a=tmp.getRight();
			if(richtung==-1)
			{
				tmp=move(v,0);
				tmp.setLeft(a);
				return;
			}
				
			if(richtung==1)
			{
				tmp=move(v,0);
				tmp.setRight(a);
				return;
			}
		}
			
		
			
		if(tmp.getLeft()!=null&&tmp.getRight()!=null)
		{
			int zaehler = 0;
			Node q;
			tmp.getRight();
			while(tmp.getLeft()!=null)
			{
				tmp=tmp.getLeft();
				zaehler+=1;
			}
			q=tmp;
			tmp=move(tmp.getValue(),zaehler);
			delete(q.getValue());
			tmp.setValue(q.getValue());
			return;
		}
		
		
	
	}
	
	

    public Node move(int value,int anzahl)
	{
		Node tmp=head;
		int v=0;
		
		if(value==tmp.getValue())return tmp;
		while(value!=tmp.getValue())
		{
			v=tmp.getValue();
			if(value>tmp.getValue())tmp=tmp.getRight();
			else
			{
				if(value<tmp.getValue())tmp=tmp.getLeft();
			}
			if(tmp==null)
			{
				System.out.print("Zahl nicht vorhanden");
				break;
			}
			
		}
		
		if(anzahl==0)return tmp;	
		
	    return move(v,anzahl-1);

	}

	
	
	
	public void ausgeben(Node tmp)
	{
	
		if(tmp==null)
		{
			tmp=head;
			System.out.println(tmp.getValue());
		}
		Node l;
		Node r;
		if(tmp.getLeft()==null&tmp.getRight()==null)return;
		l=tmp.getLeft();
		r=tmp.getRight();
		if(tmp.getLeft()!=null)
		{
			System.out.println(l.getValue());
			ausgeben(tmp.getLeft());
		}
		if(tmp.getLeft()!=null)
		{
			System.out.println(r.getValue());
			ausgeben(tmp.getRight());
		}

		
		
	}
	
	
}

