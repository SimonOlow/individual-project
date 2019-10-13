package individualProjectApp;

import java.util.ArrayList;

public class UserReg {
	
	private ArrayList<User> users = new ArrayList<>();
	
	public UserReg () {
		this.setUsers(new ArrayList<User>());
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	// add User in to the UserReg
	public void addUser (User user) {
		this.getUsers().add(user);
	}
	// signIn User
	public User signIn (String name, String password) {
			User tempUser;
			int i = 0;
			boolean find = false;
			int index = -1;
			
			while (i < this.getUsers().size() && find == false) {
				tempUser = this.getUsers().get(i);
				if (tempUser.getName().equals(name) && tempUser.getPassword().equals(password) ) {
					index = i;
					find = true;
				}
				i++;
			}
			if (index != -1) {
				tempUser = this.getUsers().get(index);
			}
			else {
				tempUser = null;
			}
			return tempUser;
		}
	
	
	}
	

