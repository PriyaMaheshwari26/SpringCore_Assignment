package solution10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class AppAware implements ApplicationContextAware {

    private List<String> list;
    private ApplicationContext applicationContext;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public void print() {

        for(String l :list)
            System.out.println("List: "+l);

    }

}
