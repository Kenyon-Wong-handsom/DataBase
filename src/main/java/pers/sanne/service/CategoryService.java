package pers.sanne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sanne.dao.CategoryMapper;
import pers.sanne.domain.Category;

/**
 * @BelongsProject:DataBase
 * @BelongsPackage:pers.sanne.service
 * @ClassName:CategoryService
 * @Author: Kenyon Wong
 * @CreateTime: 2020-04-23 10:43
 * @Description
 */
@Service
public class CategoryService {
    /**
     * 自动注入dao层user类
     */
    @Autowired
    CategoryMapper categoryMapper;

    public int addCategory(Category category) {
        return categoryMapper.addCategory(category);
    }
    public Category getCategory(int id) {
        return categoryMapper.getCategory(id);
    }

    public int updateCategory(Category category) {
        return categoryMapper.updateCategory(category);
    }
    public int deleteCategory(int id){
        return categoryMapper.deleteCategory(id);
    }

}
