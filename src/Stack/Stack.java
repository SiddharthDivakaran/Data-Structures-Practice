package Stack;
public class Stack 
{
	int top=-1;
	public void push(int[]stack,int element,int size)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top=top+1;
			stack[top]=element;
		}
		
	}
	public void pop()
	{
		top--;
		System.out.println("poped");
	}
	public void getSize()
	{
		System.out.println(top+1);
	}
	
	public static void main(String args[])
	{
		Stack st = new Stack();
		int a[]=new int[3];
		st.push(a, 12, 3);
		st.push(a, 4, 3);
		st.push(a, 15, 3);
		
		
		st.getSize();
		
	
	}

}
