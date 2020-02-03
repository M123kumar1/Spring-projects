package com.cpe.beans;

public class Rectangle {
	private int length;
	private int breadth;
	public void setLength(int length) {
		this.length = length;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
}
