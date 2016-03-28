package menjacnica;

import java.util.GregorianCalendar;

public class Menjacnica {
	public void dodajKurs(Valuta valuta, Kurs kurs){
		if(valuta == null || kurs == null){
			throw new RuntimeException("Greska");
		}

		valuta.getKursevi().add(kurs);
	}
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum){
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().compareTo(datum)==0){
				valuta.getKursevi().remove(i);
			}
		}
	}
	public Kurs prondajiKurs(Valuta valuta, GregorianCalendar datum){
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().compareTo(datum)==0){
				return valuta.getKursevi().get(i);
				}
			}
		return null;
	}
}
