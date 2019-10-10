package individualProjectApp;

public class Task {
	
	private String title;
	private String dueDate;
	private Boolean markAsDone;
	
	public Task (String title, String dueDate, Boolean markAsDone) {
		this.setTitle(title);
		this.setDueDate(dueDate);
		this.setMarkAsDone(markAsDone);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Boolean getMarkAsDone() {
		return markAsDone;
	}

	public void setMarkAsDone(Boolean markAsDone) {
		this.markAsDone = markAsDone;
	}
	public void status () {
		
	}
	

}

