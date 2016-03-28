package menjacnica;

import java.util.GregorianCalendar;

public class Menjacnica {
	public void dodajKurs(Valuta valuta, Kurs kurs){
		if(kurs == null || valuta == null) throw new RuntimeException("Greska");
		
		
		valuta.getKursevi().add(kurs);
	}
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum){
		
	}
	public Kurs prondajiKurs(Valuta valuta, GregorianCalendar datum){
		return null;
	}
}
