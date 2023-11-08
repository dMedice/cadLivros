package prjLana.cadLivros.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prjLana.cadLivros.entities.Livro;
import prjLana.cadLivros.services.Service;

	@RestController
	@RequestMapping("/livros")
	public class Controller {
		private final Service service;

	    @Autowired
	    public Controller(Service service) {
	        this.service = service;
	    }

	    @PostMapping
	    public Livro createUsuario(@RequestBody Livro livro) {
	        return service.saveLivro(livro);
	    }

	    @GetMapping("/{id}")
	    public Livro getLivro(@PathVariable Long id) {
	        return service.getLivroById(id);
	    }

	    @GetMapping
	    public List<Livro> getAllLivros() {
	        return service.getAllLivros();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteLivro(@PathVariable Long id) {
	    	service.deleteLivro(id);
	    }
	}

