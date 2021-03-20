import java.util.Collection;

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
	public void testGetCompletedTasks() {
		assertNotNull(list);
		task.setComplete(true);
		task2.setComplete(true);
		list.addTask(task);
		list.addTask(task2);
		
		Collection<Task> tasks = list.getCompletedTasks();
		assertEquals(2, tasks.size());
	}
}
