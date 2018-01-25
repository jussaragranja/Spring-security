package br.com.locadora.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cpf;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Nome é informação obrigatória.")
	private String nome;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Email é informação obrigatória.")
	private String email;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Telefone é informação obrigatória.")
	private Long telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
