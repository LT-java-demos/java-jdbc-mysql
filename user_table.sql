/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : localhost
 Source Database       : jdbcdemo

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : utf-8

 Date: 09/30/2016 16:30:08 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user_table`
-- ----------------------------
DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(10) DEFAULT NULL,
  `username` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Records of `user_table`
-- ----------------------------
BEGIN;
INSERT INTO `user_table` VALUES ('51', '2', '更新', '女', '10', '2000-12-25', '110@qq.com', '11111111111'), ('53', '1', '新1', '男', '22', '2007-12-25', '123@qq.com', '18829078216'), ('55', '2', '更新', '女', '10', '2000-12-25', '110@qq.com', '11111111111'), ('56', '1', '新1', '男', '22', '2007-12-25', '123@qq.com', '18829078216');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
