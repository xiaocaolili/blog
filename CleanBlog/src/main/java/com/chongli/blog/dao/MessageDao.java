package com.chongli.blog.dao;

import java.util.List;

import com.chongli.blog.entity.LeaveWord;

/**
 * Message表操作接口
 * @author luoxn28
 * @date 2016.6.19
 */
public interface MessageDao {

    public int insert(LeaveWord message);

//    public int update(Message message);
//
//    public int delete(int id);
//
//    public Message getById(int id);
//
//    public Message getByAuthor(String author);

    public List<LeaveWord> getAll();
}
