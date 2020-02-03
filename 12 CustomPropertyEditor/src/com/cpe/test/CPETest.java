package com.cpe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cpe.beans.Box;
import com.cpe.editor.RectanglePropertyRegistrar;

public class CPETest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/cpe/common/application-context.xml"));
		((ConfigurableListableBeanFactory)factory).addPropertyEditorRegistrar(new RectanglePropertyRegistrar());
		Box box=factory.getBean("box",Box.class);
		System.out.println(box);
	}
}
