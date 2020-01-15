package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.StoreAddress;

public class ClientTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ci/common/application-context.xml"));
		StoreAddress storeAddress=factory.getBean("storeAddress",StoreAddress.class);
		System.out.println(storeAddress.toString());
		/*
		 * StoreManager storeManager=factory.getBean("storeManager",StoreManager.class);
		 * System.out.println(storeManager.toString());
		 */
		/*
		 * Product product=factory.getBean("product",Product.class);
		 * System.out.println(product.toString());
		 */
		/*
		 * Store store=factory.getBean("store",Store.class);
		 * System.out.println(store.toString());
		 */
	}
}
