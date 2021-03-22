package com.educandoweb.workshop.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entidades.Produto;
import com.educandoweb.workshop.repositorios.ProdutoRepositorio;

@Service
public class ProdutoServico {

	@Autowired
	private ProdutoRepositorio repositorio;
	
	public List<Produto> encontrarTodos() {
		return repositorio.findAll();
	}
	
	public Produto encontrarPorId(Long id) {
		Optional<Produto> obj =	repositorio.findById(id);
		return obj.get();
	}
	
}
