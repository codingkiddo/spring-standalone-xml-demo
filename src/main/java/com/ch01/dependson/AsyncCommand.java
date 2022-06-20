package com.ch01.dependson;

public class AsyncCommand implements Command {

	@Override
	public void execute() {
		
		System.out.println("AsyncCommand --> execute()");
		
	}

}
