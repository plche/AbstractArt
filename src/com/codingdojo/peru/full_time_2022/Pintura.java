package com.codingdojo.peru.full_time_2022;

public class Pintura extends Arte {
	
	private String tipoPintura;
	
	public Pintura(String titulo, String autor, String descripcion, String tipoPintura) {
		super(titulo, autor, descripcion);
		this.tipoPintura = tipoPintura;
	}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	@Override
	public void verArte() {
		System.out.println("Información acerca de la Pintura:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Descripción: " + getDescripcion());
		System.out.println("Tipo Pintura: " + getTipoPintura());
		System.out.println();
	}
}
