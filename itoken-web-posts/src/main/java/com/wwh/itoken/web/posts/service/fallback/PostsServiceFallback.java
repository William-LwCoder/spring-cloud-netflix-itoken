package com.wwh.itoken.web.posts.service.fallback;

import com.wwh.itoken.common.hystrix.Fallback;
import com.wwh.itoken.web.posts.service.PostsService;
import org.springframework.stereotype.Component;

@Component
public class PostsServiceFallback implements PostsService {
    @Override
    public String page(int pageNum, int pageSize, String tbPostsPostJson) {
        return Fallback.badGateway();
    }

    @Override
    public String get(String postGuid) {
        return null;
    }

    @Override
    public String save(String tbPostsPostJson, String optsBy) {
        return Fallback.badGateway();
    }
}
