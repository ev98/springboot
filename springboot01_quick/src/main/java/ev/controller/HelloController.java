package ev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //将这个类的所有方法返回的数据直接写给浏览器
/*@RequestBody
@Controller*/
public class HelloController {

    /*@ResponseBody*/
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World Quick!";
    }

}
