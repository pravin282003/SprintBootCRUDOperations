package com.model;

public class Mysql implements Connection
{

	@Override
	public void open() {
		System.out.println("MYSQL open");
		
	}

	@Override
	public void close() {
		System.out.println("MYSQL close");
		
	}
	

}
