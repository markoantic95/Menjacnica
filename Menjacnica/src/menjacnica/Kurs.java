package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private double prodajni;
	private double srednji;
	private double kupovni;
	private GregorianCalendar datum;
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni <= 0){
			throw new RuntimeException("Greska.");
		}
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji <= 0){
			throw new RuntimeException("Greska.");
		}
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni <= 0){
			throw new RuntimeException("Greska.");
		}
		this.kupovni = kupovni;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null){
			throw new RuntimeException("Greska.");
		}
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Kurs){
			Kurs kurs = (Kurs) obj;
			if(datum.compareTo(kurs.getDatum())==0 &&
					prodajni == kurs.getProdajni() &&
					kupovni == kurs.getKupovni() &&
					srednji == kurs.getSrednji()){
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Kurs [prodajni=" + prodajni + ", srednji=" + srednji + ", kupovni=" + kupovni + ", datum=" + datum
				+ "]";
	}
	
}
