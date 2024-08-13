package com.hycgy.kaiblogbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hycgy.kaiblogbackend.domain.Users;
import com.hycgy.kaiblogbackend.service.UsersService;
import com.hycgy.kaiblogbackend.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 21961
* @description 针对表【users】的数据库操作Service实现
* @createDate 2024-08-10 14:13:04
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




