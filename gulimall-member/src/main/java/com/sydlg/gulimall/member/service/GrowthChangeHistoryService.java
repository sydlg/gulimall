package com.sydlg.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sydlg.common.utils.PageUtils;
import com.sydlg.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 19:45:48
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

