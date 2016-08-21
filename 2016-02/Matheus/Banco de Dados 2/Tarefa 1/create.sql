-- Exemplo
/*CREATE TABLE Departamento
    (id_departamento NUMBER(4) PRIMARY KEY,
	nome VARCHAR2(20);*/

-- Tabelas
CREATE TABLE area
    (id_area NUMBER(4) PRIMARY KEY,
    nome VARCHAR2(20));

CREATE TABLE curso
    (id_curso NUMBER(4) PRIMARY KEY,
    nome_curso VARCHAR2(20),
    n_semestres NUMBER(2), 
    turno VARCHAR2(10),
    id_area NUMBER(4));

CREATE TABLE disciplina
    (id_disciplina NUMBER(4) PRIMARY KEY,
    codigo VARCHAR2(10),
    nome_disciplina VARCHAR2(20),
    n_creditos NUMBER(2),
    id_curso NUMBER(4));

CREATE TABLE aluno
    (id_aluno NUMBER(4) PRIMARY KEY,
    nome_aluno VARCHAR2(20),
    data_nascimento DATE);

CREATE TABLE professor
    (id_professor NUMBER(4) PRIMARY KEY,
    nome_professor VARCHAR2(20),
    n_horas NUMBER(3),
    id_area NUMBER(4));

CREATE TABLE turma
    (id_turma NUMBER(4) PRIMARY KEY,
    id_disciplina NUMBER(4),
    id_professor NUMBER(4),
    semestre NUMBER(2),
    turno VARCHAR2(10),
    max_alunos NUMBER(3));

-- Tabelas de relações
CREATE TABLE turma_aluno
    (id_turma NUMBER(4),
    id_aluno NUMBER(4),
    media_final NUMBER(3),
    constraint PK_turma_aluno PRIMARY KEY(id_turma, id_aluno));

CREATE TABLE aluno_curso
    (id_aluno NUMBER(4),
    id_curso NUMBER(4),
    data_inicio DATE,
    data_fim DATE,
    turno VARCHAR2(10),
    constraint PK_aluno_curso PRIMARY KEY(id_aluno, id_curso));

-- Foreign Keys

ALTER TABLE curso
    ADD CONSTRAINT FK_curso__area
        FOREIGN KEY (id_area) REFERENCES area ON DELETE CASCADE;

ALTER TABLE disciplina
    ADD CONSTRAINT FK_disciplina__curso
        FOREIGN KEY (id_curso) REFERENCES curso ON DELETE CASCADE;

ALTER TABLE professor
    ADD CONSTRAINT FK_professor__area
        FOREIGN KEY (id_area) REFERENCES area ON DELETE CASCADE;

ALTER TABLE turma
    ADD CONSTRAINT FK_turma__disciplina
        FOREIGN KEY (id_disciplina) REFERENCES disciplina ON DELETE CASCADE,
    ADD CONSTRAINT FK_turma__professor
        FOREIGN KEY (id_professor) REFERENCES professor ON DELETE CASCADE;

ALTER TABLE turma_aluno
    (ADD CONSTRAINT FK_turma_aluno__turma
        FOREIGN KEY (id_turma) REFERENCES turma ON DELETE CASCADE,
    ADD CONSTRAINT FK_turma_aluno__aluno
        FOREIGN KEY (id_aluno) REFERENCES aluno ON DELETE CASCADE);

ALTER TABLE aluno_curso
    (ADD CONSTRAINT FK_aluno_curso__aluno
        FOREIGN KEY (id_aluno) REFERENCES aluno ON DELETE CASCADE,
    ADD CONSTRAINT FK_aluno_curso__curso
        FOREIGN KEY (id_curso) REFERENCES curso ON DELETE CASCADE);