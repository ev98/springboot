package ev;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot02ApplicationTests {

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads(){

        //日志的级别
        //由低到高trace<debug<info<warn<error
        //可以调整输出的日志级别：日志就只会在这个级别及以后的高级别生效
        logger.trace("trance日志...");
        logger.debug("debug日志...");
        //springboot默认使用info级别
        logger.info("info日志...");
        logger.warn("warn日志...");
        logger.error("error日志...");

    }

}
