import com.alivin.dao.UserDaoMySqlImpl;
import com.alivin.service.UserService;
import com.alivin.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        // 调用业务层，不与 dao 层发生直接接触
        /*UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoMySqlImpl());
        userService.getUser();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        serviceImpl.getUser();
    }

}
