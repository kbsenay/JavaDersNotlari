package intro;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		String internetSubeButonu ="Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}else{
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "Kültür bakanlýðý kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		
		String[] krediler = 
			{
					"Hýzlý kredi",
					"Mutlu emekli kredisi", 
					"Konut kredisi",
					"Çiftçi kredisi",
					"Msb kredisi",
					"Meb kredisi",
					"Kültür bakanlýðý kredisi"
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		
		
	}

}
