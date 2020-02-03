package com.cpe.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.beans.Rectangle;

public class RectanglePropertyRegistrar implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Rectangle.class, new RectanglePropertyEditor());
	}

}
