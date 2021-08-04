package com.wwh.itoken.service.sso.mapper;

import com.wwh.itoken.common.domain.TbSysUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

@Repository
public interface TbSysUserMapper extends MyMapper<TbSysUser> {
}