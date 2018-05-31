package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Javabean {

	String frutas;
	String verduras;
	public String getFrutas() {
		return frutas;
	}
	public void setFrutas(String frutas) {
		this.frutas = frutas;
	}
	public String getVerduras() {
		return verduras;
	}
	public void setVerduras(String verduras) {
		this.verduras = verduras;
	}
	public Javabean(String frutas, String verduras) {
		super();
		this.frutas = frutas;
		this.verduras = verduras;
	}
	
	public Javabean() {	}
}
