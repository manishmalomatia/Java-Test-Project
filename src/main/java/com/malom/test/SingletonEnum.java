package com.malom.test;

public enum SingletonEnum {
	INTANCE1(10),
	INSTANCE(20),SUMMER(12);
	private int value;
	SingletonEnum(int enumvalue){
		this.value=enumvalue;
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
