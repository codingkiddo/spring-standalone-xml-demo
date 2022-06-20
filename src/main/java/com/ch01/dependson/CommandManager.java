package com.ch01.dependson;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class CommandManager implements ApplicationContextAware {

	private ApplicationContext applicationContext;


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("CommandManager ---> setApplicationContext(ApplicationContext applicationContext)");
        this.applicationContext = applicationContext;
    }

	public Command process() {
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        command.execute();
        return command;
    }

    // okay... but where is the implementation of this method?
    protected abstract Command createCommand();
}
