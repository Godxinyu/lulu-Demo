package demo;

public class printByFor {
	public static int l = 1;
	public static void main(String args[]){
		for(int i = 5;i>0;i--){
			for(int j = 1;j<i;j++){
				System.out.print(" ");
			}
			for(int h = 0;h<l-1;h++){
				System.out.print("*");
			}
			System.out.println("*");
			l++;
		}
		for(int i = 1;i<=5;i++){
			for(int j = 0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
