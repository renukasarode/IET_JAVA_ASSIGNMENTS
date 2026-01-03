package project4;

public class Student {
private  int stuid;
private String sName;
private int m1;
private int m2;
private int m3;
public Student() {
	super();
}
public Student(int stuid, String sName, int m1, int m2, int m3) {
	super();
	this.stuid = stuid;
	this.sName = sName;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
}
public int getStuid() {
	return stuid;
}
public void setStuid(int stuid) {
	this.stuid = stuid;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}
@Override
public String toString() {
	return "Student [stuid=" + stuid + ", sName=" + sName + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
}





}
