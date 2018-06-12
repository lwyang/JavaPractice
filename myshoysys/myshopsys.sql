/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50600
Source Host           : localhost:3306
Source Database       : myshopsys

Target Server Type    : MYSQL
Target Server Version : 50600
File Encoding         : 65001

Date: 2018-06-11 23:04:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` int(255) NOT NULL,
  `goods_name` varchar(255) NOT NULL,
  `goods_price` double(10,2) NOT NULL,
  `goods_type` varchar(255) NOT NULL,
  `goods_number` int(10) NOT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '薯片', '3.00', '零食', '1000');
INSERT INTO `goods` VALUES ('2', '足球', '50.00', '体育用品', '20');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('admin', 'admin');
INSERT INTO `login` VALUES ('root', 'root');

-- ----------------------------
-- Table structure for shop_type
-- ----------------------------
DROP TABLE IF EXISTS `shop_type`;
CREATE TABLE `shop_type` (
  `type_id` int(255) NOT NULL,
  `type_name` varchar(255) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop_type
-- ----------------------------
INSERT INTO `shop_type` VALUES ('2', '零食');
INSERT INTO `shop_type` VALUES ('3', '体育用品');
