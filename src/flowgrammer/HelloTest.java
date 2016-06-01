package flowgrammer;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import flowgrammer.knight.Knight;


public class HelloTest {

	private static ApplicationContext context;

	private static Logger logger = Logger.getLogger(HelloTest.class);
	
	public static void main(String[] args) {
//		System.out.println("test");
		
		PropertyConfigurator.configure("conf/log4j.properties");
		
		context = new FileSystemXmlApplicationContext("conf/beans.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
//		MessageBean bean = (MessageBean) context.getBean("MessageBean");
//		bean.sayHello();
		
	}

}
