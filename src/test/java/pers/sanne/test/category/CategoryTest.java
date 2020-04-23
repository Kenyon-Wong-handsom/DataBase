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
        category.setUserId(1);
        category.setClassName("吃饭");
        int result = categoryService.addCategory(category);
        // 断言
        Assert.assertEquals(1, result);
    }


}
