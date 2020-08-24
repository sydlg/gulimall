package com.sydlg.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sydlg.common.utils.PageUtils;
import com.sydlg.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 16:17:35
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    List<CategoryEntity> listWithTree();
}

