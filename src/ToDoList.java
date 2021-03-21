import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();

	//Add a task to the ToDoList
	public void addTask (Task task) {
		tasks.put(task.getDescription(),task);
	}
	
	//Complete a task matching the description
	public void completeTask(String description) {
		tasks.get(description).isComplete();
	}
	
	//Get the complete status of the task that matches the description
	public boolean getStatus(String description) {
		return tasks.get(description).isComplete();
	}
	
	//Get the task matching the description
	public Task getTask(String description) {
		return tasks.get(description);
	}
	
	//Remove a task matching the description
	public Task removeTask(String description) {
		return tasks.remove(description);
	}
	
	//Get all the tasks in the ToDoList
	public Collection<Task> getAllTasks() {
		return tasks.values();

	}
	
	//Get all the uncompleted tasks in the ToDoList
	public Collection<Task> getUncompletedTasks() {
		Collection<Task> uncompletedTasks = new ArrayList<Task> ();
		Collection<Task> allTasks = new ArrayList<Task> ();
		allTasks = getAllTasks();
		for (Task task: allTasks) 
			if (!task.isComplete()) uncompletedTasks.add(task);
		return uncompletedTasks;
	}
}
