package arrayDia05;

import java.util.ArrayList;

public class DezFrutas {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList<> ();
		
		frutas.add("pitaya");
		frutas.add("Morango");
		frutas.add("Kiwi");
		frutas.add("Jabuticaba");
		frutas.add("blueberry");
		frutas.add("Maça");
		frutas.add("Ameixa");
		frutas.add("Banana");
		frutas.add("Abacaxi");
		frutas.add("Uva");
		

		System.out.println(frutas);
		
		frutas.remove(0);
		frutas.remove(1);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);
		
		System.out.println(frutas);
		System.out.println(frutas.size());
	}

}
