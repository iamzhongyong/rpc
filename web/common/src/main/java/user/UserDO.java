package user;
public class UserDO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8062266822254767045L;

	private String name;
	
	private int sex;
	
	private String password;
	
	private String email;
	
	private String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public UserDO name(String name){
		this.name = name;
		return this;
	}
	
	public UserDO sex(int sex){
		this.sex = sex;
		return this;
	}
	
	public UserDO password(String password){
		this.password = password;
		return this;
	}
	public UserDO email(String email){
		this.email = email;
		return this;
	}
}
