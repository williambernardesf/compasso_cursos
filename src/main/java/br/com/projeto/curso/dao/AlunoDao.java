package br.com.projeto.curso.dao;

import javax.persistence.EntityManager;

import br.com.projeto.curso.model.Aluno;

public class AlunoDao {
	
	private EntityManager em;
	
	public AlunoDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Aluno aluno) {
		this.em.persist(aluno);
	}
	
	public void atualizar(Aluno aluno) {
		this.em.merge(aluno);
	}
	
	public void remover(Aluno aluno) {
		aluno = em.merge(aluno);
		this.em.remove(aluno);
	}
	
	
	public Aluno consultarAluno(Long id) {
		return em.find(Aluno.class, id);
	}
}
