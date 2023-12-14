package pawprint.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pawprint.pojo.Animal;

/**
 * 动物映射器
 *
 * @date 2023/11/04
 */
@Mapper
public interface AnimalMapper extends BaseMapper<Animal> {
}
