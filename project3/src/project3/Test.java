package project3;

import java.util.Date;
import java.util.*;

public class Test {
private int testId;
private String testName;
private String date;
 Question quest;


public Test() {
	super();
	testId = 0;
	testName = null;
	date = null;
	quest = null;
}
public Test(int testId, String testName, String date,Question quest) {
	super();
	this.testId = testId;
	this.testName = testName;
	this.date = date;
	this.quest = quest;
}
public int getTestId() {
	return testId;
}
public void setTestId(int testId) {
	this.testId = testId;
}
public String getTestName() {
	return testName;
}
public void setTestName(String testName) {
	this.testName = testName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Test [testId=" + testId + ", testName=" + testName + ", date=" + date + ", quest=" + quest + "]";
}



}
