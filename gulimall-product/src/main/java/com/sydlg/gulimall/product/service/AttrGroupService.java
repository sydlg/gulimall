package com.sydlg.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sydlg.common.utils.PageUtils;
import com.sydlg.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 00:35:01
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

