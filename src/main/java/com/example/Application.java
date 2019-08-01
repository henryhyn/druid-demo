package com.example;

import com.example.dao.mapper.UserMapper;
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

    @Override
    public void run(String... args) throws Exception {
        userMapper.selectList(null).forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
