package oops;
import java.util.Scanner;
public class testVehicleArray {

	public static void main(String[] args) {
		int choice =0;
	   do {
       System.out.println("1:add the vehicles\n 2:Display Vehicle\n 3:get Vehicle By Id\n"
       		+ "4:update vehicle owner\n5:exit");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        {
        	System.out.println("enter the ownerName");
        	String ownerName = sc.next();
        	
        	System.out.println("enter the vehicle type");
        	sc.next();
        	String vehicleType = sc.nextLine();
        	
        	System.out.println("enter the vehicle purchaseDate in dd/MM/yyyy format");
        	String purchaseDate = sc.next();
        	if(VehicleArray.addVehilce(ownerName, vehicleType, purchaseDate))
        	{
        	
        		System.out.println("Vehicle Added successfully!!!");
        	}
        	else
        	{
        		System.out.println("error adding vehicle");
        	}
        	break;
        }
        case 2:
        {
        	VehicleArray.displayAllVehicle();
        	break;
        }
        case 3:
        {
        	System.out.println("enter the ID Vehicle");
        	int temp = sc.nextInt();
        	if(VehicleArray.findVehicleById(temp)!=null)
        	{
        		System.out.println(VehicleArray.findVehicleById(temp));
        	}
        	else
        	{
        		System.out.println("no vehicle found");
        	}
        	
        	break;
        }
        case 4:
        {
        	System.out.println("enter the vehicle ID ");
        	int id = sc.nextInt();
        	System.out.println("enter the new owner name ");
        	String name = sc.next();
        	if(VehicleArray.changeOwner(id,name)!=null)
        	{
        		System.out.println("owner name updated Successfully");
        		System.out.println(VehicleArray.changeOwner(id,name));
        	}
        	else
        	{
        		System.out.println("did not found the vehicle");
        	}
        	
        	break;
        }
        case 5:
        {
        	sc.close();
			System.out.println("Thank you for visiting....");
			break;
        }
        }   
	   }
	   while(choice!=5);
 	   
	}

}
