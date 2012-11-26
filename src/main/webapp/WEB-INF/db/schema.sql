CREATE TABLE `ctp`.`user` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `login` TEXT  NOT NULL,
  `password` TEXT  NOT NULL,
  `email` TEXT  NOT NULL,
  `roleid` INT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`role` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `name` TEXT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`teststate` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `value` TEXT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`testresult` (
  `id` INTEGER  NOT NULL AUTO_INCREMENT,
  `testid` INTEGER  NOT NULL,
  `stateid` INTEGER  NOT NULL,
  `userid` INTEGER  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`test` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `themeid` INT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`testtheme` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `name` TEXT  NOT NULL,
  `sectionid` INT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;


CREATE TABLE `ctp`.`testsection` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `name` TEXT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`quastion` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `value` TEXT  NOT NULL,
  `testid` INT  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

CREATE TABLE `ctp`.`answer` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `value` TEXT  NOT NULL,
  `quastionid` INT  NOT NULL,
  `state` BOOLEAN  NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;

ALTER TABLE `ctp`.`user` ADD CONSTRAINT `ru` FOREIGN KEY `ru` (`roleid`)
    REFERENCES `role` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `ctp`.`testtheme` ADD CONSTRAINT `st` FOREIGN KEY `st` (`sectionid`)
    REFERENCES `testsection` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `ctp`.`answer` ADD CONSTRAINT `aq` FOREIGN KEY `aq` (`quastionid`)
    REFERENCES `quastion` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `ctp`.`test` ADD CONSTRAINT `tth` FOREIGN KEY `tth` (`themeid`)
    REFERENCES `testtheme` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `ctp`.`testresult` ADD CONSTRAINT `tru` FOREIGN KEY `tru` (`userid`)
    REFERENCES `user` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `ctp`.`testresult` ADD CONSTRAINT `rs` FOREIGN KEY `rs` (`stateid`)
    REFERENCES `teststate` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

insert into `role` set `name`='admin';
insert into `role` set `name`='head';
insert into `role` set `name`='user';