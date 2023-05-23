package com.educandoweb.course;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.course.entities.*;
import com.educandoweb.course.repositories.PessoaRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
public class SeedingConofig implements CommandLineRunner {
	
	@Autowired
	private UserRepository taskRepo;
	
	@Autowired
	private PessoaRepository pessoaRepo;

	@Override
	public void run(String... args) throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Paulo");
		pessoaRepo.save(pessoa);
		
		Task task = new Task();
		task.setDeadline(LocalDate.now());
		task.setPrioridade(PrioridadeEnum.ALTA);;
		task.setResponsavel(pessoa);
		task.setStatus(StatusEnum.EM_ANDAMENTO);
		task.setDescricao("Abrir a porta");
		
		taskRepo.save(task);
	}

}
