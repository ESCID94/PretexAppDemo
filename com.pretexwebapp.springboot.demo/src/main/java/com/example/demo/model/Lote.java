package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreType;


@Entity
@JsonIgnoreType	
@Component
public class Lote {
	private int idPRETEX_LOTE;
	private int NUM_GANADO;
	private Date FECHA_INICIO;
	private Date FECHA_FIN;
	private Date FECHA_TRASLADO;
	private String ORIGEN_NAVE;
	private String DESTINO_NAVE;
	private String NAVE_ACTUAL;
	private int MUERTOS;
	
	
	
	
	
	public Lote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Lote(int idPRETEX_LOTE, int nUM_GANADO, Date fECHA_INICIO, Date fECHA_FIN, Date fECHA_TRASLADO,
			String oRIGEN_NAVE, String dESTINO_NAVE, String nAVE_ACTUAL, int mUERTOS) {
		super();
		this.idPRETEX_LOTE = idPRETEX_LOTE;
		NUM_GANADO = nUM_GANADO;
		FECHA_INICIO = fECHA_INICIO;
		FECHA_FIN = fECHA_FIN;
		FECHA_TRASLADO = fECHA_TRASLADO;
		ORIGEN_NAVE = oRIGEN_NAVE;
		DESTINO_NAVE = dESTINO_NAVE;
		NAVE_ACTUAL = nAVE_ACTUAL;
		MUERTOS = mUERTOS;
	}



	public int getIdPRETEX_LOTE() {
		return idPRETEX_LOTE;
	}
	public void setIdPRETEX_LOTE(int idPRETEX_LOTE) {
		this.idPRETEX_LOTE = idPRETEX_LOTE;
	}
	public int getNUM_GANADO() {
		return NUM_GANADO;
	}
	public void setNUM_GANADO(int nUM_GANADO) {
		NUM_GANADO = nUM_GANADO;
	}
	public Date getFECHA_INICIO() {
		return FECHA_INICIO;
	}
	public void setFECHA_INICIO(Date fECHA_INICIO) {
		FECHA_INICIO = fECHA_INICIO;
	}
	public Date getFECHA_FIN() {
		return FECHA_FIN;
	}
	public void setFECHA_FIN(Date fECHA_FIN) {
		FECHA_FIN = fECHA_FIN;
	}
	public Date getFECHA_TRASLADO() {
		return FECHA_TRASLADO;
	}
	public void setFECHA_TRASLADO(Date fECHA_TRASLADO) {
		FECHA_TRASLADO = fECHA_TRASLADO;
	}
	public String getORIGEN_NAVE() {
		return ORIGEN_NAVE;
	}
	public void setORIGEN_NAVE(String oRIGEN_NAVE) {
		ORIGEN_NAVE = oRIGEN_NAVE;
	}
	public String getDESTINO_NAVE() {
		return DESTINO_NAVE;
	}
	public void setDESTINO_NAVE(String dESTINO_NAVE) {
		DESTINO_NAVE = dESTINO_NAVE;
	}
	public String getNAVE_ACTUAL() {
		return NAVE_ACTUAL;
	}
	public void setNAVE_ACTUAL(String nAVE_ACTUAL) {
		NAVE_ACTUAL = nAVE_ACTUAL;
	}
	public int getMUERTOS() {
		return MUERTOS;
	}
	public void setMUERTOS(int mUERTOS) {
		MUERTOS = mUERTOS;
	}
	
	
	
}
