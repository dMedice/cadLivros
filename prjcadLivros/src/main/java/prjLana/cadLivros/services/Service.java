package prjLana.cadLivros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import prjLana.cadLivros.entities.Livro;
import prjLana.cadLivros.repositories.LivroRepository;

@org.springframework.stereotype.Service
public class Service {
	
	private final LivroRepository LivroRepository;
 
    @Autowired
    public Service(LivroRepository LivroRepository) {
        this.LivroRepository = LivroRepository;
    }

    public Livro saveLivro(Livro livro) {
        return LivroRepository.save(livro);
    }

    public Livro getLivroById(Long id) {
        return LivroRepository.findById(id).orElse(null);
    }

    public List<Livro> getAllLivros() {
        return LivroRepository.findAll();
    }

    public void deleteLivro(Long id) {
    	LivroRepository.deleteById(id);
    }
}