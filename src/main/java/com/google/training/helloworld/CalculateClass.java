package com.google.training.helloworld;

public class CalculateClass {
	public int  message = 0;

    public CalculateClass () {
    }

    public CalculateClass(int f, int s) {
    	this.message = f+s;
    	
	}
    public CalculateClass(String name, String period) {
		// TODO Auto-generated constructor stub
    	this.message = Integer.valueOf(name) + Integer.valueOf(period);
	}

	public int getMessage() {
        return message;
    }

}
