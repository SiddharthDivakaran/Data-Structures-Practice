package LinkedList;

public class CircularDoublyLinkedList1 
{
	int size=0;
	CDNode head;
	CDNode tail;
	
	CircularDoublyLinkedList1()
	{
		size=0;
		head=null;
		tail=null;
	}
	
	public void addFirst(CDNode n)
	{
		if(head==null)
		{
			head=n;
			n.next=head;
			tail=n;
			tail.next=head;
			n.prev=tail;
		}
		else
		{
			CDNode temp;
			temp=head;
			
            if(temp.next==head)
            {
            	n.next=head;
            	head=n;
            	n.prev=tail;
            	tail.next=n;
            	tail.prev=n;
            }
            else
            {
            	while(temp.next!=head)
            	{
            		n.next=temp;
            		temp.prev=n;
            		head=n;
            		tail.next=n;
            		tail.prev=temp;
            		n.prev=tail;
            		temp=temp.next;
            	}
            }
			
		}
	}
	
	public void addAtPos(CDNode n,int data)//adding in middle or at the last based on the given data
	{
		CDNode temp;
		temp=head;
		while(temp.next!=head)
		{
			if(temp.data==data)
			{
				temp.next.prev=n;
				n.next=temp.next;
				temp.next=n;
				n.prev=temp;
			}
			temp=temp.next;
		}
		
		if(temp.data==data)
		{
			temp.next=n;
			n.prev=temp;
			n.next=head;
			tail=n;
		}
	}
	
	public void delete(int data)
	{
		CDNode temp;
		CDNode prev;
		temp=head;
		prev=head;
		int count=1;
		while(temp.next!=head)
		{
			prev=temp;
			System.out.println("counter: "+count);
			if(temp.data==data && count==1)//deleting at first position
			{
				head=temp.next;
				temp.next.prev=tail;
				tail.next=head;
			}
			
			temp=temp.next;
			count++;
			if(temp.data==data)//deleting at given position
			{
				//System.out.println("prev data: "+prev.data+"  temp data: "+temp.data+" temp.next prev data: "+temp.next.prev.data);
				temp.next.prev=prev;
				//System.out.println("new temp.next prev data: "+temp.next.prev.data);
                prev.next=temp.next;
                //System.out.println("Prev data: "+prev.next.data);
			}
		}
		
		if(temp.data==data)//deleting at last position
		{
			prev.next=tail.next;
			tail=prev;
		}
		
		
	}
	
	public void display()
	{
		CDNode temp;
		temp=head;
		
		while(temp.next!=head)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void displayPrev()
	{
      CDNode temp;
      temp=tail;
      while(temp!=head)
      {
    	  System.out.print(temp.data+"-->");
    	  temp=temp.prev;
      }
      System.out.println(temp.data);
      
	}
	
	public static void main(String args[])
	{
		CircularDoublyLinkedList1 cdl = new CircularDoublyLinkedList1();
		
		CDNode n1 = new CDNode(10);
		CDNode n2 = new CDNode(20);
		CDNode n3 = new CDNode(30);
		CDNode n4 = new CDNode(40);
		CDNode n5 = new CDNode(50);
		
		cdl.addFirst(n1);
		cdl.addFirst(n2);
		cdl.addFirst(n3);
		cdl.display();
		System.out.println();
		System.out.println("Reverse display");
		cdl.displayPrev();
		System.out.println("display after adding at given position");
		cdl.addAtPos(n4, 10);
		cdl.display();
		System.out.println("Reverse display");
		cdl.displayPrev();
		System.out.println();
		System.out.println("Deletion");
		cdl.delete(20);
		cdl.display();
		cdl.displayPrev();
		
	}
	

}
