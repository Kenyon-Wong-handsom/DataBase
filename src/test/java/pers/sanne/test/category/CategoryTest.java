package pers.sanne.test.category;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pers.sanne.domain.Category;
import pers.sanne.service.CategoryService;
import pers.sanne.test.MapperTest;

/**
 * @BelongsProject:DataBase
 * @BelongsPackage:pers.sanne.test.user
 * @ClassName:CategoryTest
 * @Author: Kenyon Wong
 * @CreateTime: 2020-04-23 10:56
 * @Description
 */
public class CategoryTest extends MapperTest {

    @Autowired
    CategoryService categoryService;

    @Test
    public void testAddCategory() {
        Category category = new Category();
        category.setUserId(2);
        category.setClassName("约炮");
        int result = categoryService.addCategory(category);
        // 断言
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetCategory() {
        Category category = new Category();
        Category category1 = categoryService.getCategory(1);
        System.out.println(category1);
    }

    @Test
    public void UpdateCategory() {
        Category category = new Category();
        category.setId(1);
        category.setUserId(1);
        category.setClassName("打飞机");
        int category1 = categoryService.updateCategory(category);
    }
    @Test
    public void testDeleteUser() {

        int result = categoryService.deleteCategory(3);
    }


}
