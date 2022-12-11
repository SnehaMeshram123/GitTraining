package Arraydemo;

public class example1 {

	public static void main(String[] args) 
	{
		//Step 1. Array declaration:
		
		int [] arr= new int[5];// first index=0  last index= 4
		
		//Step 2. Array initialization: provide the information to an array
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//Step 3. Array usage
		//using index
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//using for loop
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		
		//using foreach loop
		for(int var:arr)
		{
			System.out.println("The square of "+var+"is "+(var*var));
		}

	}

}
