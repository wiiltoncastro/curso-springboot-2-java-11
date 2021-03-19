package com.educandoweb.workshop.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshop.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {

	@GetMapping
	public ResponseEntity<Usuario> encontrarTodos() {
		Usuario u = new Usuario(1L, "maria", "maria@gmail.com", "99998888", "123456");
		return ResponseEntity.ok().body(u);
	}
	
}
