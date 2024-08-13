package com.hycgy.kaiblogbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hycgy.kaiblogbackend.domain.PostTags;
import com.hycgy.kaiblogbackend.service.PostTagsService;
import com.hycgy.kaiblogbackend.mapper.PostTagsMapper;
import org.springframework.stereotype.Service;

/**
* @author 21961
* @description 针对表【post_tags】的数据库操作Service实现
* @createDate 2024-08-10 14:13:04
*/
@Service
public class PostTagsServiceImpl extends ServiceImpl<PostTagsMapper, PostTags>
    implements PostTagsService{

}




