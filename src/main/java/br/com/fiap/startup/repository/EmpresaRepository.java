package br.com.fiap.startup.repository;

import br.com.fiap.startup.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    //List<Empresa> findByNome(String emp);
}
