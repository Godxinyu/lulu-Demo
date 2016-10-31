package demo;

	public class test1027a 
	{
	public static void main(String[] args) 
	{

	test1027a(1,2);
	test1027b(666);
	test1027c(41,5);
	test1027d('A');
	test1027e(600235);
	test1027f(86);
	}
	
	static void test1027a(int a , int b)
	{
		int c;
		c = a;
		a = b;
		b = c;
	
		System.out.println("a="+a+" b="+b);
		
	}


	static void test1027b(int a)
	{		
		int b = a/100;
		int c = (a/10)%10;
		int d = a%10;
	
		System.out.println(b+c+d);
	}

	static void test1027c(int a,int b)
	{
		int c;
		int d;
		c = (a-32)*5/9;
		d = b*9/5+32;
		System.out.println("c="+c+" d="+d);
					
	}
	
	static void test1027d(char a)
	{
		char b;
		b =  (char) (a + 32);
		System.out.println(b);
	}
	
	static void test1027e(int a)
	{
		double b;
		if(a<=100000)
		{ 
			b = a*0.1;
			System.out.println("奖金="+b);
		}
		if(a>=100000 && a <200000)
		{ 
			b = (a -100000)*0.075;
			System.out.println("奖金="+b);
		}
		if(a>200000 && a<=400000)
		{
			b = (a -200000)*0.05;
			System.out.println("奖金="+b);
		}
		if(a>400000 && a<=600000)
		{
			b = (a -400000)*0.03;
			System.out.println("奖金="+b);
		}
		if(a>600000 && a<=1000000)
		{
			b = (a -600000)*0.015;
			System.out.println("奖金="+b);
		}
		if(a>1000000)
		{
			b = (a -1000000)*0.01;
			System.out.println("奖金="+b);
		}
	}
	
	static void test1027f(int a)
	{
		int c;
		char b;
		c = a/10;
		
		switch(c)
		{
		case 9:b = 'A';
		System.out.println("等级 "+b);
		break;
		case 8:b = 'B';
		System.out.println("等级 "+b);
		break;
		case 7:b = 'C';
		System.out.println("等级 "+b);
		break;
		case 6:b = 'D';
		System.out.println("等级 "+b);
		break;
		default:System.out.println("不及格");
		}
	}
}

		
		
	