
public class User {
	private String name;
	private String surname;
	private String nickname;
	private String password;
	
	
	//constructor
	public User(String name, String surname, String nickname, String password) {
		//super();
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.password = password;
	}

	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
}
