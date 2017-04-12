package LinkedList;

public class CircularSinglyLinkedList
{
	CNode head;
	CNode tail;
	int size=0;
	
	CircularSinglyLinkedList()
	{
		head = null;
		tail =null;
	}
	
	public void addFirst(CNode n)
	{
		if(head==null)
		{
			head=n;
			n.next=head;
			tail=n;
			size++;
		}
		else
		{
			n.next=head;
			head=n;
			tail.next=head;
			size++;
			
		}
	}
	
	public void addAtPos(int data,CNode n)
	{
		CNode temp;
		temp=head;
		while(temp.next!=head)
		{
			if(temp.data==data)
			{
				n.next=temp.next;
				temp.next=n;
				size++;
			}
			temp=temp.next;
		}
		if(temp.data==data)
		{
			n.next=temp.next;
			temp.next=n;
			size++;
		}
	}
	
	public void delete(int data)
	{
		CNode temp;
		temp=head;
		CNode temp2;
		temp2 = head;
		CNode prev=temp;
		int count=1;
		
		while(temp.next!=head)
		{
			prev=temp;
			if(temp.data==data && count==1)
			{
				temp2=temp;
			}
			
			temp=temp.next;
			if(temp.data==data)//deleting at given position other than first and last position
			{
				prev.next=temp.next;
				
			}
			
			count++;
		}
		if(temp2.data==data)//deleting first element
		{
			head=temp2.next;
			temp.next=temp2.next;
			size--;
		}
		if(temp.data==data)//deleting last element
		{
			prev.next=temp.next;
			size--;
		}
		
	}
	
	public void getSize()
	{
		System.out.println("list size: "+size);
	}
	
	public void display()
	{
		System.out.println("List values:");
		CNode temp;
		temp=head;
	    do
	    {
	    	System.out.print(temp.data+"-->");
	    	temp=temp.next;
	    	tail=temp;
	    }while(tail!=head);
		System.out.println();
	}
	
	
	public static void main(String args[])
	{
		CircularSinglyLinkedList cl = new CircularSinglyLinkedList();
		CNode n1 = new CNode(10);
		CNode n2 = new CNode(20);
		CNode n3 = new CNode(30);
		CNode n4 = new CNode(40);
		CNode n5 = new CNode(50);
		
		cl.addFirst(n1);
		cl.addFirst(n2);
		cl.addFirst(n3);
		cl.addFirst(n4);
		cl.display();
		cl.addAtPos(10, n5);
		cl.display();
		cl.getSize();
		System.out.println("After Deletion");
		cl.delete(40);
		cl.display();
		cl.getSize();
		cl.delete(50);
		cl.display();
		cl.getSize();
		cl.delete(10);
		cl.display();
		cl.getSize();
	}

}
