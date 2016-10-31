public class test1{
	public static int factorial(int a){
		int fact = 1;
		for(int i = a;i > 0;i--)
		{			
			fact = fact*i;			
		}
		return fact;
	}
	
	public static int year(int b){
	if(b%4==0 && b%100!=0 || b%100==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	} 
	
	 public static int number(){
		int j = 0;
		int i = 0;
		for(i =201;i>200;i++){
			for(j = i-1;j>1;j--){
				if(i%j==0){
					break;
				}
			}
			if(j == 1){
				break;
			}
		}
		return i;
	 }
	
	
	public static void main (String[] args){
		int c = factorial(5);
		System.out.println("factorial is "+c);
		
		int d = year(2004);
		if(d ==1){System.out.println("yes");}
		if(d ==0){System.out.println("no");}
		int number = number();
		System.out.println(number);
	}
}