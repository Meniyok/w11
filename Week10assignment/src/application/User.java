package application;







import java.io.Serializable;







public class User implements Serializable {







	private static final long serialVersionUID = 0;



	private int id;



	private String username;



	private String lastName;



	private String firstName;



	private String password;







	public int getId() {



		return id;



	}







	public void setId(int id) {



		this.id = id;



	}







	public String getUsername() {



		return username;



	}







	public void setUsername(String username) {



		this.username = username;



	}







	public String getLastName() {



		return lastName;



	}







	public void setLastName(String lastName) {



		this.lastName = lastName;



	}







	public String getFirstName() {



		return firstName;



	}







	public void setFirstName(String firstName) {



		this.firstName = firstName;



	}







	public String getPassword() {



		return password;



	}







	public void setPassword(String password) {



		this.password = password;



	}







}