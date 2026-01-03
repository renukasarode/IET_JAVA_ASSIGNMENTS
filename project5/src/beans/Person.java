package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	static int sCnt,pCnt,cCnt=0;

	private String pid;
	private String pname;
	private Date bdate;
	public Person() {
		super();
	}
	public Person(String empType, String pname, Date bdate) {
		super();
		this.pid = generatePid(empType);
		this.pname = pname;
		this.bdate = bdate;
	}
	private String generatePid(String empType) {
		if(empType.equals("s"))
		{
			return (empType+(++sCnt));
		}
		else if(empType.equals("c"))
		{
			return (empType+(++cCnt));
		}
		else
		{
			return (empType+(++cCnt));
		}
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sfd = new SimpleDateFormat("dd/mm/yyyy");
		String str = sfd.format(bdate);
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + str + "]";
	}
	
	
	}


