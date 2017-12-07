package entity;

import java.io.Serializable;

public class Add implements Serializable {

	private String name;
	private boolean status;
	private String content;

	public Add() {}

	public Add(String name, boolean status, String content) {
		this.name = name;
		this.status = status;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
