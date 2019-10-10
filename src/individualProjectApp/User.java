package individualProjectApp;

import java.util.ArrayList;

public class User {
	
	private String name;
	private String password;
	private ArrayList<Project> projects = new ArrayList<>();
	
	public User (String name, String password) {
		this.setName(name);
		this.setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
	// add Project in to the User
	public void addProject (Project project) {
		this.getProjects().add(project);
	}
	

}

