import java.util.*;
class Displayfact
{
	public static void main(String [] A)

{
 	

Scanner sc = new Scanner(System.in);
System.out.println("enter the number :");
int n = sc.nextInt();
int ans = Display(n);
System.out.println("factorial is :"+ans);


}
public static int Display(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact = fact * i;
}
return fact;
}
}