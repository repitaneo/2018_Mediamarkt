package mediamarkt;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Electrodomestico lavadora;
		lavadora = new Electrodomestico("JF456",'A', 
			51,355, 0.74f,"Rojo","Siemens","M35plus");

		
		Electrodomestico lavadoraCasiIgualita;
		lavadoraCasiIgualita = new Electrodomestico(lavadora, "GH987");
		
		
		System.out.println(lavadora);
		System.out.println("************");
		System.out.println(lavadoraCasiIgualita);
		
		
	}

}
