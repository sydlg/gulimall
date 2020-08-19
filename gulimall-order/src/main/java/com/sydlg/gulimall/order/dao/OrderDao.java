package com.sydlg.gulimall.order.dao;

import com.sydlg.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 19:58:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
