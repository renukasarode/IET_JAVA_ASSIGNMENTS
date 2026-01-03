package test;
import java.util.*;
import beans.*;
public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1. Salaried \n 2. Contract" );
		int choice = sc.nextInt();
		Employee e1 = null;
		Employee e2 = null;
		switch(choice)
		{
		case 1:
		{
			 e1=new salariedEmp(88888,"HR","Designer","rajan",new Date("23/4/2003"));
			 e2=new salariedEmp(44444,"UI","Designer","rahul",new Date("23/4/2003"));
			 System.out.println("in case 1");
			 System.out.println(e1);
			 System.out.println(e2);
			break;
		}
		case 2:
		{
			 e1=new ContractEmp(5,8000,"HR","Designer","rajan",new Date("23/4/2003"));
			 e2=new ContractEmp(12,9888,"UI","Designer","neha",new Date("23/4/2003"));
			 System.out.println("in case 2");
			 System.out.println(e1);
			 System.out.println(e2);
			break;
		}
		case 3:
			System.out.println("thank you for visiting....");
			break;
		}
		}
		
	}


