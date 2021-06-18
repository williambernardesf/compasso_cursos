package br.com.projeto.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.projeto.curso.model.Aluno;
import br.com.projeto.curso.model.Turma;

public class TurmaDao {
	
	private EntityManager em;
	
	public TurmaDao(EntityManager em) {
		this.em = em;
	}

	public List<Turma> listarTurma() {
		String jpql = "SELECT t FROM Turma t";
		return em.createQuery(jpql, Turma.class).getResultList();
	}
	
	public List<Aluno> listarAluno() {
		String jpql = "SELECT a FROM Aluno a";
		return em.createQuery(jpql, Aluno.class).getResultList();
	}
}