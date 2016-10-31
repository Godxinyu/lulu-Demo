package demo;

public class test1026 {
	
	public static int min(int v1,int v2,int v3)
	{
		int min;
		min = v1;
		if(v2<min)
		{
			min = v2;
		}
		if(v3<min)
		{
			min = v3;
		}
		
		return min;
	}
	
	public static void myprintf(int n)
	{
			System.out.println("min is "+n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 2;
		int k = 3;
		
		int ret = min(i,j,k);
		
		
		myprintf(ret);
		
		
	}

}
