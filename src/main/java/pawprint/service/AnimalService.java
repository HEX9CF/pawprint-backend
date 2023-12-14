package pawprint.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pawprint.pojo.Animal;
import java.util.List;

/**
 * 动物服务
 *
 * @date 2023/11/04
 */
public interface AnimalService extends IService<Animal> {
    Boolean insert(Animal animal);
    Boolean deleteById(Integer id);
    Boolean update(Animal animal);
    Animal selectById(Integer id);
    List<Animal> listByDesc();
}
