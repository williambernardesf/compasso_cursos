package br.com.projeto.curso.dao;

import javax.persistence.EntityManager;

import br.com.projeto.curso.model.Turma;

public class ProfessorDao {
	
	private EntityManager em;
		
	public ProfessorDao(EntityManager em) {
		this.em = em;
	}

	public Turma consultarTurma(Long id) {
		return em.find(Turma.class, id);
	}
}