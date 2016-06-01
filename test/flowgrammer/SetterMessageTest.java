package flowgrammer;

import static org.junit.Assert.assertNotNull;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:conf/beans.xml")
public class SetterMessageTest {
	private MessageBean bean;
	private ApplicationContext context;
	
	@Before
	public void setup() {
		System.out.println("setup");
		context = new FileSystemXmlApplicationContext("conf/beans.xml");
		bean = (MessageBean) context.getBean("MessageBean");
	}
	
    @Test
    public void testMessage() {   
        assertNotNull("Constructor message instance is null.", "test");
    }
    
    @Test
    public void testMessageBean() {
    	String hello = bean.sayHello();
    	org.junit.Assert.assertEquals("안녕", hello);
    }
    
    @After
    public void after() {
    	System.out.println("after");
    }
}
