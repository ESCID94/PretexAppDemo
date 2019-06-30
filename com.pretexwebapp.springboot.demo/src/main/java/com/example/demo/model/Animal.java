package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Animal {
	private long id;
	private int lote;
	private int sexo;
	private float peso;
	private String granja;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(long id, int lote, int sexo, float peso, String granja) {
		super();
		this.id = id;
		this.lote = lote;
		this.sexo = sexo;
		this.peso = peso;
		this.granja = granja;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getGranja() {
		return granja;
	}
	public void setGranja(String granja) {
		this.granja = granja;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", lote=" + lote + ", sexo=" + sexo + ", peso=" + peso + ", granja=" + granja + "]";
	}
	
	
	
}
