-- Tabela AREA

insert into area values (s_id_area.nextval, 'Exatas');
insert into area values (s_id_area.nextval, 'Humanas');
insert into area values (s_id_area.nextval, 'Biol�gicas');

-- Tabela CURSO

insert into curso values (s_id_curso.nextval, 'Matem�tica', '8', 'Manh�', 1);
insert into curso values (s_id_curso.nextval, 'An�lise de Sistemas', '6', 'Tarde', 1);
insert into curso values (s_id_curso.nextval, 'Biotecnologia', '10', 'Manh�', 3);
insert into curso values (s_id_curso.nextval, 'Hist�ria', '8', 'Noite', 2);
insert into curso values (s_id_curso.nextval, 'Inform�tica Biol�gica', '8', 'Noite', 3);
insert into curso values (s_id_curso.nextval, 'Museologia', '6', 'Tarde', 1);

-- Tabela DISCIPLINA

insert into disciplina values (s_id_disciplina.nextval, 'MAT001', 'Introdu��o � Matem�tica', 4, 1);
insert into disciplina values (s_id_disciplina.nextval, 'MAT002', 'C�lculo I', 8, 1);
insert into disciplina values (s_id_disciplina.nextval, 'ADS001', 'Introdu��o a Sistemas', 4, 2);
insert into disciplina values (s_id_disciplina.nextval, 'ADS002', 'L�gica de Programa��o', 6, 2);
insert into disciplina values (s_id_disciplina.nextval, 'BIT001', 'Introdu��o � Biotecnologia', 4, 3);
insert into disciplina values (s_id_disciplina.nextval, 'BIT002', 'Gen�tica', 8, 3);
insert into disciplina values (s_id_disciplina.nextval, 'HIS001', 'Hist�ria Geral', 6, 4);
insert into disciplina values (s_id_disciplina.nextval, 'HIS002', 'Hist�ria do Brasil', 4, 4);
insert into disciplina values (s_id_disciplina.nextval, 'IFB001', 'Introdu��o a Inform�tica', 6, 5);
insert into disciplina values (s_id_disciplina.nextval, 'IFB002', 'Gen�tica', 4, 5);
insert into disciplina values (s_id_disciplina.nextval, 'MUS001', 'Introdu��o � Museologia', 8, 6);
insert into disciplina values (s_id_disciplina.nextval, 'MUS002', 'Museus Europeus', 4, 6);

-- Tabela ALUNO

insert into aluno values (s_id_aluno.nextval, 'Matheus', '05-10-1994');
insert into aluno values (s_id_aluno.nextval, 'M�rcia', '01-01-1996');
insert into aluno values (s_id_aluno.nextval, 'Cristiano', '03-11-1996');
insert into aluno values (s_id_aluno.nextval, 'Patr�cia', '09-02-1995');
insert into aluno values (s_id_aluno.nextval, 'Thayse', '07-06-1989');
insert into aluno values (s_id_aluno.nextval, 'Patrick', '07-02-1989');

-- Tabela PROFESSOR

insert into professor values (s_id_professor.nextval, 'Thanise', 40, 1);
insert into professor values (s_id_professor.nextval, 'Marcos', 40, 1);
insert into professor values (s_id_professor.nextval, 'Karen', 40, 3);
insert into professor values (s_id_professor.nextval, 'Viviane', 40, 2);

-- Tabela TURMA

insert into turma values (s_id_turma.nextval, 1, 4, '2016/1', 'Manh�', 20);
insert into turma values (s_id_turma.nextval, 3, 3, '2016/1', 'Tarde', 35);
insert into turma values (s_id_turma.nextval, 7, 3, '2016/1', 'Tarde', 35);
insert into turma values (s_id_turma.nextval, 1, 4, '2013/1', 'Manh�', 20);
insert into turma values (s_id_turma.nextval, 3, 3, '2013/1', 'Tarde', 35);
insert into turma values (s_id_turma.nextval, 7, 3, '2013/1', 'Tarde', 35);
insert into turma values (s_id_turma.nextval, 1, 4, '2014/1', 'Manh�', 20);
insert into turma values (s_id_turma.nextval, 3, 3, '2014/1', 'Tarde', 35);
insert into turma values (s_id_turma.nextval, 7, 3, '2014/1', 'Tarde', 35);

-- Tabela TURMA_ALUNO

insert into turma_aluno values (1, 1, 10);
insert into turma_aluno values (2, 2, 2);
insert into turma_aluno values (3, 1, 8);
insert into turma_aluno values (4, 4, 5);
insert into turma_aluno values (5, 1, 10);
insert into turma_aluno values (6, 2, 2);
insert into turma_aluno values (7, 1, 8);
insert into turma_aluno values (8, 4, 5);
insert into turma_aluno values (9, 1, 10);

-- Tabela ALUNO_CURSO
insert into aluno_curso values (1, 2, '01-01-2017', '31-12-2020', 'Manh�');
insert into aluno_curso values (2, 4, '01-01-2015', '31-12-2019', 'Tarde');
insert into aluno_curso values (3, 6, '01-01-2015', '31-12-2020', 'Manh�');
insert into aluno_curso values (4, 3, '01-01-2016', '31-12-2019', 'Noite');

