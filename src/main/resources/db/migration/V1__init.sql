
CREATE TABLE alunos (
  id integer(20) NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  surname varchar(40) NOT NULL,
  apelido varchar(40) DEFAULT "brak",
  email varchar(50)DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY id_surname_apelido (apelido, surname, id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



