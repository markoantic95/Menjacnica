package interfejsi;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajKurs(Valuta valuta, Kurs kurs);
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum);
	public void prondajiKurs(Valuta valuta, GregorianCalendar datum);
}
