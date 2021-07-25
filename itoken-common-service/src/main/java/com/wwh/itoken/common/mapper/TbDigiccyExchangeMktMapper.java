package com.wwh.itoken.common.mapper;

import com.wwh.itoken.common.domain.TbDigiccyExchangeMkt;
import com.wwh.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbDigiccyExchangeMktMapper extends MyMapper<TbDigiccyExchangeMkt> {
}