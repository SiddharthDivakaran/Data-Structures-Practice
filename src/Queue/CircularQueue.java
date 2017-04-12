package Queue;

public class CircularQueue 
{
	
	int rear=0;
	int front=0;
	int count=0;
	int s=0;
	
	public void addQueueRear(int[]q,int size,int val)
	{
		if(this.count==size)
		{
			System.out.println("Overflow");
		}
		else
		{
			q[this.rear]=val;
			this.rear=(this.rear+1)%size;
			this.count++;
		}
	}
	
	public void removeQueueFront(int[]q,int size)
	{
		if(count==0)
		{
			System.out.println("Underflow");
		}
		else
		{
			q[this.front]=0;
			this.front=(this.front+1)%size;
			this.count--;
		}
	}
	
	public int getSize()
	{
	  return this.count;
	}
	
	public static void main(String args[])
	{
		CircularQueue cq = new CircularQueue();
		
		int size = 6;
		int[]q = new int[size];
		for(int i=0,j=1;i<3;i++,j++)
		{
			cq.addQueueRear(q, size,j);	
		}
		
		int s= cq.getSize();
		System.out.println("size: "+s);
		
		for(int i=0;i<s;i++)
		{
			System.out.println(q[i]);
		}
		
		cq.removeQueueFront(q, size);
		System.out.println("Size: "+cq.getSize());
	}

}
