package comm.hibernate.hibernatemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="task_id")
	private int task_id;
	
	@Column(name="task_name")
	private String task_name;
	
	public  Task() {
		
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public Task(String task_name) {
		super();
		this.task_name = task_name;
	}

	@Override
	public String toString() {
		return "Task [task_id=" + task_id + ", task_name=" + task_name + "]";
	}
	
	
	
	
	
	
}
