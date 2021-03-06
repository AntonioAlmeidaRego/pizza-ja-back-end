package br.com.pizza.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/*Class Endereco*/

@Entity
@Data
public class Endereco implements Serializable{

	/**
	 * Atributos da class Endereco
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String rua;
	private String bairro;
	private Integer numero;
}
