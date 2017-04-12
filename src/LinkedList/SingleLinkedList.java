package LinkedList;


public class SingleLinkedList
{
	Node head;
	int size;
	
	SingleLinkedList()
	{
		head=null;
		size=0;
	}
	
public void addFirst(Node n)
{
	if(head==null)
	{
		head=n;
		n.next=null;
		size++;
	}
	else
	{
		n.next=head;
		head=n;
		size++;
	}
}

public void addAtPos(Node n,int pos)
{
	Node temp;
	temp=head;
	while(temp!=null)
	{
		if(temp.data==pos)
		{
			n.next=temp.next;
			temp.next=n;
			size++;
			break;
		}
		temp=temp.next;
	}
	
	
	
}

public void addAtLast(Node n)
{
	Node temp;
	temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=n;
	n.next=null;
	size++;
}
	
public void completeDeletion()
{
	head=null;
	size=0;
}

public void delete(int pos)
{
	Node temp;
	temp=head;
	Node prev;
	
	int count=1;
	while(temp!=null)
	{
		if(count==1 && temp.data==pos)//deleting at first position
		{
			head=temp.next;
			temp.next=null;
			size--;
		}
		prev=temp;
		temp=temp.next;
		
	if(temp!=null)//deleting at other position including last
	{	
		if(temp.data==pos)
		{
			//System.out.println("prev data: "+prev.data+"  temp data: "+temp.data);
			  prev.next=temp.next;
			  temp.next=null;
			  size--;
		}
		
	}
	count++;
	}
	
}

public void listTraverse()
{
	
	System.out.println();
	
	Node temp;
	temp=head;
	
	while(temp!=null)
	{
		System.out.print(temp.data+"-->"); 
		temp=temp.next;
	}
	
	System.out.println();
}

public void reverse()
{
	Node temp=head;
	Node prev=null;
	Node next=null;
	
	while(temp!=null)
	{
		next=temp.next;
		temp.next=prev;
		prev=temp;
		temp=next;
		
	}
	head=prev;
}


public int getSize()
{
	return size;
}
	public static void main(String args[])
	{
		SingleLinkedList l = new SingleLinkedList();
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		
		l.addFirst(n5);
		l.listTraverse();
		l.addFirst(n4);
		l.addAtLast(n3);
		l.addFirst(n6);
		l.listTraverse();
//		l.addAtPos(n2, 50);
//		l.listTraverse();
		l.addAtPos(n1, 30);
		l.listTraverse();
		l.delete(10);
//		l.completeDeletion();
//		System.out.println("deletion");
		l.listTraverse();
		int s=l.getSize();
		System.out.println("Size of list: "+s);
		System.out.println();
		System.out.println("Original list:");
		l.listTraverse();
		System.out.println();
		System.out.println("Reversed list:");
		l.reverse();
		l.listTraverse();
		
		
	}

}
