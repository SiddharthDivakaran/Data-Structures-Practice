package Hashing;

public class Hashing 
{
	
	 int Frequency[]=new int[26];

	    int hashFunc(char c)
	    {
	    	int x = c-'a';
	        return x;
	    }

	    void countFre(String S)
	    {
	    	char[]c=S.toCharArray();
	        for(int i = 0;i < c.length;++i)
	        {
	            int index = hashFunc(c[i]);
	            Frequency[index]++;
	        }
	        
	        
	    }
	
	
	public static void main(String args[])
	{
		Hashing h = new Hashing();
		String S ="abcdafc";
		h.countFre(S);
		
		char[ ]ch=S.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+"  "+h.Frequency[i]);
		}
	}

}
