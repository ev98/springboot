package ev.mapper;

import ev.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //表示这是一个mybatis的mapper类
@Repository   //可有可无，可以消报错
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);


}
