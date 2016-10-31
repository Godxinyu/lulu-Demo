package demo;

public class compareFourCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 123;
		int v2 = 234;
		int v3 = 345;
		if(v1>v2)
		{
			if(v1>v3)
			{
				System.out.println("v1 is max,v1="+v1);
			}
			else
			{
				System.out.println("v3 is max,v3="+v3);
			}
		}
		else
		{
			if(v2>v3)
			{
				System.out.println("v2 is max,v2="+v2);
			}
			else
			{
				System.out.println("v3 is max,v3="+v3);
			}
		}
		
		int a = 123;
		int b = 234;
		int c = 345;
		int d = 456;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is max,a="+a);
				}
				else
				{
					System.out.println("d is max,d="+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is max,c="+c);
				}
				else
				{
					System.out.println("d is max,d="+d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("b is max,b="+b);
				}
				else
				{
					System.out.println("d is max,d="+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is max,c="+c);
				}
				else
				{
					System.out.println("d is max,d="+d);
				}
			}
		}
		
		
		System.out.println("lxy sb");
		System.out.println("66");
		
	}

}