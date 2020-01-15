package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.MessageWriter;

public class ClientTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\ss\\commons\\application-context.xml"));
		MessageWriter messageWriter=factory.getBean("messageWriter",MessageWriter.class);
		
		/*IMessageConverter messageConverter=factory.getBean("htmlMessageConverter",HTMLMessageConverterImpl.class);
		messageWriter.setMessageConverter(messageConverter);*/
		messageWriter.writeMessage("Welcome to Spring!");
	}
}
