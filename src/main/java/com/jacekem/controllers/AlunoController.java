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


//    @GetMapping(path="/add")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String email) {

        Aluno n = new Aluno();
        n.setName(name);
        n.setEmail(email);
        alunoRepository.save(n);
        return "worked";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Aluno> getAllUsers() {
        return alunoRepository.findAll();
    }
}
