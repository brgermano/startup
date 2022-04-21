package br.com.fiap.startup.repository;

import br.com.fiap.startup.model.Ong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OngRepository extends JpaRepository<Ong, Integer> {

}
