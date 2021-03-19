package com.educandoweb.workshop.configuracao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.workshop.entidades.Usuario;
import com.educandoweb.workshop.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TestConfiguracao implements CommandLineRunner{

		@Autowired
		private UsuarioRepositorio usuarioRepositorio;

		@Override
		public void run(String... args) throws Exception {

			Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "99999999", "123456");
			Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "88888888", "123456");
			
			usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
			
		}
	
}
