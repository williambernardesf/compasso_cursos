package br.com.projeto.curso.dao;

import javax.persistence.EntityManager;

import br.com.projeto.curso.model.Disciplina;

public class DisciplinaDao {
	
	private EntityManager em;

	public DisciplinaDao(EntityManager em) {
		this.em = em;
	}

	public void incluirDisciplina(Disciplina disciplina) {
		this.em.persist(disciplina);
	}
	
	public Disciplina consultarDisciplina(Long id) {
		return em.find(Disciplina.class, id);
	}
}