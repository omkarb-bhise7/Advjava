package com.app.dto;

import java.time.LocalDateTime;

public class ApiResponse 
{
	private String msg;
	private LocalDateTime timeStamp;
	
	public ApiResponse(String msg)
	{
		this.msg=msg;
		timeStamp=LocalDateTime.now();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ApiResponse [msg=" + msg + ", timeStamp=" + timeStamp + "]";
	}
	
	
	
	
}
