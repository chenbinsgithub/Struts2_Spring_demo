package com.breez.ssd.domain;

public class Task {
	private Integer num;
	private String name;
	
	private String desc;

	public Task(Integer num, String name, String desc) {
		this.num = num;
		this.name = name;
		this.desc = desc;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Task [num=" + num + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
