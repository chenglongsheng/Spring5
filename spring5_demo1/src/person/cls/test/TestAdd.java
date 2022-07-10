package person.cls.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import person.cls.User;

public class TestAdd {

    @Test
    public void testAdd() {
        // 读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
        System.out.println("user = " + user);
    }

}
