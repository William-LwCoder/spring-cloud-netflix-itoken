package com.wwh.itoken.service.admin.service.impl;

import com.wwh.itoken.common.domain.TbSysUser;
import com.wwh.itoken.common.mapper.TbSysUserMapper;
import com.wwh.itoken.common.service.impl.BaseServiceImpl;
import com.wwh.itoken.service.admin.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseServiceImpl<TbSysUser, TbSysUserMapper> implements AdminService {

}
