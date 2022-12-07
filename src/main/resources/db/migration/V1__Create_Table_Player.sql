CREATE TABLE IF NOT EXISTS `players`(
                                      `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                      `name` varchar(255) NOT NULL,
                                      `email` timestamp NOT NULL,
                                      `telefone` bigint(11) DEFAULT NULL,
                                      `codinome` timestamp DEFAULT NULL,
                                      `grupo` timestamp DEFAULT NULL,
                                      PRIMARY KEY (`id`)
) ENGINE=InnoDB;