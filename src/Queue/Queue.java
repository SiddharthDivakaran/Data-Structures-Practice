package Queue;

public class Queue 
{

int sz=0;	
int rear=0;
int front=0;
	
Queue(int rear,int front)
{
	this.rear = rear;
	this.front = front;
}

public int getFront()
{
	return this.front;
}
public int getRear()
{
	return this.rear;
}

public void addToQueue(int[]q,int val,int size)
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
		System.out.println("Size after adding: "+sz);
	}
	
}

public void removeFromQueue(int[]q,int rear,int front)
{
	
	if(this.front==this.rear)
	{
		System.out.println("UNderflow");
	}
	else
	{
		q[this.front]=0;
		this.front++;
		
		sz=this.rear-this.front;
		System.out.println("Size after removal: "+sz+"  front: "+this.front+" rear: "+this.rear);
	}
	
}

public void getFrontElement(int[]q,int front)
{
	System.out.println(q[front]);
}

public int getSize()
{
	return sz;
}
	
public static void main(String args[])
{
	Queue qq = new Queue(3,0);
	int[]q=new int[7];
	for(int i=0,j=1;i<3;i++,j++)
	{
		q[i]=j;
	}
	
    int front=0;
    int rear=3;
    int size=7;
    
    qq.addToQueue(q,15,size);
    int s = qq.getSize();
    
    System.out.println("size: "+s);
    
    System.out.println();
    System.out.println("Queue elements");
    System.out.println();
    for(int i=front;i<s;i++)
    {
    	System.out.println(q[i]);
    }
    System.out.println();
    System.out.println("Removal");
    System.out.println();
    
    qq.removeFromQueue(q, rear, front);
    System.out.println("Size: "+qq.getSize());
    
    qq.addToQueue(q, 22, size);
    for(int i=front;i<s;i++)
    {
    	System.out.println(q[i]);
    }
    System.out.println("Size: "+qq.getSize());
}

}
