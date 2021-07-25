package com.wwh.itoken.common.mapper;

import com.wwh.itoken.common.domain.TbDigiccyExchange;
import com.wwh.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbDigiccyExchangeMapper extends MyMapper<TbDigiccyExchange> {
}