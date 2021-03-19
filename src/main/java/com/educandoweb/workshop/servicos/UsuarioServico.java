package com.educandoweb.workshop.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entidades.Usuario;
import com.educandoweb.workshop.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> encontrarTodos() {
		return repositorio.findAll();
	}
	
	public Usuario encontrarPorId(Long id) {
		Optional<Usuario> obj =	repositorio.findById(id);
		return obj.get();
	}
	
}
