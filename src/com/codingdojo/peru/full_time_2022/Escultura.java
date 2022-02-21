package com.codingdojo.peru.full_time_2022;

public class Escultura extends Arte {
	
	private String material;

	public Escultura(String titulo, String autor, String descripcion, String material) {
		super(titulo, autor, descripcion);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void verArte() {
		System.out.println("Información acerca de la Escultura:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Descripción: " + getDescripcion());
		System.out.println("Material: " + getMaterial());
		System.out.println();
	}
}
