package br.com.projeto.curso.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.curso.dao.AlunoDao;

@Controller
@RequestMapping("/aluno")
public class CadastrarAlunoController {
	
	
	@GetMapping("cadastro")
	public String cadastro(AlunoDao alunoDao) {
			
	
		
		return "aluno/cadastro";
	}

}
