package com.educandoweb.workshop.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshop.entidades.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
