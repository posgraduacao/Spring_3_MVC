USE posup;

SET SQL_SAFE_UPDATES = 0;


DELETE FROM posup.USUARIO;
-- USUÁRIOS
-- Senha em SHA1
-- 123456 -> 7c4a8d09ca3762af61e59520943dc26494f8941b
INSERT INTO posup.USUARIO 
	(codigo, nome, email, senha, status, accessRules) 
VALUES 
(1, 'Thomas Mazon', 'thomas.mazon@gmail.com', '7c4a8d09ca3762af61e59520943dc26494f8941b', 'ATIVA', 'ROLE_SYS_ADMIN');

