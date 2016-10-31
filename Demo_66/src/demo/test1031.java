package demo;

public class test1031 {
   
	public static void shuzu(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t;
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
	
	public static int jmj(int a,int b)
	{
		return a*b;
	}
	
	public static double smj(double c ,double d) 
	{
		return c*d/2;
	}
	
	public static double ymj(double r)
	{
		return 3.14*r*r;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{5,1,4};
		shuzu(arr);
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println(" ");
		
		int a = jmj(2,4);
		double b = smj(4.5,2.5);
		double c = ymj(2.5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
