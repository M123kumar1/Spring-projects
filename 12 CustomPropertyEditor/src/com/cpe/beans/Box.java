package com.cpe.beans;

public class Box {
	private Rectangle rectangle;

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	@Override
	public String toString() {
		return "Box [rectangle=" + rectangle + "]";
	}
	
}
