CREATE TABLE `topackage` (
  `id` varchar(20) NOT NULL ,
  `recipient` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `weight` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;