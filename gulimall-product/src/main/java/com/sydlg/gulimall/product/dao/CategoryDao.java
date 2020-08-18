package com.sydlg.gulimall.product.dao;

import com.sydlg.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 00:35:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
