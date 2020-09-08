package ev;

import ev.domain.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01QuickApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ac;

    @Test
    void contextLoads() {
        System.out.println(person);

        /*boolean b = ac.containsBean("helloService");
        System.out.println(b);*/
    }

}
