package arrayDia05;

import java.util.ArrayList;
import java.util.Scanner;

public class DezCarros {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
        ArrayList<String> carro = new ArrayList<> ();
          int i=0;
     
		
		carro.add("ferrari");
		carro.add("lamborguini");
		carro.add("jeep");
		carro.add("honda hrv");
		carro.add("onix");
		carro.add("hb20");
		carro.add("porsche");
		carro.add("dodge ham");
		carro.add("bmw x5");
		carro.add("tesla");
		
		System.out.println(carro);
		System.out.println("qual carro deseja ver?");
		i = ler.nextInt();
		System.out.println(carro.get(i));
		
        ler.close();
	}

}
