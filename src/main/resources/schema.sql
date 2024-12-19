CREATE TABLE IF NOT EXISTS TB_CAR (
    ID SERIAL PRIMARY KEY,
    MARCA VARCHAR(255),
    MODELO VARCHAR(255),
    VALOR DECIMAL(10,2),
    DATA_CRIACAO TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP
);