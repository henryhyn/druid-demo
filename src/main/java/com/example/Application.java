package com.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dao.entity.WebsiteSearchSuggestKeyword;
import com.example.dao.mapper.UserMapper;
import com.example.dao.mapper.WebsiteSearchSuggestKeywordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by henry on 2019/8/1.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private WebsiteSearchSuggestKeywordMapper websiteSearchSuggestKeywordMapper;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("======> User:");
        userMapper.selectList(null).forEach(System.out::println);

        System.out.println("======> Keyword:");
        websiteSearchSuggestKeywordMapper.selectList(null).forEach(System.out::println);

        System.out.println("======> Keyword One:");
        QueryWrapper<WebsiteSearchSuggestKeyword> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(WebsiteSearchSuggestKeyword::getPkid, "xxx2");
        System.out.println(websiteSearchSuggestKeywordMapper.selectOne(wrapper));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
