
-- springbootdb.actores definition

CREATE TABLE `actores` (
  `id_actores` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_actores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- springbootdb.peliculas definition

CREATE TABLE `peliculas` (
  `id_peliculas` bigint(20) NOT NULL AUTO_INCREMENT,
  `director` varchar(255) DEFAULT NULL,
  `fecha_estreno` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_peliculas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- springbootdb.reparto definition

CREATE TABLE `reparto` (
  `id_peliculas` bigint(20) NOT NULL,
  `id_actores` bigint(20) NOT NULL,
  KEY `FKus59fp4hxyyk3ivdax7vhu3x` (`id_actores`),
  KEY `FKqoa70ad5ablrc4ktuupo8u7ta` (`id_peliculas`),
  CONSTRAINT `FKqoa70ad5ablrc4ktuupo8u7ta` FOREIGN KEY (`id_peliculas`) REFERENCES `peliculas` (`id_peliculas`),
  CONSTRAINT `FKus59fp4hxyyk3ivdax7vhu3x` FOREIGN KEY (`id_actores`) REFERENCES `actores` (`id_actores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO springbootdb.peliculas (director, fecha_estreno, nombre, pais) VALUES ('Nolan','2014-07-07', 'Interstellar', 'Inglaterra');
INSERT INTO springbootdb.peliculas (director, fecha_estreno, nombre, pais) VALUES ('Joe Dante', '1984-07-07', 'Gremlins', 'Estados Unidos');
INSERT INTO springbootdb.peliculas (director, fecha_estreno, nombre, pais) VALUES ('Blonkap', '2009-07-07', 'Sector 9', 'Africa');
INSERT INTO springbootdb.peliculas (director, fecha_estreno, nombre, pais) VALUES ('Pigozzi', '1985-05-07', 'Esperando la carroza', 'Argentina');
INSERT INTO springbootdb.peliculas (director, fecha_estreno, nombre, pais) VALUES ('Rugna', '2019-05-07', 'Aterrados', 'Argentina');
INSERT INTO springbootdb.peliculas (director, fecha_estreno, nombre, pais) VALUES ('Kubrik', '1968-05-07', '2001 odisea', 'Estados Unidos')

INSERT INTO springbootdb.actores(apellido, nombre) VALUES ('Kilmer', 'Val');
INSERT INTO springbootdb.actores(apellido, nombre) VALUES ('Black', 'jack');
INSERT INTO springbootdb.actores(apellido, nombre) VALUES ('Teron', 'Charlize');
INSERT INTO springbootdb.actores(apellido, nombre) VALUES ('Caine', 'Michael');
INSERT INTO springbootdb.actores(apellido, nombre) VALUES ('Patrik', 'Stewart');
INSERT INTO springbootdb.actores(apellido, nombre) VALUES ('Jack', 'Nicholson');


INSERT INTO springbootdb.reparto (id_peliculas, id_actores) VALUES (1, 4);
INSERT INTO springbootdb.reparto (id_peliculas, id_actores) VALUES (1, 1);
INSERT INTO springbootdb.reparto (id_peliculas, id_actores) VALUES (2, 5);
INSERT INTO springbootdb.reparto (id_peliculas, id_actores) VALUES (2, 3);
INSERT INTO springbootdb.reparto (id_peliculas, id_actores) VALUES (4, 2);
INSERT INTO springbootdb.reparto (id_peliculas, id_actores) VALUES (6, 6);




