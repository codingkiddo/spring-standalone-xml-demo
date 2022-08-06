package sia.knights;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BraveKnight
		implements Knight, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	private Quest quest;
	private String name;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}

	@Override
	public void setBeanName(String name) {
		this.name = name;
		System.out.println("Name: " + this.name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory: " + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext: " + applicationContext);
	}

}
