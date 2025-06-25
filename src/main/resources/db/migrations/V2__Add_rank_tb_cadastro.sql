-- V2:  Migrations  para adicionar a coluna de rank

ALTER TABLE tb_ninjas
ADD COLUMN rank VARCHAR(255);