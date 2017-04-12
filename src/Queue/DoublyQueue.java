package Queue;

public class DoublyQueue
{
	int rear=0;
	int front=0;
	int sz=0;
	
	DoublyQueue(int rear,int front)
	{
		this.rear = rear;
		this.front = front;
	}
	
	public int getSize()
	{
		return sz;
	}
	
	
	public int getFront()
	{
		return this.front;
	}
	
	public int getRear()
	{
		return this.rear;
	}
	
	public void addToQueueRear(int[] q,int val,int size)
	{
		if(this.rear==size)
		{
			System.out.println("Overflow");
		}
		else
		{
			q[this.rear]=val;
			this.rear++;
			sz=this.rear-this.front;
		}
	}
	
	
	public void removeFromQueueFront(int[]q)
	{
		if(this.front==this.rear)
		{
			System.out.println("Underflow");
		}
		else
		{
			q[this.front]=0;
			this.front++;
			sz=this.rear-this.front;
		}
	}

	
	public void addToQueueFront(int[]q, int val)
	{
		if(this.front==this.rear)
		{
			System.out.println("Underflow");
		}
		else
		{
			for(int i=this.rear;i>this.front;i--)
			{
				q[i]=q[i-1];
			}
			q[this.front]=val;
			this.rear++;
			sz=this.rear-this.front;
		}
	}
	
	public void removeQeueFromRear(int[]q)
	{
		q[this.rear]=0;
		this.rear--;
		sz=this.rear-this.front;
	}
	
	
	public static void main(String args[])
	{
		DoublyQueue dq = new DoublyQueue(3,0);
		
		int size=6;
		int[]q = new int[size];
		
		for(int i=0,j=1;i<3;i++,j++)
		{
			q[i]=j;
		}
		
		int front = dq.getFront();
		int rear = dq.getRear();
		
//		dq.addToQueueRear(q, 15, size);
//		int s = dq.getSize();
//		
//		System.out.println("front: "+dq.getFront()+"  rear: "+dq.getRear());
//		System.out.println("size: "+s);
//		
//		System.out.println("Queue elements:");
//		for(int i=front;i<s;i++)
//		{
//			System.out.println(q[i]);
//		}
		
//		dq.removeFromQueueFront(q);
//		int s1=dq.getSize();
//		System.out.println("Size: "+s1);
//		for(int i=front;i<s1;i++)
//		{
//			System.out.println(q[i]);
//		}
		
		
		
		dq.addToQueueFront(q, 25);
		dq.addToQueueRear(q, 101, size);
		int s1=dq.getSize();
		System.out.println("Size: "+s1);
		for(int i=front;i<s1;i++)
		{
			System.out.println(q[i]);
		}
		
		dq.removeQeueFromRear(q);
		int s2=dq.getSize();
		System.out.println("size: "+s2);
		for(int i=front;i<s2;i++)
		{
			System.out.println(q[i]);
		}
		
		
	}

}
