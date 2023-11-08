package prjLana.cadLivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import prjLana.cadLivros.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
