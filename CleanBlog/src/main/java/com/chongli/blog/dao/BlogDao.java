package com.chongli.blog.dao;

import java.util.List;

import com.chongli.blog.entity.CleanBlog;

/**
 * Blog表操作接口
 * @author luoxn28
 * @date 2016.6.18
 */
public interface BlogDao {

    public int insert(CleanBlog blog);

    public int update(CleanBlog blog);

    public int delete(int id);

    /*博客详情*/
    public CleanBlog getById(int id);

    public CleanBlog getByTitle(String title);

    /*根据种类查找博客*/
    public List<CleanBlog> getByCategory(String category);

    /*查找所有博客*/
    public List<CleanBlog> getAll();
}
