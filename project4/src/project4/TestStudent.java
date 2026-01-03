package project4;
import java.util.Arrays;
import java.util.Scanner;

public class TestStudent {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1:Add all students\n2:Display All Student\n3:Search by id\n4:Search by name\n"
					+ "5:calculate GPA of a student\n6:Exit");
			System.out.println("please enter your chooice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
			{
				System.out.println("enter the id of the student");
				int id = sc.nextInt();
				System.out.println("enter the name of the student");
				String name = sc.next();
				System.out.println("enter the marksfor first subject");
				int m1 = sc.nextInt();
				System.out.println("enter the marksfor second subject");
				int m2 = sc.nextInt();
				System.out.println("enter the marksfor third subject");
				int m3 = sc.nextInt();
				
				Student s1 = new Student(id,name,m1,m2,m3);
				if(StudentService.addStudents(s1))
				{
					System.out.println("student added successfully");
				}
				else
				{
					System.out.println("failed to add the student");
				}
				break;
			}
			case 2:
			{
				StudentService.displayStudents();
				break;
			}
			case 3:
			{
				System.out.println("enter the student id");
				int id = sc.nextInt();
				Student student = StudentService.findById(id);
				if(student!=null)
				{
				  StudentService.displayStud(student);
				}
				else
				{
					System.out.println("student is not found");
				}
				break;
			}
			case 4:
			{
				System.out.println("enter the name of Student");
				String name = sc.next();
				Student[] studArr = StudentService.findByName(name);
				if(studArr.length !=0)
				{
				for(Student s:studArr)
				{
					if(s!=null)
					{
					StudentService.displayStud(s);
					}
				}
				}
				else
				{
				System.out.println("not found");
				}
				break;
			}
			case 5:
			{
				System.out.println("enter the marksfor first subject");
				int m1 = sc.nextInt();
				System.out.println("enter the marksfor second subject");
				int m2 = sc.nextInt();
				System.out.println("enter the marksfor third subject");
				int m3 = sc.nextInt();
				double gpa = StudentService.calculateGPA(m1,m2,m3);
				System.out.println("GPA is: "+gpa);
				break;
			}
			case 6:
			{
				sc.close();
				break;
			}
			default:
			{
				System.out.println("please enter the correct choice");
			}
			}
		}
		while(choice!=6);
	}
}
