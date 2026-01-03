import java.util.Scanner;
class Test1DArray{

public static void main(String [] args)
{
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
System.out.println("enter the position of the element");
int pos = sc.nextInt();
int max = MaxNthNumber(arr,pos);
System.out.println("nthMax is "+max);
System.out.println("prime Count is "+cntPrime(arr));

  
}

public static int MaxNthNumber(int [] arr,int pos)
{
  for(int i=0;i<arr.length-1;i++)
{
if(arr[i]>arr[i+1])
{
  int temp = arr[i];
  arr[i] = arr[i+1];
  arr[i+1] = temp;
}
  
}
return arr[pos-1];
  
}
public static int cntPrime(int arr[])
{
  int cnt =0;
for(int i=0;i<arr.length;i++)
{
int j;
for(j=2;j<=arr[i]/2;j++)
{
   if(arr[i]%j==0)
{  
    break;
}
}
if(j==arr[i]/2+1)
{
   cnt++;
}

}
return cnt;
}


public static int[] displayPrime(int arr[])
{
int ans [] = new int [cntPrime(arr)];
int k=0;
for(int i=0;i<arr.length;i++)
{
int j;
for(j=2;j<=arr[i]/2;j++)
{
   if(arr[i]%j==0)
{  
    break;
}
}
if(j==arr[i]/2+1)
{
   ans[k++] = arr[i];
}

}
return ans;
}

}




