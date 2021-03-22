package com.educandoweb.workshop.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshop.entidades.Pedido;
import com.educandoweb.workshop.servicos.PedidoServico;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRecurso {

	@Autowired
	private PedidoServico servico;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> encontrarTodos() {
		List<Pedido> lista = servico.encontrarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> encontrarPorId(@PathVariable Long id) {
		Pedido obj = servico.encontrarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
