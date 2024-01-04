package pawprint.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pawprint.pojo.Result;
import pawprint.pojo.User;
import pawprint.service.UserService;

/**
 * 用户登录控制器
 *
 * @date 2024/01/04
 */
@Slf4j
@RestController
@RequestMapping("/api/user/login")
public class UserLoginController {
    @Autowired
    UserService userService;

    /**
     * 登录
     *
     * @param user 使用者
     * @return {@link Result}
     */
    @PostMapping
    public Result login(@RequestBody User user) {
        // 验证必填项
        if(user.getUsername().isEmpty()) {
            return Result.error("登录失败，用户名不能为空", null);
        }
        if(user.getPassword().isEmpty()) {
            return Result.error("登录失败，密码不能为空", null);
        }

        // 登录校验
        user = userService.login(user);
        if(user == null) {
            return Result.error("登录失败，用户名或密码错误", null);
        }

        return Result.success("登录成功", null);
    }
}
