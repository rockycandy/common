package com.wm.spring.chapter01;

import java.awt.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.activation.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.transaction.jta.SimpleTransactionFactory;



public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

	System.out.println(MapTest.class.getName());
	Map<String, Integer> map = new HashMap<String,Integer>();

	String a_str = "assadsf:daff:dad:1233:9";
	String bString = a_str.substring(0, a_str.lastIndexOf(':'));
	System.out.println(bString + " idx: " + a_str.lastIndexOf(':'));
		/**
		 * 
		 */
	}

}
