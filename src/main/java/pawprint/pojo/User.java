
package pawprint.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 用户实体类
 *
 * @date 2024/01/04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;         // 用户id
    private String username;    // 用户名
    private String password;    // 密码
    private String email;       // 邮箱
    private String phone;       // 手机号
    private LocalDateTime createTime;   // 创建时间
    private LocalDateTime updateTime;   // 修改时间
    private Integer ban;        // 封禁状态
    private Integer admin;      // 管理员
}
