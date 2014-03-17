package event;

import java.util.Date;

public class SignEvent {
	
	private String companyName;

	private String signName;
	
	private Date signDate;

	public SignEvent(String name,String signName, Date signDate) {
		super();
		this.companyName = name;
		this.signName = signName;
		this.signDate = signDate;
	}
	
	public String getMessage(){
		StringBuilder sb = new StringBuilder();
		sb.append("������˾��").append(this.companyName);
		sb.append("ǩ���ˣ�").append(signName).append(",ǩ�����ڣ�").append(signDate);
		return sb.toString();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}
}
