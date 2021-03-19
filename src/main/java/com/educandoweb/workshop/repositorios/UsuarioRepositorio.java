package com.educandoweb.workshop.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	
	
}
