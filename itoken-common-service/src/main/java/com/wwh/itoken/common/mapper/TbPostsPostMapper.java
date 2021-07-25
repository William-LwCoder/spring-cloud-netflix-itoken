package com.wwh.itoken.common.mapper;

import com.wwh.itoken.common.domain.TbPostsPost;
import com.wwh.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbPostsPostMapper extends MyMapper<TbPostsPost> {
}