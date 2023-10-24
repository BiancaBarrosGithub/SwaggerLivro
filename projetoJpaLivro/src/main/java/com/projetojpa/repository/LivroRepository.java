package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
