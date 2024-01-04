package pawprint.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pawprint.pojo.User;

/**
 * 用户服务层接口
 *
 * @date 2024/01/04
 */
public interface UserService extends IService<User> {
    User login(User user);
}