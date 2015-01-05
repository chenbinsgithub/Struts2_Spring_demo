package com.breez.ssd.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.breez.ssd.domain.Task;
import com.breez.ssd.service.IGetTask;

public class GetTask implements IGetTask {

	@Override
	public List<Task> getTask() {
		List<Task> tasks = new ArrayList<Task>();
		Task task = null;
		for(int i = 0; i < 10; i++) {
			task = new Task(i, "task: " + i, "task desc: " + i);
			tasks.add(task);
		}
		return tasks;
	}

}
