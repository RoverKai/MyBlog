package com.hycgy.kaiblogbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hycgy.kaiblogbackend.domain.Categories;
import com.hycgy.kaiblogbackend.service.CategoriesService;
import com.hycgy.kaiblogbackend.mapper.CategoriesMapper;
import org.springframework.stereotype.Service;

/**
* @author 21961
* @description 针对表【categories】的数据库操作Service实现
* @createDate 2024-08-10 14:13:04
*/
@Service
public class CategoriesServiceImpl extends ServiceImpl<CategoriesMapper, Categories>
    implements CategoriesService {

}




