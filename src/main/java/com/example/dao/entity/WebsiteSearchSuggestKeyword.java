package com.example.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Created by henry on 2019/8/2.
 */
@Data
@TableName("website_search_suggest_keywords")
public class WebsiteSearchSuggestKeyword {
    private String pkid;

    private Date createTime;

    private Date updateTime;
}
