/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : clean_blog

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2019-08-08 21:50:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `text` text,
  `preview` varchar(128) DEFAULT NULL,
  `author` varchar(32) DEFAULT NULL,
  `category` varchar(32) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT '2019-08-08 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', 'Python学习笔记', 'Java IO、集合、多线程、框架', 'Python笔记', '李重黎', 'Python', '2019-08-20 00:05:20');
INSERT INTO `blog` VALUES ('2', 'C++学习笔记', 'C++ IO、STL、多线程、网络', 'C++笔记', '李重黎', 'C++', '2019-08-20 00:05:20');
INSERT INTO `blog` VALUES ('3', 'Java学习笔记', 'Java IO、集合、多线程、框架', 'Java笔记', '李重黎', 'Java', '2019-08-20 00:05:20');
INSERT INTO `blog` VALUES ('4', 'SSM整合', 'Spring/SpringMVC/MyBaits', 'SSM整合', '李重黎', 'Java', '2019-08-20 00:05:20');
INSERT INTO `blog` VALUES ('5', 'hgoej', '<p>写博客测试</p>', 'gawegfo', 'gwefo', 'Java', '2019-08-08 21:11:29');
INSERT INTO `blog` VALUES ('6', '测试写博客', '<p><img src=\"/ueditor/jsp/upload/image/20190808/1565270324282089970.png\" title=\"1565270324282089970.png\" alt=\"19_3_3.png\"/></p><p>测试</p>', '测试', '李重黎', '生活', '2019-08-08 21:18:55');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author` varchar(32) DEFAULT NULL,
  `content` text,
  `date` timestamp NOT NULL DEFAULT '2018-08-08 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', 'chongli', '留言测试', '2019-08-08 18:50:01');
INSERT INTO `message` VALUES ('3', 'lichongli', '今天测试', '2019-08-08 20:13:48');
