package entity;

import java.io.Serializable;

public class Task implements Serializable {
	private int id;
	private String title;
	private String task;
	private String limitdate;

	public Task() {}

	public Task(int id, String title, String task, String limitdate) {
		this.id = id;
		this.title = title;
		this.task = task;
		this.limitdate = limitdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getLimitdate() {
		return limitdate;
	}

	public void setLimitdate(String limitdate) {
		this.limitdate = limitdate;
	}


}