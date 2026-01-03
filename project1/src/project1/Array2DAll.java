package project1;
import java.util.*;
public class Array2DAll {

	public static void main(String[] args) {
		int [][] arr = new int[3][3];
		
		Scanner sc  = new Scanner(System.in);
		
		AcceptArray(arr);
		int [] ans = addrowwise(arr);
		System.out.println("rowwise aditio is " + Arrays.toString(ans));
		int [] ans1 = addColumnWise(arr);
		System.out.println("columnWise adition is " + Arrays.toString(ans1));
		
		 if(arr.length ==arr[0].length)
		 {
		if(idenMatrix(arr))
		{
		System.out.println("it is identity matrix");
		}
		else
		{
			System.out.println("it is not identity matrix");
		}
		 }
		 else
		 {
			 System.out.println("it is not a square matrix");
		 }
		 System.out.println("it is is upward rotation of the rows");
		// rotateArrayUpward(arr);
//		displayArray(rotateArrayUpward(arr));
		displayArray(arr);
		System.out.println("it is is downward rotation of the rows");
		//1displayArray(rotateArrayDownward(arr));
		
        for(int i:minRowwise(arr))
        {
        	System.out.print(i+"\t");
        }
        System.out.println();
        for(int i:columnwiseMax(arr))
        {
        	System.out.print(i+"\t");
        }
        System.out.println();
		
	}
	public static void AcceptArray(int [][] arr)
	{
		System.out.println("enter the 2D array elements ");
		Scanner sc  = new Scanner(System.in);
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void displayArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int [] addrowwise(int [][] arr)
	{
		int []temp = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++)
			{
				temp[i]+=arr[i][j];
			}
		}
		return temp;
	}
	
	public static int[] addColumnWise(int [][] arr)
	{
		int temp[] = new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			  temp[i] += arr[j][i];
			}
		}
		return temp;
	}
	public static int [][] transposeArray(int [][] arr)
	{
		int [][] temp = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[i][j] = arr[j][i];
			}
		}
		return temp;
	}
	 public static boolean isIdentityMatrix(int [][] arr)
	 {
		
		 for(int i=0;i<arr.length;i++)
		 {
			for(int j=0;j<arr[i].length;j++)
			{
		 if(i==j && arr[i][j]!=1)
		 {
		   return false;
		 }
		 else if(i!=j && arr[i][j]!=0)
		 {
			 return false;
			 }
		 }
	 }
		 return true;
		 }
	 
	 public static boolean idenMatrix(int[][] arr)
	 {
		 int cnt =0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[0].length;j++)
			 {
				if((i==j && arr[i][j]!=1) || ((i!=j) && arr[i][j]==0))
				{
					cnt++;
				}	
			 }
		 }
		 if(cnt==arr[0].length*arr.length)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 public static int[][] rotateArrayUpward(int [][] arr)
	 {
		 int temp[][] = new int[arr.length][arr[0].length];
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;i++)
			 {
				temp[i][j] = arr[i][j];
			 }
		 }
		 int temp1[] = arr[0];
		 for(int i=0;i<temp.length-1;i++)
		 {
			 temp[i] = temp[i+1];
	     }
		 arr[temp.length-1] = temp1;
		 return temp;
     }
	 
	 public static int[][] rotateArrayDownward(int [][] arr)
	 {
		 int temp[][] = new int[arr.length][arr[0].length];
		 int temp1[] = arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;i++)
			 {
				temp[i][j] = arr[i][j];
			 }
		 }
		 for(int i=0;i<temp.length-1;i++)
		 {
			 temp[i] = temp[i+1];
	     }
		 arr[temp.length-1] = temp1;
		 return temp;
     }
	 public static int [] minRowwise1(int [][]arr)
	 {
		 int temp [] = new int [arr.length];
		
		 for(int i=0;i<arr.length;i++)
		 {
			 temp[i] = arr[i][0];
			 for(int j=0;j<arr[i].length;j++)
			 {
				 if(arr[i][j]<temp[i])
				 {
					 temp[i] = arr[i][j];
				 }
			 }
		 }
		 return temp;
	 }
	 public static int [] minRowwise(int [][]arr)
	 {
		
		int temp[] = new int[arr.length];
		
		 for(int i=0;i<arr.length;i++)
		 {
			int temp1[] = arr[i];
			int min = arr[i][0];
			for(int j=0;j<temp1.length;j++)
			{
				if(min>temp1[j])
				{
					min =temp1[j];
				}
			}
			temp[i] = min;
			
		 }
		 return temp;
	 }
	 
	 public static int[] columnwiseMax(int arr[][])
	 {
		 int temp [] = new int [maxcoloumnlength(arr)];
		 
		 for(int i =0;i<arr.length;i++)
		 {
			 int max = arr[0][i];
		 
		 for(int j=0;j<arr[i].length;j++)
		 {
			 if(max <arr[0][j])
				 max = arr[0][j];
		 }
		 temp[i] = max;
		 }
		 return temp; 
	 }
	 public static int maxcoloumnlength(int arr[][])
	 {
		 int max  = 0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(max<arr[i].length)
			 {
			   max = arr[i].length;
			 }
		 }
		 return max;
	 }
	 
}
