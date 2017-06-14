
import java.util.Scanner;
class Node
{
	protected int data;
	protected Node link;

	public Node()
	{
		data=0;
		link=null;
	}
	public void setData()
	{
		System.out.println("\nEnter element");
		Scanner scan = new Scanner(System.in);
		data =  scan.nextInt();
		link=null;

	}
	public void setLink(Node n)
	{
		link = n;
	}
	public void getdata()
	{
		System.out.println(data);
	}
	public Node getLink()
	{
		return link;
	}

}
class SLinkedList
{
	int size;
	protected Node start;
	protected Node end;
	public SLinkedList()
	{
		start = null;
		end = null;
	}
	public void Size()
	{
		System.out.println("Size "+size);
	}
	public void insertAtStart()

	{
		size++;
		Node nptr = new Node();
		nptr.setData();
		if(start == null)
		{
			start = nptr;
			end = start;

		}
		else
		{
			nptr.setLink(start);
			start = nptr;
		}
    } 
    public void insertAtEnd()
    {
    	size++;
    	Node nptr = new Node();
    	nptr.setData();
    	if (start==null)
    	{
    		start = nptr;
			end = start;

    	}
    	else
    	{
    		end.setLink(nptr);
    		end = nptr;
    	}
    }
		public void insertAtPos()
		{
			System.out.println("\nEnter position");
			int pos;
			Scanner scan = new Scanner(System.in);
			pos= scan.nextInt();
			if(pos==1)
			{
				insertAtStart();
				System.out.println("aa");
				Size();
			}
			else
				if(pos==size+1)
			{
				System.out.println("bb");
				insertAtEnd();
				Size();
			}
			else
			{

				System.out.println("cc");
				Node nptr = new Node();
				nptr.setData();
				pos =pos -2;
				Node ptr;
				ptr = start;
				for(int i=0;i<=size;i++)
				{
					if(i==pos)
					{
						Node tmp = ptr.getLink();
						ptr.setLink(nptr);
						nptr.setLink(tmp);
					}
					ptr = ptr.getLink();

				}
				Size();
			}
			size++;
		}
		public void deleteAtPos()
		{
			System.out.println("\nenter position");
			Scanner scan = new Scanner(System.in);
			int pos = scan.nextInt();
			if(pos==1)
			{
				start= start.getLink();
				size--;
			}
			else
				if(pos==size)
				{
					Node ptr;
					ptr =start;
					pos= pos-1;
					for(int i=1;i<pos;i++)
					{
						ptr = ptr.getLink();
					}
					Node nptr = null;
					ptr.setLink(null);
					size--;
				}
				else
					{
					pos=pos-1;
					Node ptr;
					ptr =start;
					for(int i=1;i<size-1;i++)
					{
						if(i==pos)
						{
							Node tmp;
							tmp = ptr.getLink();
							tmp = tmp.getLink();
							ptr.setLink(tmp);
						}
						ptr =ptr.getLink();

					}
					size--;

					}	

		}
		
		public void display()
		{
			Node nptr;
			nptr = start;
			
			while(nptr.getLink()!=null)
			{
				nptr.getdata();
				nptr = nptr.getLink();
			}
			nptr.getdata();
		}
	
}	
class LinkedList
{
	public static void main(String args[])
	{
		SLinkedList list = new SLinkedList();
		list.insertAtStart();
		list.display();
		list.insertAtEnd();
		list.display();
		list.insertAtPos();
		list.display();
		list.insertAtStart();
		list.display();
		list.insertAtEnd();
		list.display();
		list.insertAtPos();
		list.display();
		list.deleteAtPos();
		list.display();
		list.insertAtStart();
		list.display();
		list.insertAtEnd();
		list.display();
		list.insertAtPos();
		list.display();
		list.deleteAtPos();
		list.display();


	}
}
