CREATE TABLE `user`
(
    `id`     bigint NOT NULL AUTO_INCREMENT,
    `name`   varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '姓名',
    `age`    int                                    DEFAULT NULL COMMENT '年龄',
    `gender` tinyint                                DEFAULT NULL COMMENT '性别 1:男;2:女',
    `weight` int                                    DEFAULT NULL COMMENT '体重 单位:克',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;