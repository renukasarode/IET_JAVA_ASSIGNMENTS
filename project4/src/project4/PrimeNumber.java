package project4;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 0;
		for(int i=0;i<args.length;i++)
		{
			num =Integer.parseInt(args[i]);
			if(isPrime(num))
			{
				System.out.println("for num: "+num);
				displayTable(num);
			}
			else
			{
				System.out.println("for num: "+num);
				System.out.println("result is "+num/10);
			}
		}
		
		
	}
	private static void displayTable(int num) {
		
		System.out.println("display Table");
		System.out.println("number * "+"multipiler"+" = Result");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * " +i+" = "+(num*i));
		}
             
	}
	public static boolean isPrime(int num)
	{
		int i;
		 for(i=2;i<=num/2;i++)
		 {
			 if(num%i==0) 
			 {
				 return false;
			 }
		 }
		 if(i==num/2+1)
		 {
			 return true;
		 }
		 return false;
	}
	   

}
