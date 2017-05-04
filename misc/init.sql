-- 导出 castest 的数据库结构
CREATE DATABASE IF NOT EXISTS `castest`;
USE `castest`;

-- 导出  表 castest.t_admin_user 结构
CREATE TABLE IF NOT EXISTS `t_admin_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `login_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_name` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  castest.t_admin_user 的数据：~2 rows (大约)
INSERT INTO `t_admin_user` (`id`, `email`, `login_name`, `name`, `password`) VALUES
	(1, 'aaa@h3c.com', 'aaa', 'aaa_alias', '$2a$10$8d9kidPNvB4Q3Y5VnKbmMOUH4JjFbMjkNGEt0ul0/uCwWBNkm3r5y'),
	(2, 'bbb@h3c.com', 'bbb', 'bbb_alias', '$2a$10$ZGRNjta13VfqfVBAfAbC2eZFPexy1/n8fswtmxZUJ2X64Pe8DprWy'),
	(3, 'ccc@h3c.com', 'ccc', 'ccc_alias', '$2a$10$BuoMhhNoEWaEipu9E3hm0e8RdLkpcDwdC8KTnLkPu2Bwwh./tNgNi'),
	(4, 'ddd@h3c.com', 'ddd', 'ddd_alias', '$2a$10$HTXcOXm9uynlJDTlTqKuPeq6.VBR9Nq5BlHuwVyq8ginos7XlRGUa'),
	(5, 'eee@h3c.com', 'eee', 'eee_alias', '$2a$10$Oi/MHXZlycYQVAQTxHSSSuQpuCRio7Dc9cJriuz4b7i59srjuPuLW');


-- 导出  表 castest.userinfo 结构
CREATE TABLE IF NOT EXISTS `userinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `login_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `roles` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_name` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  castest.userinfo 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` (`id`, `email`, `login_name`, `roles`, `description`) VALUES
	(1, 'hello@hello.com', 'hello', 'role1,role2', 'hellohellohello'),
	(2, 'aaa@aaa.com', 'aaa', 'role2,role2', 'asdfasdfasf');
