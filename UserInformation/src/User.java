
public class User {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;

	User() {

	}

	User(String newUsername, String newPassword, String newFirstname, String newlastname, String newEmail) {
		username = newUsername;
		password = newPassword;
		firstname = newFirstname;
		lastname = newlastname;
		email = newEmail;
	}

	// setter and getter methods
	public String getUsername() {
		return username;
	}

	public void setUsername(String newUsername) {
		username = newUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String newFirstname) {
		firstname = newFirstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String toString() {
		return "(" + username + ", " + password + ", " + lastname + ", " + firstname + ", " + email + ")";
	}

}
