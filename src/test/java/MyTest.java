import com.sgl.pojo.User;
import com.sgl.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by sgl on 2020/5/7.
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        List<User> userLike = userService.findUserLike("石");
        for (User user : userLike) {
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        User userLike = userService.findUser(1);
        System.out.println(userLike);
    }
}
