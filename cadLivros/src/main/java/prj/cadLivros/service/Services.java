package prj.cadLivros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prj.cadLivros.entities.Livro;
import prj.cadLivros.repositories.LivroRepository;

@Service
public class Services {
	
	private final LivroRepository LivroRepository;
 
    @Autowired
    public Services(LivroRepository LivroRepository) {
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
