package pawprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pawprint.pojo.Animal;
import pawprint.pojo.Result;
import pawprint.service.AnimalService;

import java.util.List;

/**
 * 动物控制器
 *
 * @author HEX9CF
 * @date 2023/11/04
 */
@RestController
@RequestMapping("/api/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    /**
     * 获取全部
     *
     * @return {@link List}<{@link Animal}>
     */
    @GetMapping
    public Result getAll() {
        return Result.success("OK", animalService.list());
    }

    /**
     * 按id获取
     *
     * @param id id
     * @return {@link Result}
     */
    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        return Result.success("OK", animalService.getById(id));
    }

    /**
     * 添加
     *
     * @param animal 动物
     * @return {@link Result}
     */
    @PostMapping
    public Result add(@RequestBody Animal animal) {
        Boolean flag = animalService.insert(animal);
        if(flag) {
            return Result.success("添加成功喵(=^ェ^=)", null);
        }
        return Result.error("添加失败喵(=ＴェＴ=)", null);
    }

    /**
     * 修改
     *
     * @param animal 动物
     * @return {@link Result}
     */
    @PutMapping
    public Result modify(@RequestBody Animal animal) {
        Boolean flag = animalService.update(animal);
        if(flag) {
            return Result.success("修改成功喵(=^ェ^=)", null);
        }
        return Result.error("修改失败喵(=ＴェＴ=)", null);
    }

    /**
     * 删除
     *
     * @param id id
     * @return {@link Result}
     */
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {
        Boolean flag = animalService.deleteById(id);
        if(flag) {
            return Result.success("删除成功喵(=^ェ^=)", null);
        }
        return Result.error("删除失败喵(=ＴェＴ=)", null);
    }
}
