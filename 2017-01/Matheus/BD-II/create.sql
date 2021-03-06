create table area (
id_area number constraint pk_area primary key,
nome_area varchar2(10) not null
);

create table curso (
id_curso number constraint pk_curso primary key,
nome_curso varchar2(30) not null,
n_semestres varchar2(10),
turno varchar2(10),
id_area number
);

create table disciplina (
id_disciplina number constraint pk_disciplina primary key,
codigo varchar2(10),
nome_disciplina varchar2(30) not null,
n_creditos number,
id_curso number
);

create table aluno (
id_aluno number constraint pk_aluno primary key,
nome_aluno varchar2(15) not null,
data_nascimento date not null
);

create table professor (
id_professor number constraint pk_professor primary key,
nome_professor varchar2(15) not null,
n_horas number,
id_area number
);

create table turma (
id_turma number constraint pk_turma primary key,
id_disciplina number not null,
id_professor number not null,
semestre varchar2(15),
turno varchar2(15),
max_alunos number
);

create table turma_aluno (
id_turma number not null,
id_aluno number not null,
media_final number,
constraint pk_turma_aluno primary key (id_turma, id_aluno)
);

create table aluno_curso (
id_aluno number not null,
id_curso number not null,
data_inicio date,
data_fim date,
turno varchar2(15),
constraint pk_aluno_curso primary key (id_aluno, id_curso)
);

alter table curso add constraint fk_curso_id_area foreign key (id_area) references area;

alter table professor add (constraint fk_professor_area foreign key (id_area) references area);

alter table disciplina add constraint fk_disciplina_id_curso foreign key (id_curso) references curso;

alter table turma
add ( constraint fk_turma_id_disciplina foreign key (id_disciplina) references disciplina,
constraint fk_turmas_professor foreign key (id_professor) references professor (id_professor));

alter table turma_aluno
add (constraint fk_turma_aluno_turma foreign key (id_turma) references turma (id_turma),
constraint fk_turma_aluno_aluno foreign key (id_aluno) references aluno (id_aluno));

alter table aluno_curso
add (constraint ck_data_inicio check (data_inicio is not null), constraint fk_aluno_curso_aluno foreign key (id_aluno) references aluno (id_aluno),
constraint fk_aluno_curso_curso foreign key (id_curso) references curso (id_curso));

create sequence s_id_area nocache;
create sequence s_id_curso nocache;
create sequence s_id_disciplina nocache;
create sequence s_id_aluno nocache;
create sequence s_id_professor nocache;
create sequence s_id_turma nocache;