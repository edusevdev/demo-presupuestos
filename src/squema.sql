CREATE SCHEMA EMPRESA;
USE EMPRESA;

-- USUARIO
CREATE TABLE IF NOT EXISTS USUARIO(
	ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	NOMBRE VARCHAR(30) NOT NULL,
    CONTRASENA VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL,
    EMAIL_RESPONSABLE VARCHAR(100)
);

INSERT INTO USUARIO(NOMBRE, CONTRASENA, EMAIL) VALUES ('admin', 'admin', 'admin@gmail.com');