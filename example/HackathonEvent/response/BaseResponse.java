package com.example.HackathonEvent.response;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5817107932070977567L;

	private T response;
	
	private int statusCode;

	/**
	 * @return the response
	 */
	public T getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(T response) {
		this.response = response;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
