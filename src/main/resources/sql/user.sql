/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : depot

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-02-26 14:12:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '北京', '15');
INSERT INTO `user` VALUES ('2', '李四', '南京', '18');
INSERT INTO `user` VALUES ('3', '王五', '河南', '20');
