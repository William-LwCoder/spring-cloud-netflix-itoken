package com.wwh.itoken.service.sso.service;

import com.wwh.itoken.common.domain.TbSysUser;

/**
 * 登录业务
 * <p>Title: LoginService</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2021/8/4 21:48
 */
public interface LoginService {

    /**
     * 登录
     * @param loginCode
     * @param plantPassword
     * @return
     */
    public TbSysUser login(String loginCode, String plantPassword);
}
