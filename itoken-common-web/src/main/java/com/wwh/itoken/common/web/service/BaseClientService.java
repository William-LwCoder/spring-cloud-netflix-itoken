package com.wwh.itoken.common.web.service;

import com.wwh.itoken.common.hystrix.Fallback;

/**
 * 通用服务消费者接口
 * <p>Title: BaseClientService</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2021/8/4 13:56
 */
public interface BaseClientService {
    default String page(int pageNum, int pageSize, String domainJson) {
        return Fallback.badGateway();
    }
}
