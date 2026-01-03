class CmdLineArgs{
public static void main(String [] args)
{
   int num = Integer.parseInt(args[0]);

   int arr[] =displayNumber(num);
System.out.println("the table of "+num +"is: ");
for(int i=0;i<arr.length;i++)
{
  System.out.println(num+"*"+(i+1)+"="+arr[i]);
}

} 
public static int [] displayNumber(int num)
{ 

int arr []= new int[10];
int k=0;
 for(int i=1;i<=10;i++)
{
  arr[k] = num*i;
k++;
}
return arr;
}
}