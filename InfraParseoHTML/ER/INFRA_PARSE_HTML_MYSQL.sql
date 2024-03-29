CREATE TABLE IP_CONF_TABLAS_HTML_PARSEAR (
       ID_TABLA INTEGER NOT NULL
     , NOMBRE_TABLA VARCHAR(100) NOT NULL
     , FORMATO_TABLA CHAR(1) NOT NULL
     , OBJETO_REGRESAR VARCHAR(500) NOT NULL
     , PRIMARY KEY (ID_TABLA)
)
engine=InnoDB
;

CREATE TABLE IP_CONF_PROPIEDADES_TABLA (
       ID_TABLA INTEGER NOT NULL
     , ID_PROPIEDAD_TABLA INTEGER NOT NULL
     , NOMBRE_PROPIEDAD VARCHAR(100) NOT NULL
     , CLASE_HTML VARCHAR(100)
     , NOMBRE_PROPIEDAD_OBJETO VARCHAR(100) NOT NULL
     , TIPO_DATO CHAR(1)
     , PRIMARY KEY (ID_TABLA, ID_PROPIEDAD_TABLA)
     , CONSTRAINT FK_PROPIEDADES_1 FOREIGN KEY (ID_TABLA)
                  REFERENCES IP_CONF_TABLAS_HTML_PARSEAR (ID_TABLA)ON DELETE CASCADE ON UPDATE CASCADE
)
engine=InnoDB
;