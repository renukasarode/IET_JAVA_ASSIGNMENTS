package project1;

import java.util.Arrays;
import java.util.Scanner;

public class OccuracesElements {

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
		   getOccurence(arr,6);
	}
	
	public static void getOccurence(int ans[],int num)
	{
		
		int count[] = new int[ans.length];
		for(int i=0;i<ans.length;i++)
		{
			count[i] = -1;
		}
		int k=0;
		
			for(int j=0;j<ans.length;j++)
			{
			   if(ans[j]==num)
			   {
				   count[k] = j;
				   k++;
			   }
			}
			System.out.println(Arrays.toString(count));	
		}

}
