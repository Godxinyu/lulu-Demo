package demo;

public class compareFourCount_liu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int a = 123;
		int b = 234;
		int c = 345;
		int d = 456;
		max = a;
		if(max < b){
			max=b;
		}
		if(max < c){
			max = c;
		}
		if(max < d){
			max = d;
		}
		System.out.println("max="+max);
		
	}

}
