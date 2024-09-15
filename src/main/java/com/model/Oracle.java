package com.model;

public class Oracle implements Connection
{

	@Override
	public void open() {
		System.out.println("Oracle open");
		
	}

	@Override
	public void close() {
		System.out.println("Oracle close");
	}
	

}
