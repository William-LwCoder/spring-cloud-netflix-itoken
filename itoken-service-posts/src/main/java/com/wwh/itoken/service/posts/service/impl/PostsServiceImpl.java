package com.wwh.itoken.service.posts.service.impl;

import com.wwh.itoken.common.domain.TbPostsPost;
import com.wwh.itoken.common.mapper.TbPostsPostMapper;
import com.wwh.itoken.common.service.impl.BaseServiceImpl;
import com.wwh.itoken.service.posts.service.PostsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostsServiceImpl extends BaseServiceImpl<TbPostsPost, TbPostsPostMapper> implements PostsService {
}
