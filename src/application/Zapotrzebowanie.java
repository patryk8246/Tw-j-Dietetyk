package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Zapotrzebowanie {

	float waga, wzrost, wiek;
	double kalorieDoZycia, kalorieDzien, zapotrzebowanie;
	int kalorieTrening;
	int licznikDoNazwyDiety = 0;
	String plec = "";
	String cel = "";
	String imie = "";
	File plik = new File("uzytkownik.txt");
	
	public void setWaga(float waga) {
		this.waga = waga; 
	}
	
	public void setWzrost(float wzrost) {
		this.wzrost = wzrost; 
	}
	
	public void setLicznikDoNazwyDiety(int licznikDoNazwyDiety) {
		this.licznikDoNazwyDiety = licznikDoNazwyDiety; 
	}
	
	public void setKalorieDzien(double kalorieDzien) {
		this.kalorieDzien = kalorieDzien; 
	}
	
	public void setWiek(float wiek) {
		this.wiek = wiek; 
	}
	
	public void setZapotrzebowanie(double zapotrzebowanie) {
		this.zapotrzebowanie = zapotrzebowanie; 
	}
	
	public void setPlec(String plec) {
		this.plec = plec; 
	}
	
	public void setCel(String cel) {
		this.cel = cel; 
	} 
	
	public void setImie(String imie) {
		this.imie = imie; 
	} 
	
	public void setKalorieTrening(int kalorieTrening) {
		this.kalorieTrening = kalorieTrening; 
	}
	
	public float getWaga() {
		return waga; 
	}
	
	public File getPlik() {
		return plik; 
	}
	
	public float getWzrost() {
		return wzrost; 
	}
	
	public double getKalorieDzien() {
		return kalorieDzien; 		
	}
	
	public float getWiek() {
		return wiek; 
	}
	
	public int getLicznikDoNazwyDiety() {
		return licznikDoNazwyDiety; 
	}
	
	public int getkalorieTrening() {
		return kalorieTrening; 
	}

	public String getPlec() {
		return plec; 
	}
	
	public String getImie() {
		return imie; 
	}
	
	public double getZapotrzebowanie() {
		return zapotrzebowanie; 
	}
	
	public String getCel() {
		return cel; 
	}
	
	public double getKalorieDoZycia() {
		return kalorieDoZycia; 
	}
	
	public double wyliczZapotrzebowanie () {
		double waga2;
		double wzrost2;
		double wiek2;
		double tef, kalorieDzien2, zapotrzebowanie;
		
		if(plec.equals("Kobieta"))
		{	
			waga2 = 9.56 * waga;
			wzrost2 = 1.85 * wzrost;
			wiek2 = 4.67 * wiek;
			kalorieDoZycia = (665.09 + waga2 + wzrost2 - wiek2);
		}
		
		if(plec.equals("Mezczyzna"))
		{
			waga2 = 13.75 * waga;
			wzrost2 = 5 * wzrost;
			wiek2 = 6.75 * wiek;
			kalorieDoZycia = (66.47 + waga2 + wzrost2 - wiek2);
		}
		
		tef = kalorieDoZycia * 0.1;
		kalorieDzien2 = kalorieDoZycia * kalorieDzien;
		zapotrzebowanie = kalorieDoZycia + tef + kalorieDzien2 + kalorieTrening;
		
		if(cel.equals("Redukcja"))
		{
			zapotrzebowanie -= 500;
			
		}
		
		if(cel.equals("Masa"))
		{
			zapotrzebowanie += 500;
		}
		
		if(cel.equals("Utrzymanie masy"))
		{
			zapotrzebowanie += 0;
		}
		
		this.zapotrzebowanie = zapotrzebowanie;
		return zapotrzebowanie;
	}
	
	public void zapiszPlikTxt() throws FileNotFoundException
	{
		
		PrintWriter zapisz = new PrintWriter(plik);
		zapisz.println(imie);
		zapisz.println(waga);
		zapisz.println(wzrost);
		zapisz.println(zapotrzebowanie);
		zapisz.println(cel);
		zapisz.println(kalorieTrening);
		zapisz.println(kalorieDoZycia);
		zapisz.println(kalorieDzien);
		zapisz.println(wiek);
		zapisz.println(plec);
		zapisz.println(licznikDoNazwyDiety);
		zapisz.close();
		
		
	}
	public void odczytPlikTxt() throws IOException
	{
		BufferedReader odczyt = new BufferedReader(new FileReader("uzytkownik.txt"));
		imie = odczyt.readLine();
		waga = Float.parseFloat(odczyt.readLine());
		wzrost = Float.parseFloat(odczyt.readLine());
		zapotrzebowanie = Double.parseDouble(odczyt.readLine());
		cel = odczyt.readLine();
		kalorieTrening = Integer.parseInt(odczyt.readLine());
		kalorieDoZycia = Double.parseDouble(odczyt.readLine());
		kalorieDzien = Double.parseDouble(odczyt.readLine());
		wiek = Float.parseFloat(odczyt.readLine());
		plec = odczyt.readLine();
		licznikDoNazwyDiety = Integer.parseInt(odczyt.readLine());
		odczyt.close();	
	}
}
