package ArrayProblems;

public class MatrixTranspose 
{
	public void transpose(int[][] arr)
	{
		System.out.println("Original Matrix");
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transponse Matrix");
		System.out.println();
		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public void diagonal(int[][] arr)
	{
		System.out.println("Matrix");
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diagonal");
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					System.out.println("Row & Column index: "+i+j+"  value: "+arr[i][j]);
				}
			}
		}
	}
	
	public void multiMatrix(int[][]a,int[][]b,int ar,int ac,int br,int bc)
	{
		int[][]c = new int[ar][bc]; 
		int sum=0;
		if(ac!=br)
		{
			System.out.println("Cannot be multiplied");
		}
		else
		{
			for(int i=0;i<ar;i++)
			{
				for(int j=0;j<bc;j++)
				{
					for(int k=0;k<br;k++)
					{
						sum=sum+a[i][j]+b[k][j];
					}
					c[i][j]=sum;
					sum=0;
				}
				
				
			}
			
			for(int i=0;i<ar;i++)
			{
				for(int j=0;j<bc;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public void matrixMultiply(int[][]a, int[][]b,int ar,int ac,int br,int bc )
	{
		int[][]c= new int[100][100];
		int sum=0;
		
		if(ac!=br)
		{
			System.out.println("Matrix cannot be multiplied");
		}
		else
		{
			for(int i=0;i<ar;i++)
			{
				for(int j=0;j<bc;j++)
				{
					for(int k=0;k<br;k++)
					{
						sum = sum+a[i][k]*b[k][j];
					}
					c[i][j]=sum;
					sum=0;
				}
			}
		}
		
		for(int i=0;i<ar;i++)
		{
			for(int j=0;j<bc;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] a1 = {{3,5},{13,4,8,14,1},{9,6,3,7,21},{5,12,17,9,3}}; 
		
		int[][] a = {{6,3,0},{2,5,1},{9,8,6}};
		int[][] b ={{7,4},{6,7},{5,0}};
		
			
        		
		MatrixTranspose mt = new MatrixTranspose();
		mt.matrixMultiply(a, b, 3, 3, 3, 2);
		System.out.println();
		mt.multiMatrix(a, b, 3,3,3,2);
	}

}

