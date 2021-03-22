package com.educandoweb.workshop.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entidades.Categoria;
import com.educandoweb.workshop.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServico {

	@Autowired
	private CategoriaRepositorio repositorio;
	
	public List<Categoria> encontrarTodos() {
		return repositorio.findAll();
	}
	
	public Categoria encontrarPorId(Long id) {
		Optional<Categoria> obj =	repositorio.findById(id);
		return obj.get();
	}
	
}
