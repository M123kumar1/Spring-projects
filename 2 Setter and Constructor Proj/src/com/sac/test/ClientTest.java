package com.sac.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sac.beans.WeatherReporter;

public class ClientTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/sac/common/application-context.xml"));
		WeatherReporter weatherReporter = factory.getBean("weatherReporter",WeatherReporter.class);
		weatherReporter.report(102);
	}

}
