package com.sydlg.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sydlg.gulimall.product.entity.CategoryEntity;
import com.sydlg.gulimall.product.service.CategoryService;
import com.sydlg.common.utils.PageUtils;
import com.sydlg.common.utils.R;



/**
 * 商品三级分类
 *
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 16:17:35
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list/tree")
    public R list(@RequestParam Map<String, Object> params){
        
        List<CategoryEntity> entities = categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }
    
    /**
     * 批量修改
     */
    @RequestMapping("/update/sort")
    public R updateSort(@RequestBody CategoryEntity[] category){
        categoryService.updateBatchById(Arrays.asList(category));
        
        return R.ok();
    }
    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        // 通过id删除
//		categoryService.removeByIds(Arrays.asList(catIds));
        // 批量删除
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
