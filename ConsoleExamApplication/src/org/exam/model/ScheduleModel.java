package org.exam.model;

import java.util.*;

public class ScheduleModel {
	private int schid;
	private int examid;
	private Date examdate;
	private String startTime, endTime;

	public ScheduleModel() {

	}

	public ScheduleModel(Date examdate, String startTime, String endTime, int examid) {
		super();
		this.examid = examid;
		this.examdate = examdate;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getSchid() {
		return schid;
	}

	public void setSchid(int schid) {
		this.schid = schid;
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public Date getExamdate() {
		return examdate;
	}

	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
