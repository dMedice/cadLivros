package prj.cadLivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import prj.cadLivros.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
