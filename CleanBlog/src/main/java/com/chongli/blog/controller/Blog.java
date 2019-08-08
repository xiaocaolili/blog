package com.chongli.blog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chongli.blog.dao.BlogDao;
import com.chongli.blog.entity.CleanBlog;


/**
 * Blog控制器
 * @author luoxn28
 * @date 2016.6.18
 */
@Controller
@RequestMapping
public class Blog {

    // blog 表操作类
    @Autowired
    private BlogDao blogDao = null;

    /**
     * 博客列表或博客点击详情
     * @param p
     * @param map
     * @return
     */
    @RequestMapping("/blog")
    public String handleRequest(@RequestParam(value="p")int p, Map<String, Object> map) {
        // 读取对应 blog(s)
        if (p == 0) {
        	/*查找所有博客*/
            List<CleanBlog> blogs = blogDao.getAll();
            		//blogDao.getAll();
            map.put("blogs", blogs);
            return "blogs";
        } else {
        	/*博客详情*/
        	CleanBlog blog = blogDao.getById(p);
            map.put("blog", blog);
            return "blog";
        }
    }

    /**
     * 根据博客种类查找博客
     * @param category
     * @param map
     * @return
     */
    @RequestMapping("/category")
    public String handleCategoryRequest(@RequestParam(value="category")String category, Map<String, Object> map) {
        // 根据种类查找数据库
        List<CleanBlog> blogs = blogDao.getByCategory(category);
        map.put("blogs", blogs);
        return "blogs";
    }
    
}

