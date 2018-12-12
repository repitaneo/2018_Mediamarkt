package mediamarkt;

public class Electrodomestico {

	private String id;
	private char claseEnergetica;
	private float peso;
	private float precio;
	private float consumo;
	
	private String color;
	private String marca;
	private String modelo;
	
	
	
	public Electrodomestico(String id,
							char claseEnergetica, 
							float peso, 
							float precio, 
							float consumo, 
							String color, 
							String marca,
							String modelo) {
		

		this.id = id;
		this.claseEnergetica = claseEnergetica;
		this.peso = peso;
		this.precio = precio;
		this.consumo = consumo;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	public Electrodomestico(Electrodomestico otro,
							String id) {
		
		this.id = id;
		this.claseEnergetica = otro.claseEnergetica;
		this.peso = otro.peso;
		this.precio = otro.precio;
		this.consumo = otro.consumo;
		this.color = otro.color;
		this.marca = otro.marca;
		this.modelo = otro.modelo;		
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
	
	
	
	
	/**
	 * Calcula el precio del electrodoméstico con 
	 * IVA y envío
	 * @return el precio total del electrodomestico
	 */
	public float precioTotal() {
		
		float precio = 0;
		int precioDelEnvio = precioEnvio();
		
		precio = this.precio + 
				(this.precio*0.21f) + 
				precioDelEnvio;      
		
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	
	
	@Override
	public String toString() {
		return "[color=" + color + 
				", marca=" + marca + 
				", modelo=" + modelo + 
				", precioEnvio()="+ precioEnvio()+
				", precioTotal()=" +precioTotal()+"]";
	}




	
	
	
}
