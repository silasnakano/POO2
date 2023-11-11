INSERT INTO tb_ator (nome, papel_do_ator) VALUES ('Ator01', 'Principal');
INSERT INTO tb_ator (nome, papel_do_ator) VALUES ('Ator02', 'Coadjuvante');
INSERT INTO tb_ator (nome, papel_do_ator) VALUES ('Ator03', 'Figurante');

INSERT INTO tb_filme_ator (ator_id) VALUES (1);
INSERT INTO tb_filme_ator (ator_id) VALUES (2);
INSERT INTO tb_filme_ator (ator_id) VALUES (3);

INSERT INTO tb_filme (titulo, duracao, genero, filme_ator_id) VALUES ('Titulo01', 120, 'Acao', 1);
INSERT INTO tb_filme (titulo, duracao, genero, filme_ator_id) VALUES ('Titulo02', 90, 'Comedia', 2);
INSERT INTO tb_filme (titulo, duracao, genero, filme_ator_id) VALUES ('Titulo03', 105, 'Romance', 3);

INSERT INTO tb_sessao (status_da_sessao, data, horario) VALUES ('Em andamento', '2023-01-23', '14:00');
INSERT INTO tb_sessao (status_da_sessao, data, horario) VALUES ('Em breve', '2023-05-12', '20:30');
INSERT INTO tb_sessao (status_da_sessao, data, horario) VALUES ('Em estreia', '2023-12-17', '17:00');

INSERT INTO tb_sala (num_assentos, tipo_tela, localizacao, sessao_id) VALUES (60, 'IMAX', 'Sala01', 2);
INSERT INTO tb_sala (num_assentos, tipo_tela, localizacao, sessao_id) VALUES (34, 'Wide', 'Sala06', 3);
INSERT INTO tb_sala (num_assentos, tipo_tela, localizacao, sessao_id) VALUES (80, 'IMAX-3D', 'Sala03', 1);

INSERT INTO tb_ingresso (tipo, categoria, filme_id, sessao_id, sala_id) VALUES ('Inteira', 'categoria01', 1, 2, 3);
INSERT INTO tb_ingresso (tipo, categoria, filme_id, sessao_id, sala_id) VALUES ('Meia', 'categoria02', 2, 3, 1);
INSERT INTO tb_ingresso (tipo, categoria, filme_id, sessao_id, sala_id) VALUES ('Vip', 'categoria03', 3, 1, 2);
