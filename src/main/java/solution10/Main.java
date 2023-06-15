package solution10;
// Write a java program to demonstrate ApplicationContextAware interface.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("bean.xml");
        AppAware appAware = (AppAware) context.getBean("collection");
        appAware.print();

    }
}
