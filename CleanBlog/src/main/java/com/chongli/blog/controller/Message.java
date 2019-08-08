package com.chongli.blog.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
 * Message控制器，留言板功能
 * @author lichongli
 * @date 2019.8.8
 */
@Controller
@RequestMapping("/message")
public class Message {

    // blog表操作类
    @Autowired
    private BlogDao blogDao;

    // Message表操作类
    @Autowired
    private MessageDao messageDao;

    /**
     * 留言并返回首页
     * @param message
     * @param map
     * @return
     */
    @RequestMapping
    public String index(LeaveWord message, Map<String, Object> map) {
        //System.out.println(message);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());

        message.setDate(date);
        messageDao.insert(message);

        List<CleanBlog> blogs = blogDao.getAll();
        List<LeaveWord> messages = messageDao.getAll();

        map.put("blogs", blogs);
        map.put("messages", messages);
        return "index";
    }
}
