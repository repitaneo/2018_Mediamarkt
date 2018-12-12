package mediamarkt;

public class Electrodomestico {

	char claseEnergetica;
	float peso;
	float precio;
	float consumo;
	
	String color;
	String marca;
	String modelo;
	
	
	
	public Electrodomestico(char claseEnergetica, 
							float peso, 
							float precio, 
							float consumo, 
							String color, 
							String marca,
							String modelo) {
		

		this.claseEnergetica = claseEnergetica;
		this.peso = peso;
		this.precio = precio;
		this.consumo = consumo;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}	
	
	
	
	
	/**
	 * Calcula el precio del envío
	 * @return el precio calculado
	 */
	public int precioEnvio() {
		
		int precio = 0;
		
		// calculo el precio según el peso
		if(peso>100) {
			precio = 100;
		}
		else if(peso>=51) {
			precio = 70;
		}
		else if(peso>=21) {
			precio = 50;
		}
		else {
			precio = 20;
		}
		
		// devuelvo el precio del envío
		return precio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * SETTERS
	 * GETTERS
	 * 
	 * 
	 */
	public char getClaseEnergetica() {
		return claseEnergetica;
	}
	public void setClaseEnergetica(char claseEnergetica) {
		this.claseEnergetica = claseEnergetica;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	@Override
	public String toString() {
		return "Electrodomestico [claseEnergetica=" + claseEnergetica + ", peso=" + peso + ", precio=" + precio
				+ ", consumo=" + consumo + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
}
