CREATE TABLE topico (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensaje VARCHAR(800) NOT NULL,
    fechaCreacion DATETIME NOT NULL,
    status ENUM('ACTIVO', 'CERRADO') NOT NULL,
    autor VARCHAR(50) NOT NULL,
    curso VARCHAR(20) NOT NULL,
    respuestas VARCHAR(800),

    PRIMARY KEY (id)
);