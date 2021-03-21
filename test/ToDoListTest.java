import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	private ToDoList list;
	private String item1;
	private String item2;
	private Task task;
	private Task task2;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
	    list = new ToDoList();
	    item1 = "desc 1";
	    item2 = "desc 2";
	    task = new Task(item1);
	    task2 = new Task(item2);
	}
	@After
	 public void tearDown() throws Exception{
		list = null;
	    item1 = null;
	    item2 = null;
	    task = null;
	    task2 = null;
	}

	@Test
	public void testAddTask() {
		assertNotNull(list);
		assertEquals(0, list.getAllTasks().size());	
		list.addTask(task);		
		assertEquals(1, list.getAllTasks().size());	
		assertTrue(0 < list.getAllTasks().size());	
		
	}
	@Test
	public void testgetStatus() {
		assertNotNull(list);
		list.addTask(task);
		list.addTask(task2);
		list.getTask(item1).setComplete(true);		
		assertTrue("Status is true",list.getStatus(item1));
		assertFalse(list.getStatus(item2));
		
	}
	@Test
	public void testRemoveTask() {
		assertNotNull(list);
		list.addTask(task);	
		assertNotNull(list.getAllTasks().size());
		list.removeTask(item1);
		
	}
	@Test
	public void testGetUncompletedTasks() {
		assertNotNull(list);
		task.setComplete(false);
		task2.setComplete(false);
		list.addTask(task);
		list.addTask(task2);
		
		Collection<Task> tasks = list.getUncompletedTasks();
		assertEquals(2, tasks.size());
		
		task.setComplete(true);
		tasks = list.getUncompletedTasks();
		assertEquals(1, tasks.size());
	}
	
	
	@Test
	public void testGetAssignee() {
		assertNotNull(list);
		task.setAssignTask("Ramya");
		task2.setAssignTask("Xin");
		
		assertNotNull(task.getAssignTask());
		assertNotNull(task.getAssignTask());		
	}
	
	@Test
	public void testGetDuration() {
		assertNotNull(list);
		task.setTaskDuration(30);
		task2.setTaskDuration(60);

		assertNotNull(task.getTaskDuration());
		assertNotNull(task2.getTaskDuration());
	}
	
	@Test
	public void testGetResources() {
		assertNotNull(list);
		task.setResources(null);
		assertNull(task.getResources());
		
		HashSet<String> resources1 = new HashSet<String>();
		resources1.add("Wood");
		resources1.add("Iron");
		resources1.add("Bronze");
		task.setResources(resources1);
		assertNotNull(task.getResources());
		assertEquals(3,task.getResources().size());
		
		HashSet<String> resources2 = new HashSet<String>();
		resources2.add("Wood");
		resources2.add("Iron");
		task.setResources(resources2);
		assertNotNull(task.getResources());
		assertEquals(2,task.getResources().size());
		
		HashSet<String> resources3 = new HashSet<String>();
		resources3.add("Leather");
		resources3.add("Coal");
		resources3.add("Petrol");
		task.addResources(resources3);
		assertNotNull(task.getResources());
		assertEquals(5,task.getResources().size());

	}
}
