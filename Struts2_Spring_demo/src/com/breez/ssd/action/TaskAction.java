package com.breez.ssd.action;

import java.util.List;

import com.breez.ssd.domain.Task;
import com.breez.ssd.service.IGetTask;
import com.opensymphony.xwork2.ActionSupport;

public class TaskAction extends ActionSupport {
	
	private IGetTask getTask;
	
	private List<Task> tasks;
	
	@Override
	public String execute() throws Exception {
		this.setTasks(getTask.getTask());
		return super.execute();
	}

	public IGetTask getGetTask() {
		return getTask;
	}

	public void setGetTask(IGetTask getTask) {
		this.getTask = getTask;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
