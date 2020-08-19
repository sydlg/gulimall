package com.sydlg.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sydlg.common.utils.PageUtils;
import com.sydlg.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 20:06:56
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

