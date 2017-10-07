/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : bookshop

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-05 19:38:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `s_book`
-- ----------------------------
DROP TABLE IF EXISTS `s_book`;
CREATE TABLE `s_book` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BOOKNAME` varchar(255) DEFAULT NULL,
  `PRICE` int(11) DEFAULT NULL,
  `STOCK` int(11) DEFAULT NULL,
  `BOOKTYPE` int(11) DEFAULT NULL,
  `IMG` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKhrsuinc1buc462a1oeioie2q4` (`BOOKTYPE`),
  CONSTRAINT `FKhrsuinc1buc462a1oeioie2q4` FOREIGN KEY (`BOOKTYPE`) REFERENCES `s_booktype` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_book
-- ----------------------------
INSERT INTO `s_book` VALUES ('1', '流浪', '111', '222', '1', '900520170105192305.jpg');
INSERT INTO `s_book` VALUES ('2', 'javaweb编程基础', '99', '11', '2', '1.jpg');
INSERT INTO `s_book` VALUES ('3', '编程思想', '77', '10', '2', '2.jpg');
INSERT INTO `s_book` VALUES ('4', '长生界', '50', '1000', '3', '3.jpg');
INSERT INTO `s_book` VALUES ('5', '繁华的失落', '129', '1000', '1', '4.jpg');
INSERT INTO `s_book` VALUES ('6', '科学探索', '200', '1', '4', '5.jpg');
INSERT INTO `s_book` VALUES ('7', '动物世界图册', '300', '5', '5', '6.jpg');
INSERT INTO `s_book` VALUES ('8', '农业大发展', '199', '300', '6', '.jpg');
INSERT INTO `s_book` VALUES ('9', 'hadoop编程指南', '99', '1000', '2', '7.jpg');

-- ----------------------------
-- Table structure for `s_booktype`
-- ----------------------------
DROP TABLE IF EXISTS `s_booktype`;
CREATE TABLE `s_booktype` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BOOKTYPE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_booktype
-- ----------------------------
INSERT INTO `s_booktype` VALUES ('1', '文学');
INSERT INTO `s_booktype` VALUES ('2', '计算机编程');
INSERT INTO `s_booktype` VALUES ('3', '网络文学');
INSERT INTO `s_booktype` VALUES ('4', '科技');
INSERT INTO `s_booktype` VALUES ('5', '动物科技');
INSERT INTO `s_booktype` VALUES ('6', '农学');

-- ----------------------------
-- Table structure for `s_order`
-- ----------------------------
DROP TABLE IF EXISTS `s_order`;
CREATE TABLE `s_order` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER` int(11) DEFAULT NULL,
  `BOOK` int(11) DEFAULT NULL,
  `PHONE` varchar(255) DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `ZHUANGTAI` varchar(255) DEFAULT NULL,
  `NUMBER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKqt17axvjnp25giwijrkk68c6q` (`USER`),
  KEY `FKdvnuejgnd3jm8u3bkqrwy16un` (`BOOK`),
  CONSTRAINT `FKdvnuejgnd3jm8u3bkqrwy16un` FOREIGN KEY (`BOOK`) REFERENCES `s_book` (`ID`),
  CONSTRAINT `FKqt17axvjnp25giwijrkk68c6q` FOREIGN KEY (`USER`) REFERENCES `s_user` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_order
-- ----------------------------
INSERT INTO `s_order` VALUES ('1', '3', '1', '18562316865', '山东农业大学本部', null, '4');
INSERT INTO `s_order` VALUES ('2', '3', '2', '18562316865', '山东农业大学本部', null, '2');
INSERT INTO `s_order` VALUES ('3', '3', '3', '18562316865', '山东农业大学本部', null, '1');
INSERT INTO `s_order` VALUES ('4', '3', '6', '18562316865', '山东农业大学本部', null, '1');
INSERT INTO `s_order` VALUES ('5', '3', '7', '18562316865', '山东农业大学本部', null, '2');

-- ----------------------------
-- Table structure for `s_user`
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `QUESTION` varchar(255) DEFAULT NULL,
  `ANSWER` varchar(255) DEFAULT NULL,
  `QUANXIAN` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES ('1', '111', '111', '111', '111', '1');
INSERT INTO `s_user` VALUES ('2', 'admin', '111', '问题', '答案', '1');
INSERT INTO `s_user` VALUES ('3', '谢庆贺', '111', '我叫？', '谢庆贺', '1');
INSERT INTO `s_user` VALUES ('4', '王五', '123456', '我的qq号？', '1301817765', '0');
INSERT INTO `s_user` VALUES ('5', 'fanhua', 'qwertyu', '你好', '我不好', '0');
INSERT INTO `s_user` VALUES ('6', '大米', 'xiaomi', '雷军', '雷布斯', '0');
