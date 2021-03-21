import java.util.HashSet;

public class Task {
	private String description = null;
	private boolean isComplete = false;
	private String assignee;
	private int duration;
	private HashSet<String> resources = new HashSet<String>();
	private int prioritize = 0;
	private String classification;
	
	public Task(String description) {
		super();
		this.description = description;
	}
	
	public Task(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}
	
	//Get the description of the task
	public String getDescription() {
		return description;
	}
	
	//Set the description of the task
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Determine whether the task is complete
	public boolean isComplete() {
		return isComplete;
	}
	
	//Set the complete status to the task
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	//Set the assignee to to the task
	public void setAssignTask(String assignee) {
		this.assignee = assignee;
	}
	
	//Set the duration of the task
	public void setTaskDuration(int duration) {
		this.duration = duration;
	}
	
	//Get who is assigned to do the task
	public String getAssignTask() {
		return assignee;
	}
	
	//Get the duration of the task
	public int getTaskDuration() {
		return duration;
	}
	
	//Get the resources required to complete the task
	public HashSet<String> getResources() {
		return resources;
	}
	
	//Set the resources required to complete the task
	public void setResources(HashSet<String> resources) {
		this.resources = resources;
	}
	
	//Add more resources required to complete the task
	public void addResources(HashSet<String> resources) {
		this.resources.addAll(resources);
	}

	//Set the prioritization of the task
	public void setPrioritization(int prioritize) {
		this.prioritize = prioritize;
	}
	
	//Get the prioritization of the task
	public int getPrioritization() {
		return prioritize;
	}
	
	//Set the classification of the task
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	//Get the classification of the task
	public String getClassification() {
		return classification;
	}
}
