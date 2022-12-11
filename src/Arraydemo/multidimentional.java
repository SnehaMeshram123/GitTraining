package Arraydemo;

public class multidimentional {

	//Multidimensional array
	public static void main(String[] args) 
	{
		//Array declaration
		String [][] arr= new String[3][2];// 0 1 2=row index    0 1=column index
		
		//Array initialisation
		
		arr[0][0]="Mango";
		arr[0][1]="Banana";
		arr[1][0]="Guava";
		arr[1][1]="Lichi";
		arr[2][0]="Apple";
		arr[2][1]="Chickoo";
		
		//Array declaration and initialisation
		
		int[][] arr1= {
				{10,20,30},{40,50,60},{23,45,67},{12}
		};//[3][3]
		
		
		//usage
		
		//System.out.println(arr[1][0]);//Guava
		
		for(int i=0;i<=2;i++)//outer for loop for rows  0 1 2 3
		{
			for(int j=0;j<=1;j++)//inner for loop for columns  0 1 2
			{
				System.out.print(arr[i][j]+" ");//arr[2][1]
			}
			System.out.println();
		}
		
		System.out.println();
		
		            //i<=3
		for(int i=0;i<=arr1.length-1;i++)//outer for loop for rows  
		{
			              //j<=arr1[0].length-1=3-1=2
			for(int j=0;j<=arr1[i].length-1;j++)//inner for loop for columns  
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
