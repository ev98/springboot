package ev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate template;

    @RequestMapping("/userList")
    public List<Map<String, Object>> userList() {
        String sql = "select * from user";
        List<Map<String, Object>> maps = template.queryForList(sql);
        return maps;
    }

    @RequestMapping("/addUser")
    public String addUser() {
        String sql = "insert into user(name,age,gender,birth) values ('a',19,'女','111')";
        template.update(sql);
        return "update-ok";
    }

    @RequestMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id) {
        String sql = "update user set name=?,age=? where id=" + id;
        Object[] objects = new Object[2];
        objects[0] = "b";
        objects[1] = "1";
        template.update(sql, objects);
        return "update-ok";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        String sql = "delete from user where id=" + id;
        template.update(sql);
        return "delete-ok";
    }

}
