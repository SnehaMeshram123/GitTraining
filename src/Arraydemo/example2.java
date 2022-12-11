package Arraydemo;

public class example2 {

	//combine Array declaration with array initialization
	public static void main(String[] args) 
	{
		//Method1: using new keyword
		
		String [] str= new String [] {"Mango","Pear","Banana","Coconut","Guava","Apple","Cherry","Lichi"};
		
		//Method2: using literal
		
		char [] grade= {'A','B','C','D'};
		
		//foreach loop
		
		for(String i:str)
		{
			System.out.println(i);
		}
		
		for(char c:grade)
		{
			System.out.println(c);
		}
		
		//find size of array
		System.out.println("Size of str is"+str.length);
		System.out.println(grade.length);
		
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
	}

}
