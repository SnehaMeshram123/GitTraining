package Arraydemo;

import java.util.Arrays;

public class sortinganarray {

	public static void main(String[] args) 
	{
		
		// 10,56,74,25,34,95,12,56      hello, good, abc, xyz, pqr, asf
		
		// ascending order: 10 12 25 34 56 56 74 95    abc asf good hello pqr xyz
		
		// descending order: 95 74 56 56 34 25 12 10   
		
		int [] arr= {10,56,74,25,34,95,12,56};
		
		Arrays.sort(arr);//this method is sorting array in ascending order
		System.out.println("Sorting array in Ascending order");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nSorting array in Descending order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
