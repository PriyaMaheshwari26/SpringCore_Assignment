package solution2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import solution10.AppAware;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Question q = (Question) context.getBean("question");
        q.printAnswerList();
        q.printAnswerSet();
        q.printAnswerMap();
    }
}
