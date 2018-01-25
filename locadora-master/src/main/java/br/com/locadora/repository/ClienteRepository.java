package br.com.locadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.locadora.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	List<Cliente>findByNomeContaining(String filtro);
	
}
