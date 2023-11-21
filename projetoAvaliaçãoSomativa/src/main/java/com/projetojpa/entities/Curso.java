package com.projetojpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name = "curso")

public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	@Column(name = "id")
	private long id;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Column(name = "cargaHoraria")
	private double cargaHoraria;
	
	@NotNull
	@Column(name = "conteudoProgramatico")
	private String conteudeProgramatico;
	
	@NotNull
	@Column(name = "valor")
	private double valor;
	
	@NotNull
	@Column(name = "professor")
	private String professor;

	}

