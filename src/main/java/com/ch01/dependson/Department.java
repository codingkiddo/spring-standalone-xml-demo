package com.ch01.dependson;

public class Department {
    
    private long id;
    private String name;
    
    private static int count = 0;
	static {
		System.out.println("Intializing Count !!!! ");
		count = 100;
		System.out.println("Intializing Complete !!!! ");
	}
	
	public Department() {
		System.out.println("public Department() {}");
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
	
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}