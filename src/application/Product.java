package application;


public class Product {
	
	String nazwa, kategoria;
	double weglowodany, bialko, tluszcze, blonnik;
	
	public Product(String n, String k, double a,double d, double e, double b) {
		weglowodany = a;
		bialko = d;
		tluszcze = e;
		nazwa = n;
		kategoria = k;		
		blonnik = b;
	}
	
	public String getNazwa() {
		return nazwa; 
	}
	
	public String getKategoria() {
		return kategoria; 
	}
	
	
	public double getWeglowodany() {
		return weglowodany; 
	}
	
	public void setWeglowodany(double w) {
		weglowodany = w; 
	}
	
	public void setBialko(double b) {
		bialko = b; 
	}
	
	public void setTluszcze(double t) {
		tluszcze = t; 
	}
	
	public void setBlonnik(double bl) {
		blonnik = bl; 
	}
	
	public double getBialko() {
		return bialko; 
	}
	
	public double getBlonnik() {
		return blonnik; 
	}
	
	public double getTluszcze() {
		return tluszcze; 
	}
		
}
