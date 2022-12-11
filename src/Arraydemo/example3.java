package Arraydemo;

public class example3 {

	public static void main(String[] args) {
		//arr= 10,20,30,40
		//  40, 30, 20, 10
		
		int [] arr= {40,10,20,50,60,80,70,90,30,45,12,65,85,95};
		
		//last index of array= arr.length-1
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
