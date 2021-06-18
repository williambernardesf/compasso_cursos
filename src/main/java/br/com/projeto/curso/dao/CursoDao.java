package br.com.projeto.curso.dao;

import javax.persistence.EntityManager;

import br.com.projeto.curso.model.Curso;

public class CursoDao {
	
	private EntityManager em;
	
	public CursoDao(EntityManager em) {
		this.em = em;
	}

	public void incluirCurso(Curso curso) {
		this.em.persist(curso);
	}
	
	public Curso consultarCurso(Long id) {
		return em.find(Curso.class, id);
	}
}