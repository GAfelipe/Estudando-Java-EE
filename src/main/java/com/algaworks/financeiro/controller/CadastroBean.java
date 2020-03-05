package com.algaworks.financeiro.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CadastroBean {
	private String nome;

	public void cadastrar() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Cancelado.",
				"Senha incorreta");
		context.addMessage(null, mensagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
