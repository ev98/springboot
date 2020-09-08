package ev.controller;

import ev.domain.User;
import ev.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/userList")
    public List<User> userList() {
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @RequestMapping("/userListById")
    public User userListById() {
        User user = userMapper.queryUserById(1);
        return user;
    }

    @RequestMapping("/addUser")
    public String addUser() {
        User user = new User();
        user.setName("a");
        user.setAge(18);
        user.setGender("男");
        user.setBirth("111");
        userMapper.addUser(user);
        return "add-ok";
    }

    @RequestMapping("/updateUser")
    public String updateUser() {
        User user = new User();
        user.setId(3);
        user.setName("b");
        userMapper.updateUser(user);
        return "update-ok";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser() {
        userMapper.deleteUser(3);
        return "delete-ok";
    }

}
