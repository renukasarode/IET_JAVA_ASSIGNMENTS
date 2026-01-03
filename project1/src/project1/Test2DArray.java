package project1;
import java.util.*;

public class Test2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] [] = new int [2][2];
		System.out.println("enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("display elements of array ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
//		DisplayAddition(arr);
		AdditionofRow(arr);
		Additionofcolums(arr);
		
	}
	public static void DisplayAddition(int arr[][])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum = sum + arr[i][j];
			}	
		}
		System.out.println("addition of 2D array is: "+sum);
	}
	public static void AdditionofRow(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr[i][j];
			}
			System.out.println("Addition of "+(i+1)+" row  is "+sum);
		}
	}
	
	public static void Additionofcolums(int arr[][])
	{
		for(int k=0;k<arr.length;k++)
		{
			int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==k)
				{
				sum += arr[i][j];
				}
			}	
		}
		System.out.println("Addition of "+(k+1)+" column  is "+sum);
		}	
	}
}
