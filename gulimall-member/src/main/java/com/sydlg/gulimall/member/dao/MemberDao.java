package com.sydlg.gulimall.member.dao;

import com.sydlg.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenqi
 * @email qic19971225@gmail.com
 * @date 2020-08-19 19:45:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
