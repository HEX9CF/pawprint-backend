package pawprint.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pawprint.pojo.Animal;

@Mapper
public interface AnimalMapper extends BaseMapper<Animal> {
}
