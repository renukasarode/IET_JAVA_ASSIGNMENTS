package oops;

import java.util.Date;

public class Vehicle {

	private int id;
	private String ownerName;
	private String vehicleType;
	private Date purchaseDate;
	
	public Vehicle()
	{
		id=0;
		ownerName="";
		vehicleType="";
		purchaseDate=null;
	}
	public Vehicle( int id,String ownerName,String vehicleType, Date purchaseDate)
	{
		this.id=id;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.purchaseDate=purchaseDate;
	}
	
	public int getID()
	{
		return id;
	}
	public String getOwner()
	{
		return ownerName;
	}
	public String getType()
	{
		return vehicleType;
	}
	public Date getDate()
	{
		return purchaseDate;
	}
	
	public void setID(int id)
	{
		this.id=id;
	}
	public void setOwner(String ownerName)
	{
		this.ownerName=ownerName;
	}
	public void setType(String vehicleType)
	{
		this.vehicleType=vehicleType;
	}
	public void setDate(Date purchaseDate)
	{
		this.purchaseDate=purchaseDate;
	}
	
	public String toString()
	{
		return "[id = "+id+" ownerName = "+ownerName+" vehicleType = "+vehicleType+" Date = "+purchaseDate+" ]";
	}
	
	
	
}
