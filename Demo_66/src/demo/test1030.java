package demo;

public class test1030 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] arr = new int[]{2,1,3,14,13,15};
		
		for(i=0;i<=arr.length-2;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int t;
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
			
		}
		
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
