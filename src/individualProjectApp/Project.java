package individualProjectApp;

import java.util.ArrayList;

public class Project {
	
	private String title;
	private ArrayList<Task> tasks = new ArrayList<>();
	
	public Project (String title) {
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	// add Task in to the Project
	public void addTask (Task task) {
		Task tempTask;
		tempTask = this.searchTask(task.getTitle());
		if (tempTask == null) {
			this.getTasks().add(task);
		}
		else {
			System.out.println("This task " +task.getTitle()+ " already found");
		}
	}
	
	// remove Task from the Project
	public void removeTask (String name) {
		
		Task tempTask;
		int index;
		tempTask = this.searchTask(name);
		if (tempTask != null) {
		index = tasks.indexOf(tempTask);
		tasks.remove(index);
		
		}	
	}
	
	// search Task in the Project
	public Task searchTask (String name) {
		Task tempTask;
		int i = 0;
		boolean find = false;
		int index = -1;
		
		while (i < this.getTasks().size() && find == false) {
			tempTask = this.getTasks().get(i);
			if (tempTask.getTitle().equals(name)) {
				index = i;
				find = true;
			}
			i++;
		}
		if (index != -1) {
			tempTask = this.getTasks().get(index);
		}
		else {
			tempTask = null;
		}
		return tempTask;
	}
	
	// update Task in the Project
	public void updateTask (String oldTitle, String newTitle, String oldDate, String newDate) {
		Task tempTask;
		tempTask = this.searchTask(oldTitle);
		tempTask.setTitle(newTitle);
		tempTask.setDueDate(newDate);
	}

}

