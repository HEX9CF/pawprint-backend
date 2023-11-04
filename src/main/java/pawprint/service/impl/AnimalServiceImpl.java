package pawprint.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawprint.mapper.AnimalMapper;
import pawprint.pojo.Animal;
import pawprint.service.AnimalService;

/**
 * 动物服务impl
 *
 * @author HEX9CF
 * @date 2023/11/04
 */
@Service
public class AnimalServiceImpl extends ServiceImpl<AnimalMapper, Animal> implements AnimalService {
    @Autowired
    AnimalMapper animalMapper;

    @Override
    public Boolean insert(Animal animal) {
        return animalMapper.insert(animal) > 0;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return animalMapper.deleteById(id) > 0;
    }

    @Override
    public Boolean update(Animal animal) {
        return animalMapper.updateById(animal) > 0;
    }

    @Override
    public Animal selectById(Integer id) {
        return animalMapper.selectById(id);
    }
}
