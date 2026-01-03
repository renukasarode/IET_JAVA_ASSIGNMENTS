package project1;

import java.util.Scanner;

public class OddAddition {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the size of the array");
		 n = sc.nextInt();
		  int arr[] = new int[n];
		  System.out.println("enter the value for the array elements");
		   for(int i=0;i<n;i++)
		{
		   arr[i] = sc.nextInt();
		}
		   Displayaddition(arr);
	}
	public static void Displayaddition(int arr[])
	{
		
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum = sum+arr[i];
			}
		}
		System.out.println("addition of odd ele is : "+sum);
	}

}
