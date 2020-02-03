package com.cpe.editor;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.Rectangle;

public class RectanglePropertyEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Rectangle rectangle=new Rectangle();
		String[] token=text.split(",");
		rectangle.setLength(Integer.parseInt(token[0]));
		rectangle.setLength(Integer.parseInt(token[0]));
		setValue(rectangle);
	}
}
