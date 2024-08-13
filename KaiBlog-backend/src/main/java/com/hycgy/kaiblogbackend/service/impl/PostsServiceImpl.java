package com.hycgy.kaiblogbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hycgy.kaiblogbackend.domain.Posts;
import com.hycgy.kaiblogbackend.service.PostsService;
import com.hycgy.kaiblogbackend.mapper.PostsMapper;
import org.springframework.stereotype.Service;

/**
* @author 21961
* @description 针对表【posts】的数据库操作Service实现
* @createDate 2024-08-10 14:13:04
*/
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts>
    implements PostsService{

}




