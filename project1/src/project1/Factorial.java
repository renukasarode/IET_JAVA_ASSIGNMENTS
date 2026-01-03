package project1;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

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
		   System.out.println("the fact of arays elment is : ");
		   getFact(arr);
	}
	
	public static void getFact(int [] ans)
	{
		int cnt =0;
		 for(int i=0;i<ans.length;i++)
		 {
			if(ans[i]<=7)
			{
				cnt++;
			}
			 }
			 
		 
		int newArray [] = new int [cnt];
		int k=0;
		 for(int i=0;i<ans.length;i++)
		 {
			 int fact =1;
			 for(int j=1;j<=ans[i];j++)
			 {
				if(ans[i]<=7) 
				{
					fact*=j;
				}
			 }
			 newArray[k++] = fact;
			 
		 }
		 
		 System.out.println(Arrays.toString(newArray));
	}

}
