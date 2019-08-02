DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`   INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32)      DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `website_search_suggest_keywords`;
CREATE TABLE `website_search_suggest_keywords` (
  `pkid`                VARCHAR(100) NOT NULL,
  `search_field`        VARCHAR(255)      DEFAULT NULL,
  `generation_strategy` VARCHAR(255)      DEFAULT NULL,
  `orderlevel`          INT(11)           DEFAULT NULL,
  `heat`                INT(11)           DEFAULT '0',
  `count`               INT(11)           DEFAULT '0',
  `create_time`         TIMESTAMP    NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time`         TIMESTAMP    NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pkid`),
  KEY `create_time` (`create_time`),
  KEY `update_time` (`update_time`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;