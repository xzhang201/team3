import java.util.HashSet;

public class Task {
	private String description = null;
	private boolean isComplete = false;
	private String assignee;
	private int duration;
	private HashSet<String> resources = new HashSet<String>();
	
	
	public Task(String description) {
		super();
		this.description = description;
	}
	
	public Task(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
	public void setAssignTask(String assignee) {
		this.assignee = assignee;
	}
	
	public void setTaskDuration(int duration) {
		this.duration = duration;
	}
	
	public String getAssignTask() {
		return assignee;
	}
	
	public int getTaskDuration() {
		return duration;
	}
	
	public HashSet<String> getResources() {
		return resources;
	}
	public void setResources(HashSet<String> resources) {
		this.resources = resources;
	}
	public void addResources(HashSet<String> resources) {
		this.resources.addAll(resources);
	}

}
