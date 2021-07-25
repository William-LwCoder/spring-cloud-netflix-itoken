package com.wwh.itoken.common.hystrix;

import com.wwh.itoken.common.constants.HttpStatusConstants;
import com.wwh.itoken.common.dto.BaseResult;
import com.wwh.itoken.common.utils.MapperUtils;
import com.google.common.collect.Lists;

/**
 * 通用的熔断方法
 * <p>Title: Fallback</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2021/7/8 10:57
 */
public class Fallback {
    /**
     * 502
     * @return
     */
    public static String badGateway() {
        BaseResult baseResult = BaseResult.notOk(Lists.newArrayList(
                new BaseResult.Error(
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                        HttpStatusConstants.BAD_GATEWAY.getContent())));
        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
