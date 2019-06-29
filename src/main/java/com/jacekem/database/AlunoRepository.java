package com.jacekem.database;

import com.jacekem.model.Aluno;
import org.springframework.data.repository.CrudRepository;


public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

}