package project4;

public class StudentService {

	static int cnt;
	static Student [] students = new Student[10];
	static {
		students[0] = new Student(1,"xyz",18,16,17);
		students[1] = new Student(2,"abc",180,160,170);
		cnt=3;
	}
      public static boolean addStudents(Student s)
      {
    	  if(s!=null)
    	  {
    	    students[cnt-1] = s;
    	    cnt++;
    	    return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      }
	public static void displayStudents() {
        if(students.length!=0)
        {
        	System.out.println("Student Details: ");
        	for(Student student:students)
        	{
        		if(student!=null)
        		{
        		System.out.println("____________");
        		System.out.println("Student Id: "+student.getStuid());
        		System.out.println("name: "+student.getsName());
        		System.out.println("m1: "+student.getM1());
        		System.out.println("m2: "+student.getM2());
        		System.out.println("m3: "+student.getM3());
        		}
        	}
        }
	}
	public static Student findById(int id) {
      for(Student student:students)
      {
    	  if(student!=null)
    	  {
    		  if(student.getStuid()==id)
    		  {
    			return student;
    		  }
    		break;
    	  }
    	  break;
      }
      return null;
	}
	public static void displayStud(Student s)
	{
		if(s!=null)
		{
			{
				System.out.println("Student details: ");
        		System.out.println("____________");
        		System.out.println("Student Id: "+s.getStuid());
        		System.out.println("name: "+s.getsName());
        		System.out.println("m1: "+s.getM1());
        		System.out.println("m2: "+s.getM2());
        		System.out.println("m3: "+s.getM3());
        	}
		}
	}
	public static Student[] findByName(String name) {
		Student arr[] = new Student[cnt];
		int k=0;
		 for(Student student:students)
	      {
	    	  if(student!=null)
	    	  {
	    		  if(student.getsName().equals(name))
	    		  {
	    			arr[k++] = student;
	    		  }
	    	  }
	      }
	      return arr;
				
	}
	public static double calculateGPA(int m1, int m2, int m3) {
          return ((m1/3)+(m2/2)+(m3/4));	
	}
}


