package com.sydlg.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sydlg.common.utils.PageUtils;
import com.sydlg.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 16:17:35
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

