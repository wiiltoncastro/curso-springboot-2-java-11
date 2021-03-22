package com.educandoweb.workshop.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entidades.Pedido;
import com.educandoweb.workshop.repositorios.PedidoRepositorio;

@Service
public class PedidoServico {

	@Autowired
	private PedidoRepositorio repositorio;
	
	public List<Pedido> encontrarTodos() {
		return repositorio.findAll();
	}
	
	public Pedido encontrarPorId(Long id) {
		Optional<Pedido> obj =	repositorio.findById(id);
		return obj.get();
	}
	
}
