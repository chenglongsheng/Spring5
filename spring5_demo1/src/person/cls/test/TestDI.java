package person.cls.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import person.cls.Book;
import person.cls.Order;

public class TestDI {

    @Test
    public void testDI1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("order = " + order);
        order.printOrder();
    }

    @Test
    public void testDI2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println("book = " + book);
        book.printBook();
    }

}
