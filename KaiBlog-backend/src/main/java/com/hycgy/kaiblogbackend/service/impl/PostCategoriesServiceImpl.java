package com.hycgy.kaiblogbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hycgy.kaiblogbackend.domain.PostCategories;
import com.hycgy.kaiblogbackend.service.PostCategoriesService;
import com.hycgy.kaiblogbackend.mapper.PostCategoriesMapper;
import org.springframework.stereotype.Service;

/**
* @author 21961
* @description 针对表【post_categories】的数据库操作Service实现
* @createDate 2024-08-10 14:13:04
*/
@Service
public class PostCategoriesServiceImpl extends ServiceImpl<PostCategoriesMapper, PostCategories>
    implements PostCategoriesService{

}




