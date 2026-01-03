package project3;

public class Question {
	private int qId;
	private String qText;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4; 
	
	public Question() {
		this(0,"","","","","");
	}
	public Question(int qId, String qText, String opt1, String opt2, String opt3, String opt4) {
		super();
		this.qId = qId;
		this.qText = qText;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getqText() {
		return qText;
	}
	public void setqText(String qText) {
		this.qText = qText;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", qText=" + qText + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
				+ ", opt4=" + opt4 + "]";
	}
	
    
	}


