package person.cls.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import person.cls.Order;

public class TestDI {

    @Test
    public void testDI1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("order = " + order);
        order.printOrder();
    }

}
