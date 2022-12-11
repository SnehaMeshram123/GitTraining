package Arraydemo;

import java.util.Arrays;

public class checkarrayequal {

	public static void main(String[] args) 
	{
		int [] arr= {10,20,30,40};
		int [] arr1= {10,20,30,40};
		int [] arr2= {10,21,30,40};
		
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr1, arr2));

	}

}
