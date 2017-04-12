package LinkedList;



public class DoublyLinkedList 
{
	
	DNode head;
	DNode tail;
	int size;
	
	DoublyLinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(DNode n)
	{
		if(head==null)
		{
			n.next=null;
			n.prev=null;
			head=n;
		}
		else
		{
			n.next=head;
			n.prev=null;
			head.prev=n;
			head=n;
		}
	}
	
	public void addAtPos(int data,DNode n)
	{   DNode temp;
	    DNode temp2;
		temp=head;
		
		while(temp!=null)
		{
			if(temp.data==data)
			{
				temp2 = temp.next;
				temp.next=n;
				n.prev=temp;
				n.next = temp2;
				temp2.prev=n;
				
			}
			temp=temp.next;
			
		}
	}
	
	public void addPos(int data, DNode n)
	{
		DNode temp;
		temp=head;
		DNode temp2;
		
		while(temp!=null)
		{
			if(temp.data==data)
			{
				temp2=temp.next;
				n.next=temp.next;
				n.prev=temp2.prev;
				temp2.prev=n;
				temp.next=n;
			}
			temp=temp.next;
		}
		
	}
	
	public void delFirst(int data)
	{
	  DNode temp;
	  DNode temp2;
	  temp=head;
	  int count=1;
	  
	  while(temp!=null)
	  {
		  if(count==1 && temp.data==data) // deleting at first position
		  {
			  temp2 = temp.next;
			  head=temp2;
			  temp2.prev=temp.prev;
			  temp.next=null;
		  }
		  temp2 = temp;
		  temp=temp.next;
		 if(temp!=null) //deleting at any position including the last node
		 {
		  if(temp.data==data)
		  {
			  temp2.next=temp.next;
			  if(temp.next!=null)
			  {
			  temp.next.prev=temp2;
			  }
			  temp.next=null;
		  }
		  
		 }
		  
		  count++;
	  }
		
	}
	
	
	public void display()
	{
		DNode temp;
		temp=head;
		System.out.println("Original List Data");
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void prevDisplay()
	{
		System.out.println("Reverse display");
		DNode temp;
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList dl = new DoublyLinkedList();
		DNode n1 = new DNode(10);
		DNode n2 = new DNode(20);
		DNode n3 = new DNode(30);
		DNode n4 = new DNode(40);
		DNode n5 = new DNode(50);
		
//		dl.addFirst(n1);
//		//dl.display();
//		dl.addFirst(n2);
//		dl.addFirst(n3);
		dl.addFirst(n1);
		dl.addFirst(n2);
		dl.addFirst(n3);
		dl.display();
		dl.prevDisplay();
//		dl.addAtPos(30, n4);
		dl.addPos(30, n4);
		dl.display();
		dl.prevDisplay();
		dl.display();
		System.out.println("Deletion");
//		dl.delFirst(30);
		dl.delFirst(40);
		dl.display();
		dl.prevDisplay();
	}

}
