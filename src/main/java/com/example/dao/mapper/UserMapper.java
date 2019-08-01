package com.example.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by henry on 2019/8/1.
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
