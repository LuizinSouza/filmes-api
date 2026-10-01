package com.example.filmes_api.controller;

import com.example.filmes_api.model.Filme;
import com.example.filmes_api.repository.FilmeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeRepository filmeRepository;

    public FilmeController(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    @GetMapping
    public List<Filme> listar() {
        return filmeRepository.findAll();
    }

    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme) {
        return filmeRepository.save(filme);
    }
}