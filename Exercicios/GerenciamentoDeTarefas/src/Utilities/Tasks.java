package Utilities;

public class Tasks {

	private String task;
	private boolean status;
	
	public Tasks(String task) {
		this.task = task;
		this.status = false;
	}

	public String getTask() {
		return task;
	}

	public boolean getStatus() {
		return status;
	}

	public void marcarComoConcluida() {
		this.status = true;
	}
	
	@Override
	public String toString() {
		return "["+(status ? "X" : " ")+"]"+task;
	}
}
