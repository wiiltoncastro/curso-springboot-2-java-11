package com.educandoweb.workshop.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshop.entidades.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

	
	
}
