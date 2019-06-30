package com.jacekem.controllers;


import com.jacekem.database.AlunoRepository;
import com.jacekem.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/aluno")
public class AlunoController {


    @Autowired
    private AlunoRepository alunoRepository;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String addNewUser (@RequestParam String name,
                       @RequestParam String surname,
                       @RequestParam String email,
                       @RequestParam String apelido

                        ) {

        Aluno n = new Aluno();
        n.setName(name);
        n.setEmail(email);
        n.setApelido(apelido);
        n.setSurname(surname);
        alunoRepository.save(n);
        return "worked";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Aluno> getAllUsers() {
        return alunoRepository.findAll();
    }
}
