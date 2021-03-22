package com.educandoweb.workshop.configuracao;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.workshop.entidades.Categoria;
import com.educandoweb.workshop.entidades.Pedido;
import com.educandoweb.workshop.entidades.Produto;
import com.educandoweb.workshop.entidades.Usuario;
import com.educandoweb.workshop.entidades.enuns.PedidoStatus;
import com.educandoweb.workshop.repositorios.CategoriaRepositorio;
import com.educandoweb.workshop.repositorios.PedidoRepositorio;
import com.educandoweb.workshop.repositorios.ProdutoRepositorio;
import com.educandoweb.workshop.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TestConfiguracao implements CommandLineRunner{

		@Autowired
		private UsuarioRepositorio usuarioRepositorio;
		
		@Autowired
		private PedidoRepositorio pedidoRepositorio;
		
		@Autowired
		private CategoriaRepositorio categoriaRepositorio;
		
		@Autowired
		private ProdutoRepositorio produtoRepositorio;

		@Override
		public void run(String... args) throws Exception {

			Categoria c1 = new Categoria(null, "Eletronicos");
			Categoria c2 = new Categoria(null, "Livros");
			Categoria c3 = new Categoria(null, "Computadores");
			
			Produto pro1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
			Produto pro2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
			Produto pro3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
			Produto pro4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
			Produto pro5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 


			Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "99999999", "123456");
			Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "88888888", "123456");
			
			Pedido ped1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1);
			Pedido ped2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ESPERANDO_PAGAMENTO, u2);
			Pedido ped3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.ESPERANDO_PAGAMENTO, u1);
			
			categoriaRepositorio.saveAll(Arrays.asList(c1, c2, c3));
			usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
			pedidoRepositorio.saveAll(Arrays.asList(ped1,ped2,ped3));
			produtoRepositorio.saveAll(Arrays.asList(pro1, pro2, pro3, pro4, pro5));
			
		}
	
}
