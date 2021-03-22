package com.educandoweb.workshop.configuracao;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.workshop.entidades.Pedido;
import com.educandoweb.workshop.entidades.Usuario;
import com.educandoweb.workshop.entidades.enuns.PedidoStatus;
import com.educandoweb.workshop.repositorios.PedidoRepositorio;
import com.educandoweb.workshop.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TestConfiguracao implements CommandLineRunner{

		@Autowired
		private UsuarioRepositorio usuarioRepositorio;
		
		@Autowired
		private PedidoRepositorio pedidoRepositorio;

		@Override
		public void run(String... args) throws Exception {

			Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "99999999", "123456");
			Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "88888888", "123456");
			
			Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1);
			Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ESPERANDO_PAGAMENTO, u2);
			Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.ESPERANDO_PAGAMENTO, u1);
			
			usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
			pedidoRepositorio.saveAll(Arrays.asList(p1,p2,p3));
			
		}
	
}
