package com.chongli.blog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chongli.blog.dao.BlogDao;
import com.chongli.blog.dao.MessageDao;
import com.chongli.blog.entity.CleanBlog;
import com.chongli.blog.entity.LeaveWord;

/**
 * Index控制器
 * @author lichongli
 * @date 2019.8.8
 */
@Controller
@RequestMapping
public class Index {

    // blog表操作类
    @Autowired
    private BlogDao blogDao;

    // Message表操作类
    @Autowired
    private MessageDao messageDao;

    /**
     * 首页展现所有博客列表以及留言列表
     * @param map
     * @return
     */
    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        List<CleanBlog> blogs = blogDao.getAll();
        List<LeaveWord> messages = messageDao.getAll();

        map.put("blogs", blogs);
        map.put("messages", messages);
        return "index";
    }
    
    /**
     * 首页跳转
     * @param map
     * @return
     */
    @RequestMapping("/")
    public String index0(Map<String, Object> map) {
        return index(map);
    }

}
