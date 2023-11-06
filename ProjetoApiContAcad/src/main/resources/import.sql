INSERT INTO tb_professor (nome, cargo, data_de_nascimento, usuario, senha) VALUES ('João', 'Professor', '21/09/1990', 'joao', 'joao123');
INSERT INTO tb_professor (nome, cargo, data_de_nascimento, usuario, senha) VALUES ('Maria', 'Coordenador', '21/03/1993', 'maria', 'maria123');
INSERT INTO tb_professor (nome, cargo, data_de_nascimento, usuario, senha) VALUES ('Carlos', 'Professor', '21/05/1985', 'carlos', 'carlos123');

INSERT INTO tb_aluno (nome, dataNascimento, periodo, usuario, senha) VALUES ('Afonso', '01/12/2000', '4', 'afonso', 'afonso123');
INSERT INTO tb_aluno (nome, dataNascimento, periodo, usuario, senha) VALUES ('Viviane', '20/05/2002', '2', 'viviane', 'viviane123');
INSERT INTO tb_aluno (nome, dataNascimento, periodo, usuario, senha) VALUES ('Gaspar', '15/02/2000', '6', 'gaspar', 'gaspar123');

INSERT INTO tb_disciplina (nome, ementa) VALUES ('Física', 'ementa01');
INSERT INTO tb_disciplina (nome, ementa) VALUES ('Matemática', 'ementa02');
INSERT INTO tb_disciplina (nome, ementa) VALUES ('História', 'ementa03');

INSERT INTO tb_nota_trabalho (nota) VALUES (6,7);
INSERT INTO tb_nota_trabalho (nota) VALUES (5,5);
INSERT INTO tb_nota_trabalho (nota) VALUES (8,3);

INSERT INTO tb_rendimento_escolar (p1, p2) VALUES (5, 6);
INSERT INTO tb_rendimento_escolar (p1, p2) VALUES (6,5, 7);
INSERT INTO tb_rendimento_escolar (p1, p2) VALUES (7,4, 6,3);

INSERT INTO tb_trabalho (descricao) VALUES ("descrição01");
INSERT INTO tb_trabalho (descricao) VALUES ("descrição02");
INSERT INTO tb_trabalho (descricao) VALUES ("descrição03");
