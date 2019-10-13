package individualProjectApp;

public  class Controller {
	private UserReg userReg ;
	private String userName;
	private String password;
	
	public Controller(UserReg userReg, String userName ,String Password) {
		
		this.userReg = userReg;
		this.userName= userName;
		this.password = Password;
	}
	
	public String getUserNames() {
		return userName;
	}

	public void setUserNames(String userName) {
		this.userName = userName;
	}

	public String getPasswords() {
		return password;
	}
	public void setPasswords(String password) {
		this.password = password;
	}

	public UserReg getUserReg() {
		return userReg;
	}

	public void setUserreg(UserReg userReg) {
		this.userReg = userReg;
	}
	
	public User getUser() {
		User tmp = getUserReg().signIn(getUserNames(), getPasswords());
		return tmp;
	}
	

	public Project searchTask (String name) {
		Project tempTask;
		int i = 0;
		boolean find = false;
		int index = -1;
		
		while (i < this.getUser().getProjects().size() && find == false) {
			tempTask = this.getUser().getProjects().get(i);
			if (tempTask.getTitle().equals(name)) {
				index = i;
				find = true;
			}
			i++;
		}
		if (index != -1) {
			tempTask = this.getUser().getProjects().get(index);
		}
		else {
			tempTask = null;
		}
		return tempTask;
	}
	
	


	

}
