package pers.sanne.dao;


import org.springframework.stereotype.Repository;
import pers.sanne.domain.Category;

@Repository
public interface CategoryMapper {
    /**
        测试账目分类表
     */
    public Category getCategory(int id); // 查询
    public int addCategory(Category category);//添加
    public int deleteCategory(int id); // 删除
    public int updateCategory(Category category); // 修改

}