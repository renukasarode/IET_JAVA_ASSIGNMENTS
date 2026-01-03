package oops;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VehicleArray {

	static Vehicle[] vehicles = new Vehicle[10];
	static int cnt =0;
	
	static {
		
		vehicles[0] = new Vehicle(1,"rahul","2 wheeler ",generateJavaDate("22/3/2001"));
		vehicles[1] = new Vehicle(2,"neha","3 wheeler ",generateJavaDate("22/3/2001"));
		vehicles[2] = new Vehicle(3,"omkar","4 wheeler ",generateJavaDate("22/3/2001"));
		cnt =4;
	}
	
	public static boolean addVehilce(String ownerName,String vehicleType,String purchaseDate)
	{
		if(cnt!=vehicles.length)
		{
		vehicles[cnt-1] = new Vehicle(cnt++,ownerName,vehicleType,generateJavaDate(purchaseDate));
		return true;
		}
		return false;
	}
	
	
	public static Date generateJavaDate(String date) {
		Date newDate=null;
		SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			newDate = std.parse(date);
			return newDate;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//System.out.println("enter the proper format data as of dd/MM/yyyy ");
			e.printStackTrace();
		}
		return null;
	}

	public static void displayAllVehicle() {
		if(vehicles.length!=0)
		{
         for(Vehicle vehicle:vehicles)		
         { if(vehicle!=null)
         {
       	 System.out.println(vehicle);
         }
         }
		}
         else
         {
        	 System.out.println("no vehicles in the stock");
         }
         
        
	}


	public static Vehicle findVehicleById(int temp) {
		for(Vehicle vehicle:vehicles)		
        {
		  if(vehicle!=null)
	      {
		   if(vehicle.getID()==temp)
        {
      	  return vehicle;
        }
        }
		}
		return null;
	}


	public static Vehicle changeOwner(int id, String ownerName) {
		Vehicle vehicle = findVehicleById(id); 
		if(vehicle!=null)
		{
		  vehicle.setOwner(ownerName);
		  return vehicle;
		}
		else
		{
			return null;
		}	
	}     
}
	


