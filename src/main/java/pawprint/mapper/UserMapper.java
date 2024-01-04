package pawprint.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pawprint.pojo.User;

/**
 * 用户映射器
 *
 * @date 2024/01/04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
