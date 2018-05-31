package com.example.demo;

public class Persona {
	

		String nombre;
		String sexo;

		

		public String getSexo() {
			return sexo;
		}



		public void setSexo(String sexo) {
			this.sexo = sexo;
		}



		public String getNombre() {
			return nombre;
			
		}



		public Persona(String nombre, String sexo) {
			super();
			this.nombre = nombre;
			this.sexo = sexo;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public Persona(String nombre) {
			super();
			this.nombre = nombre;
		}



		public Persona() {}

			

}
