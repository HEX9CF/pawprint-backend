package pawprint.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 动物实体类
 *
 * @author HEX9CF
 * @date 2023/11/04
 */
@Data
@NoArgsConstructor
public class Animal {
    private Integer id;
    private String name;
    private String category;
    private Integer age;
    private Integer gender;
    private String appearance;
    private String location;
    private String health;
    private String diet;
    private String description;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
