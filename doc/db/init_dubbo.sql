#
# 余杰 create by 2020/11/19

CREATE database if NOT EXISTS `dubbo` default character set utf8mb4 collate utf8mb4_unicode_ci;
use `dubbo`;

SET NAMES utf8mb4;

CREATE TABLE `t_sys_org` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) COMMENT '父机构主键ID',
  `name` varchar(64) DEFAULT NULL COMMENT '机构名',
  `code` varchar(32) DEFAULT NULL COMMENT '机构编号',
  `address` varchar(255) DEFAULT NULL COMMENT '机构地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT NULL COMMENT '姓名',
  `org_id` int(11) DEFAULT NULL COMMENT '机构id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `tel` varchar(16) DEFAULT NULL COMMENT '联系方式',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;