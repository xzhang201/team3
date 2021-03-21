import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask (Task task) {
		tasks.put(task.getDescription(),task);
	}
	public void completeTask(String description) {
		tasks.get(description).isComplete();
	}
	public boolean getStatus(String description) {
		return tasks.get(description).isComplete();
	}
	public Task getTask(String description) {
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();

	}
	public Collection<Task> getUncompletedTasks() {
		Collection<Task> uncompletedTasks = new ArrayList<Task> ();
		Collection<Task> allTasks = new ArrayList<Task> ();
		allTasks = getAllTasks();
		for (Task task: allTasks) 
			if (!task.isComplete()) uncompletedTasks.add(task);
		return uncompletedTasks;
	}
}
