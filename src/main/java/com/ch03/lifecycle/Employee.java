package com.ch03.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.Lifecycle;

public class Employee implements InitializingBean, DisposableBean, 
	Lifecycle, ApplicationContextAware, BeanNameAware {
//public class Employee {
	
	private int id;
	private String empName;
	private String beanName;
	private ApplicationContext applicationContext;
	
	public Employee() {
	}
	
	public Employee(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void initBean() {
        System.out.println("initBean for : Employee");
    }
     
    public void destroyBean() {
        System.out.println("destroyBean for : Employee");
    }
    
    @PostConstruct
    public void postConstructBean() {
        System.out.println("postConstructBean for : Employee");
    }
     
    @PreDestroy
    public void preDestroyBean() {
        System.out.println("preDestroyBean for : Employee");
    }

	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee -> public void afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		System.out.println("Employee -> public void destroy()");
		System.out.println("BeanName -> " + this.beanName);
	}

	@Override
	public void start() {
		System.out.println("start for : Employee");		
	}

	@Override
	public void stop() {
		System.out.println("stop for : Employee");		
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
