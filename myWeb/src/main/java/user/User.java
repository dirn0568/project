package user;

public class User {
	private String userid;
	private String userpassword;
	private String username;
	private String usergender;
	private String useremail;
	
	public String getUserID() {
		return userid;
	}
	public void setUserID(String userID) {
		this.userid = userID;
	}
	public String getUserPassword() {
		return userpassword;
	}
	public void setUserPassword(String userPassword) {
		this.userpassword = userPassword;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getUserGender() {
		return usergender;
	}
	public void setUserGender(String userGender) {
		this.usergender = userGender;
	}
	public String getUserEmail() {
		return useremail;
	}
	public void setUserEmail(String userEmail) {
		this.useremail = userEmail;
	}
	
	
}
