import com.alivin.controller.PersonAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction personAction = context.getBean("personAction", PersonAction.class);
        personAction.show();
    }
}
