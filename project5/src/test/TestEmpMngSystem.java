package test;
import java.util.*;

import beans.Employee;
import service.EmployeeService;
public class TestEmpMngSystem {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int choice =0;
		do {
		System.out.println("1.add new employee\n2.Display all");
		System.out.println("3.Display by id\n4.change sal or charges");
		System.out.println("5.Display Salaried Employee\n6.Display Contract Employee");
		System.out.println("7.Search By Name\n8.calculate net salary\n9.exit\nChoice :");
		 choice =sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("enter the choice for emplyee type:");
			System.out.println("1:salaried\n 2:contract\n 3:vendor");
			int ch = sc.nextInt();
			boolean flag = EmployeeService.addEmployee(ch);
			if(flag)
			{
				System.out.println("employee added successfully");
			}
			else
			{
				System.out.println("erroe while adding the employee");
			}
			break;
		}
		case 2:
		{
			EmployeeService.displayAllEmployee();
			
			break;
		}
		case 3:
		{
			System.out.println("ente the id");
			String id = sc.next();
			Employee emp =EmployeeService.displayByID(id);
			if(emp!=null)
			{
				System.out.println(emp);
			}
			else
			{
				System.out.println("employee does not found");
			}
			break;
		}
		case 4:
		{
			System.out.println("Enter the choice for:\n 1:change salary\n2:change charges");
			int choice2 =sc.nextInt();
			boolean status =false;
			    if(choice2==1)
			    {
			    System.out.println("enter the id");
				String id = sc.next();
				System.out.println("enter the change salary");
				double salary = sc.nextDouble();
				status = EmployeeService.changeSalary(id,salary);
			    }
			    else
			    {
			    	System.out.println("enter the id");
					String id = sc.next();
			    	System.out.println("enter the change charges");
					double charges = sc.nextDouble();
					status = EmployeeService.changeCharges(id,charges);
			    }
			    if(status)
			    {
			    	System.out.println("employee updated successfuly");
			    }
			    else
			    {
			    	System.out.println("not found to update");
			    }
			break;
		}
		case 5:
		{
			Employee salArr[] =EmployeeService.displaySalariedEmp();
			if(salArr.length!=0)
			{
			for(Employee s:salArr)
			{
				if(s!=null)
				{
					System.out.println(s);
				}
			}
		}
		else
		{
			System.out.println("not found of salriedEmployee type");
		}
			break;
	  }
		case 6:
		{
			Employee conArr[] =EmployeeService.displayContractEmp();
			if(conArr.length!=0)
			{
			for(Employee s:conArr)
			{
				if(s!=null)
				{
					System.out.println(s);
				}
			}
		}
		else
		{
			System.out.println("not found of salriedEmployee type");
		}
			break;
		}
		case 7:
		{
			System.out.println("ente the name");
			String name = sc.next();
			
			Employee[] empArr =EmployeeService.displayByName(name);
			if(empArr.length!=0)
			{
				for(Employee emp:empArr)
				{
					System.out.println(emp);
				}
			}
			else
			{
				System.out.println("employee does not found");
			}
			break;
		}
		case 8:
		{
			System.out.println("enter the id of the employee");
			String id = sc.next();
			double salary = EmployeeService.calculateSalary(id);
			if(salary>0)
			{
			System.out.println("salary of the employee is: "+salary);
			}
			else
			{
				System.out.println("please enter the id of salariedEmployee");
			}
			break;
			
		}
		case 9:
		{
			sc.close();
			System.out.println("thank you for visiting");
			break;
		}
		default:
		{
			System.out.println("plese enter the correct choice");
		}
	}
 }while(choice !=9);	
	}

}
