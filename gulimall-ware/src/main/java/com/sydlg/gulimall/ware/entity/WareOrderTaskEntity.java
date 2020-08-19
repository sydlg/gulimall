package com.sydlg.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存工作单
 * 
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 20:06:56
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long orderId;
	/**
	 * $column.comments
	 */
	private String orderSn;
	/**
	 * $column.comments
	 */
	private String consignee;
	/**
	 * $column.comments
	 */
	private String consigneeTel;
	/**
	 * $column.comments
	 */
	private String deliveryAddress;
	/**
	 * $column.comments
	 */
	private String orderComment;
	/**
	 * $column.comments
	 */
	private Integer paymentWay;
	/**
	 * $column.comments
	 */
	private Integer taskStatus;
	/**
	 * $column.comments
	 */
	private String orderBody;
	/**
	 * $column.comments
	 */
	private String trackingNo;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Long wareId;
	/**
	 * $column.comments
	 */
	private String taskComment;

}
