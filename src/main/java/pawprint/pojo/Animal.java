package pawprint.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 动物实体类
 *
 * @date 2023/11/04
 */
@Data
@NoArgsConstructor
public class Animal {
    private Integer id;     // ID
    private String name;        // 名字
    private String species;    // 物种
    private Integer age;        // 年龄
    private Integer gender;     // 性别
    private String appearance;  // 外观
    private String location;    // 出现地点
    private String health;      // 健康状况
    private String diet;        // 饮食状况
    private String description; // 介绍
    private String avatar;    // 头像
    private LocalDateTime createTime;   // 创建时间
    private LocalDateTime updateTime;   // 更新时间
}
