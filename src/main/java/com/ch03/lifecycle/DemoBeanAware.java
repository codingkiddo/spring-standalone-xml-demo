package com.ch03.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

public class DemoBeanAware
		implements ApplicationContextAware, ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
		BeanNameAware, LoadTimeWeaverAware, MessageSourceAware, NotificationPublisherAware, ResourceLoaderAware {

	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("setResourceLoader");
		
	}

	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		System.out.println("");
	}

	public void setMessageSource(MessageSource messageSource) {
		System.out.println("setMessageSource");		
	}

	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
		System.out.println("setLoadTimeWeaver");		
	}

	public void setBeanName(String name) {
		System.out.println("setBeanName - " + name);		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory");		
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("setBeanClassLoader");		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("setApplicationEventPublisher");		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CustomBeanPostProcessor obj = (CustomBeanPostProcessor) applicationContext.getBean("customBeanPostProcessor");
		System.out.println("setApplicationContext - " + obj);
	}
	
}