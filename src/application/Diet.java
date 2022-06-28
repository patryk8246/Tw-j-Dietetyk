package application;


import java.io.File;
import java.io.FileNotFoundException;


import java.io.IOException;
import java.io.PrintWriter;

import com.itextpdf.io.font.FontConstants;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

@SuppressWarnings("deprecation")
public class Diet {

	File plik = new File("Dieta1.txt");
	String path;
	
	Product bialkoPosilek1;
	Product bialko2Posilek1;
	Product weglePosilek1;
	Product tluszczePosilek1;
	Product warzywaPosilek1;
	Product warzywa2Posilek1;
	
	Product bialkoPosilek2;
	Product weglePosilek2;
	Product tluszczePosilek2;
	Product warzywaPosilek2;
	Product warzywa2Posilek2;
	
	Product bialkoPosilek3;
	Product weglePosilek3;
	Product tluszczePosilek3;
	Product warzywaPosilek3;
	Product warzywa2Posilek3;
	
	Product bialkoPosilek4;
	Product weglePosilek4;
	Product tluszczePosilek4;
	Product warzywaPosilek4;
	Product warzywa2Posilek4;
	
	Product bialkoPosilek5;
	Product bialko2Posilek5;
	Product tluszczePosilek5;
	Product warzywa3Posilek5;
	Product warzywa2Posilek5;
	Product warzywaPosilek5;
	
	int wwP1, wwP2, wwP3, wwP4;
	int b1P1, b2P1, bP2, bP3, bP4, b1P5, b2P5;
	int tlP1, tlP2, tlP3, tlP4, tlP5;
	int warz1, warz2, warz3, warz4, warz5, warz6, warz7, warz8, warz9, warz10, warz11;	
	int ileWarzyw1, ileWarzyw2, ileWarzyw3, ileWarzyw4;
	String P1, P2, P3, P4, P5;
	
	public void setBialkoPosilek1(Product bialkoPosilek1) {
		this.bialkoPosilek1 = bialkoPosilek1;
	}
	
	public void setBialko2Posilek1(Product bialko2Posilek1) {
		this.bialko2Posilek1 = bialko2Posilek1;
	}
	
	public void setBialkoPosilek2(Product bialkoPosilek2) {
		this.bialkoPosilek2 = bialkoPosilek2;
	}
	
	public void setBialkoPosilek3(Product bialkoPosilek3) {
		this.bialkoPosilek3 = bialkoPosilek3;
	}
	
	public void setBialkoPosilek4(Product bialkoPosilek4) {
		this.bialkoPosilek4 = bialkoPosilek4;
	}
	
	public void setBialkoPosilek5(Product bialkoPosilek5) {
		this.bialkoPosilek5 = bialkoPosilek5;
	}
	
	public void setBialko2Posilek5(Product bialko2Posilek5) {
		this.bialko2Posilek5 = bialko2Posilek5;
	}
	
	public void setWeglePosilek1(Product weglePosilek1) {
		this.weglePosilek1 = weglePosilek1;
	}
	
	public void setWeglePosilek2(Product weglePosilek2) {
		this.weglePosilek2 = weglePosilek2;
	}
	
	public void setWeglePosilek3(Product weglePosilek3) {
		this.weglePosilek3 = weglePosilek3;
	}
	
	public void setWeglePosilek4(Product weglePosilek4) {
		this.weglePosilek4 = weglePosilek4;
	}
	
	public void setTluszczePosilek1(Product tluszczePosilek1) {
		this.tluszczePosilek1 = tluszczePosilek1;
	}
	
	public void setTluszczePosilek2(Product tluszczePosilek2) {
		this.tluszczePosilek2 = tluszczePosilek2;
	}
	
	public void setTluszczePosilek3(Product tluszczePosilek3) {
		this.tluszczePosilek3 = tluszczePosilek3;
	}
	
	public void setTluszczePosilek4(Product tluszczePosilek4) {
		this.tluszczePosilek4 = tluszczePosilek4;
	}
	
	public void setTluszczePosilek5(Product tluszczePosilek5) {
		this.tluszczePosilek5 = tluszczePosilek5;
	}
		
	public void setWarzywaPosilek1(Product warzywaPosilek1) {
		this.warzywaPosilek1 = warzywaPosilek1;
	}
	
	public void setWarzywa2Posilek1(Product warzywa2Posilek1) {
		this.warzywa2Posilek1 = warzywa2Posilek1;
	}
	
	public void setWarzywaPosilek2(Product warzywaPosilek2) {
		this.warzywaPosilek2 = warzywaPosilek2;
	}
	
	public void setWarzywa2Posilek2(Product warzywa2Posilek2) {
		this.warzywa2Posilek2 = warzywa2Posilek2;
	}
	
	public void setWarzywaPosilek3(Product warzywaPosilek3) {
		this.warzywaPosilek3 = warzywaPosilek3;
	}
	
	public void setWarzywa2Posilek3(Product warzywa2Posilek3) {
		this.warzywa2Posilek3 = warzywa2Posilek3;
	}
	
	public void setWarzywaPosilek4(Product warzywaPosilek4) {
		this.warzywaPosilek4 = warzywaPosilek4;
	}
	
	public void setWarzywa2Posilek4(Product warzywa2Posilek4) {
		this.warzywa2Posilek4 = warzywa2Posilek4;
	}
	
	public void setWarzywaPosilek5(Product warzywaPosilek5) {
		this.warzywaPosilek5 = warzywaPosilek5;
	}
	
	public void setWarzywa2Posilek5(Product warzywa2Posilek5) {
		this.warzywa2Posilek5 = warzywa2Posilek5;
	}
	
	public void setWarzywa3Posilek5(Product warzywa3Posilek5) {
		this.warzywa3Posilek5 = warzywa3Posilek5;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void rozpiszDiete() throws FileNotFoundException {
				
				Zapotrzebowanie uzytkownik = new Zapotrzebowanie();
				
				try {
					uzytkownik.odczytPlikTxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				ileWarzyw1 = 150;
				ileWarzyw2 = 25;
				ileWarzyw3 = 100;
				ileWarzyw4 = 150;
				int iloscPosilkow = 5;
				int ilebialko = (int)uzytkownik.getWaga() * 2;
				int iletluszczy = (int)((uzytkownik.getZapotrzebowanie()* 0.3)/9);
				int ilewegli = (int)(uzytkownik.getZapotrzebowanie() - ((ilebialko*4)+(iletluszczy*9)))/4;
				int ileBialkoPosilek = ilebialko / iloscPosilkow;
				int ileTluszczyPosilek = iletluszczy / iloscPosilkow;
				int ileWegliPosilek = ilewegli / (iloscPosilkow-1);
				
				//Posiłek2
				double bialkoP2;
				double wegleP2;
				double tluszczeP2;
				double blonnikP2;
				
				double wegleWarzywaP2 = (warzywaPosilek2.getWeglowodany()/100)*ileWarzyw1;
				double bialkoWarzywaP2 = (warzywaPosilek2.getBialko()/100)*ileWarzyw1;
				double tluszczeWarzywaP2 = (warzywaPosilek2.getTluszcze()/100)*ileWarzyw1;
				double blonnikWarzywaP2 = (warzywaPosilek2.getBlonnik()/100)*ileWarzyw1;
				
				double wegleWarzywa2P2 = (warzywa2Posilek2.getWeglowodany()/100)*ileWarzyw2;
				double bialkoWarzywa2P2 = (warzywa2Posilek2.getBialko()/100)*ileWarzyw2;
				double tluszczeWarzywa2P2 = (warzywa2Posilek2.getTluszcze()/100)*ileWarzyw2;
				double blonnikWarzywa2P2 = (warzywa2Posilek2.getBlonnik()/100)*ileWarzyw2;
				
				double wegleproduktP2wegle = addBlonnik(weglePosilek2);
				double wegleproduktP2bialko = weglePosilek2.getBialko()/100;
				double wegleproduktP2tluszcze = weglePosilek2.getTluszcze()/100;
				
				double bialkoproduktP2bialko = bialkoPosilek2.getBialko()/100;
				double bialkoproduktP2tluszcze = bialkoPosilek2.getTluszcze()/100;
				double bialkoproduktP2blonnik = bialkoPosilek2.getBlonnik()/100;
				
				double tluszczeproduktP2tluszcze = tluszczePosilek2.getTluszcze()/100;
				double tluszczeproduktP2blonnik = tluszczePosilek2.getBlonnik()/100;
		
				wegleP2 = (ileWegliPosilek -(wegleWarzywaP2 + wegleWarzywa2P2))/wegleproduktP2wegle;
				bialkoP2 = (ileBialkoPosilek - (bialkoWarzywaP2 + bialkoWarzywa2P2 + (wegleproduktP2bialko*(int)zaokraglanie(wegleP2))))/bialkoproduktP2bialko;
				tluszczeP2 = (ileTluszczyPosilek - (tluszczeWarzywaP2 + tluszczeWarzywa2P2 + (wegleproduktP2tluszcze*(int)zaokraglanie(wegleP2))
						+ (bialkoproduktP2tluszcze*(int)zaokraglanie(bialkoP2))))/tluszczeproduktP2tluszcze;
				blonnikP2 = blonnikWarzywaP2 + blonnikWarzywa2P2 + (bialkoproduktP2blonnik*bialkoP2) + (tluszczeproduktP2blonnik*tluszczeP2);
				
				wegleP2 = (int)zaokraglanie(wegleP2);
				bialkoP2 = (int)zaokraglanie(bialkoP2);
				tluszczeP2 = Math.round(tluszczeP2); 
				
				wwP2 = (int)wegleP2;
				bP2 = (int)bialkoP2;
				tlP2 = (int)tluszczeP2;		
						
				//Posiłek 3:					
				double bialkoP3;
				double wegleP3;
				double tluszczeP3;
				double blonnikP3;
				
				double wegleWarzywaP3 = (warzywaPosilek3.getWeglowodany()/100)*ileWarzyw1;
				double bialkoWarzywaP3 = (warzywaPosilek3.getBialko()/100)*ileWarzyw1;
				double tluszczeWarzywaP3 = (warzywaPosilek3.getTluszcze()/100)*ileWarzyw1;
				double blonnikWarzywaP3 = (warzywaPosilek3.getBlonnik()/100)*ileWarzyw1;
				
				double wegleWarzywa2P3 = (warzywa2Posilek3.getWeglowodany()/100)*ileWarzyw2;
				double bialkoWarzywa2P3 = (warzywa2Posilek3.getBialko()/100)*ileWarzyw2;
				double tluszczeWarzywa2P3 = (warzywa2Posilek3.getTluszcze()/100)*ileWarzyw2;
				double blonnikWarzywa2P3 = (warzywa2Posilek3.getBlonnik()/100)*ileWarzyw2;
				
				double wegleproduktP3wegle = addBlonnik(weglePosilek3);
				double wegleproduktP3bialko = weglePosilek3.getBialko()/100;
				double wegleproduktP3tluszcze = weglePosilek3.getTluszcze()/100;
				
				double bialkoproduktP3bialko = bialkoPosilek3.getBialko()/100;
				double bialkoproduktP3tluszcze = bialkoPosilek3.getTluszcze()/100;
				double bialkoproduktP3blonnik = bialkoPosilek3.getBlonnik()/100;
				
				double tluszczeproduktP3tluszcze = tluszczePosilek3.getTluszcze()/100;
				double tluszczeproduktP3blonnik = tluszczePosilek3.getBlonnik()/100;
				
				wegleP3 = (ileWegliPosilek - (wegleWarzywaP3 + wegleWarzywa2P3))/wegleproduktP3wegle;
				bialkoP3 = (ileBialkoPosilek - (bialkoWarzywaP3 + bialkoWarzywa2P3 + (wegleproduktP3bialko*(int)zaokraglanie(wegleP3))))/bialkoproduktP3bialko;
				tluszczeP3 = (ileTluszczyPosilek - (tluszczeWarzywaP3 + tluszczeWarzywa2P3 + (wegleproduktP3tluszcze*(int)zaokraglanie(wegleP3))
						+ (bialkoproduktP3tluszcze*(int)zaokraglanie(bialkoP3))))/tluszczeproduktP3tluszcze;
				blonnikP3 = blonnikWarzywaP3 + blonnikWarzywa2P3 + (bialkoproduktP3blonnik*bialkoP3) + (tluszczeproduktP3blonnik*tluszczeP3);
				
				wegleP3 = (int)zaokraglanie(wegleP3);
				bialkoP3 = (int)zaokraglanie(bialkoP3);
				tluszczeP3 = Math.round(tluszczeP3); 
				
				wwP3 = (int)wegleP3;
				bP3 = (int)bialkoP3;
				tlP3 = (int)tluszczeP3;		
						
						
				//Posilek 4:					
				double bialkoP4;
				double wegleP4;
				double tluszczeP4;
				double blonnikP4;
				
				double wegleWarzywaP4 = (warzywaPosilek4.getWeglowodany()/100)*ileWarzyw1;
				double bialkoWarzywaP4 = (warzywaPosilek4.getBialko()/100)*ileWarzyw1;
				double tluszczeWarzywaP4 = (warzywaPosilek4.getTluszcze()/100)*ileWarzyw1;
				double blonnikWarzywaP4 = (warzywaPosilek4.getBlonnik()/100)*ileWarzyw1;
				
				double wegleWarzywa2P4 = (warzywa2Posilek4.getWeglowodany()/100)*ileWarzyw2;
				double bialkoWarzywa2P4 = (warzywa2Posilek4.getBialko()/100)*ileWarzyw2;
				double tluszczeWarzywa2P4 = (warzywa2Posilek4.getTluszcze()/100)*ileWarzyw2;
				double blonnikWarzywa2P4 = (warzywa2Posilek4.getBlonnik()/100)*ileWarzyw2;
				
				double wegleproduktP4wegle = addBlonnik(weglePosilek4);
				double wegleproduktP4bialko = weglePosilek4.getBialko()/100;
				double wegleproduktP4tluszcze = weglePosilek4.getTluszcze()/100;
				
				double bialkoproduktP4bialko = bialkoPosilek4.getBialko()/100;
				double bialkoproduktP4tluszcze = bialkoPosilek4.getTluszcze()/100;
				double bialkoproduktP4blonnik = bialkoPosilek4.getBlonnik()/100;
				
				double tluszczeproduktP4tluszcze = tluszczePosilek4.getTluszcze()/100;
				double tluszczeproduktP4blonnik = tluszczePosilek4.getBlonnik()/100;
				
				wegleP4 = (ileWegliPosilek -(wegleWarzywaP4 + wegleWarzywa2P4))/wegleproduktP4wegle;
				bialkoP4 = (ileBialkoPosilek - (bialkoWarzywaP4 + bialkoWarzywa2P4 + (wegleproduktP4bialko*(int)zaokraglanie(wegleP4))))/bialkoproduktP4bialko;
				tluszczeP4 = (ileTluszczyPosilek - (tluszczeWarzywaP4 + tluszczeWarzywa2P4 + (wegleproduktP4tluszcze*(int)zaokraglanie(wegleP4))
						+ (bialkoproduktP4tluszcze*(int)zaokraglanie(bialkoP4))))/tluszczeproduktP4tluszcze;
				blonnikP4 = blonnikWarzywaP4 + blonnikWarzywa2P4 + (bialkoproduktP4blonnik*bialkoP4) + (tluszczeproduktP4blonnik*tluszczeP4);
				
				wegleP4 = (int)zaokraglanie(wegleP4);
				bialkoP4 = (int)zaokraglanie(bialkoP4);
				tluszczeP4 = Math.round(tluszczeP4); 
				
				wwP4 = (int)wegleP4;
				bP4 = (int)bialkoP4;
				tlP4 = (int)tluszczeP4;		
						
				//Posiłek 5:
				double bialko1P5, bialko2P5;
				double wegleP5;
				double tluszczeP5;
				double blonnikP5;
				
				double wegleWarzywaP5 = (warzywaPosilek5.getWeglowodany()/100)*ileWarzyw3;
				double bialkoWarzywaP5 = (warzywaPosilek5.getBialko()/100)*ileWarzyw3;
				double tluszczeWarzywaP5 = (warzywaPosilek5.getTluszcze()/100)*ileWarzyw3;
				double blonnikWarzywaP5 = (warzywaPosilek5.getBlonnik()/100)*ileWarzyw3;
				
				double wegleWarzywa2P5 = (warzywa2Posilek5.getWeglowodany()/100)*ileWarzyw2;
				double bialkoWarzywa2P5 = (warzywa2Posilek5.getBialko()/100)*ileWarzyw2;
				double tluszczeWarzywa2P5 = (warzywa2Posilek5.getTluszcze()/100)*ileWarzyw2;
				double blonnikWarzywa2P5 = (warzywa2Posilek5.getBlonnik()/100)*ileWarzyw2;
				
				double wegleWarzywa3P5 = (warzywa3Posilek5.getWeglowodany()/100)*ileWarzyw3;
				double bialkoWarzywa3P5 = (warzywa3Posilek5.getBialko()/100)*ileWarzyw3;
				double tluszczeWarzywa3P5 = (warzywa3Posilek5.getTluszcze()/100)*ileWarzyw3;
				double blonnikWarzywa3P5 = (warzywa3Posilek5.getBlonnik()/100)*ileWarzyw3;
				
				double bialkoproduktP5wegle = bialkoPosilek5.getWeglowodany()/100;
				double bialkoproduktP5bialko = bialkoPosilek5.getBialko()/100;
				double bialkoproduktP5tluszcze = bialkoPosilek5.getTluszcze()/100;
				double bialkoproduktP5blonnik = bialkoPosilek5.getBlonnik()/100;
				
				double bialkoprodukt2P5wegle = bialko2Posilek5.getWeglowodany()/100;
				double bialkoprodukt2P5bialko = bialko2Posilek5.getBialko()/100;
				double bialkoprodukt2P5tluszcze = bialko2Posilek5.getTluszcze()/100;
				double bialkoprodukt2P5blonnik = bialko2Posilek5.getBlonnik()/100;
				
				double tluszczeproduktP5tluszcze = tluszczePosilek5.getTluszcze()/100;
				double tluszczeproduktP5blonnik = tluszczePosilek5.getBlonnik()/100;
				
				bialko1P5 = ((ileBialkoPosilek/2) - (bialkoWarzywaP5 + bialkoWarzywa2P5+ bialkoWarzywa3P5))/bialkoproduktP5bialko;
				bialko2P5 = (ileBialkoPosilek/2)/bialkoprodukt2P5bialko;
				tluszczeP5 = (ileTluszczyPosilek - (tluszczeWarzywaP5 + tluszczeWarzywa2P5+ tluszczeWarzywa3P5 + (bialkoproduktP5tluszcze*(int)zaokraglanie(bialko1P5))
						+ (bialkoprodukt2P5tluszcze*(int)zaokraglanie(bialko2P5))))/tluszczeproduktP5tluszcze;
				blonnikP5 = blonnikWarzywaP5 + blonnikWarzywa2P5+ blonnikWarzywa3P5 + (bialkoproduktP5blonnik*bialko1P5) + (bialkoprodukt2P5blonnik*bialko2P5) 
						+ (tluszczeproduktP5blonnik*tluszczeP5);
				wegleP5 = wegleWarzywaP5 + wegleWarzywa2P5 + wegleWarzywa3P5 + (bialkoproduktP5wegle*(int)zaokraglanie(bialko1P5))
						+ (bialkoprodukt2P5wegle*(int)zaokraglanie(bialko2P5));
				
				bialko1P5 = (int)zaokraglanie(bialko1P5);
				bialko2P5 = (int)zaokraglanie(bialko2P5);
				tluszczeP5 = Math.round(tluszczeP5); 
				
			
				b1P5 = (int)bialko1P5;
				b2P5 = (int)bialko2P5;
				tlP5 = (int)tluszczeP5;		
						
						
				// Posiłek 1:
				double bialko1P1, bialko2P1;
				double wegleP1;
				double tluszczeP1;
				
				double wegleWarzywaP1 = (warzywaPosilek1.getWeglowodany()/100)*ileWarzyw1;
				double bialkoWarzywaP1 = (warzywaPosilek1.getBialko()/100)*ileWarzyw1;
				double tluszczeWarzywaP1 = (warzywaPosilek1.getTluszcze()/100)*ileWarzyw1;
				
				double wegleWarzywa2P1 = (warzywa2Posilek1.getWeglowodany()/100)*ileWarzyw2;
				double bialkoWarzywa2P1 = (warzywa2Posilek1.getBialko()/100)*ileWarzyw2;
				double tluszczeWarzywa2P1 = (warzywa2Posilek1.getTluszcze()/100)*ileWarzyw2;
				
				double wegleproduktP1wegle = addBlonnik(weglePosilek1); 
				double wegleproduktP1bialko = weglePosilek1.getBialko()/100;
				double wegleproduktP1tluszcze = weglePosilek1.getTluszcze()/100;
				
				double bialkoproduktP1bialko = bialkoPosilek1.getBialko()/100;
				double bialkoproduktP1tluszcze = bialkoPosilek1.getTluszcze()/100;
				
				double bialkoprodukt2P1bialko = bialko2Posilek1.getBialko()/100;
				double bialkoprodukt2P1tluszcze = bialko2Posilek1.getTluszcze()/100;
				
				double tluszczeproduktP1tluszcze = tluszczePosilek1.getTluszcze()/100;
				double kalorieBlonnik = ((blonnikP2 + blonnikP3 + blonnikP4 + blonnikP5) * 2)/4;
				double ileWegliPosilek1 = ileWegliPosilek - (wegleP5 + kalorieBlonnik );
				
				wegleP1 = ((int)ileWegliPosilek1 -(wegleWarzywaP1 + wegleWarzywa2P1))/wegleproduktP1wegle;
				bialko1P1 = ((ileBialkoPosilek/4) - (bialkoWarzywaP1 + bialkoWarzywa2P1 ))/bialkoproduktP1bialko;
				bialko2P1 = ((ileBialkoPosilek/4)*3 - (wegleproduktP1bialko*(int)zaokraglanie(wegleP1)))/bialkoprodukt2P1bialko;
				tluszczeP1 = (ileTluszczyPosilek - (tluszczeWarzywaP1 + tluszczeWarzywa2P1 + (wegleproduktP1tluszcze*(int)zaokraglanie(wegleP1))
						+ (bialkoproduktP1tluszcze*(int)zaokraglanie(bialko1P1))
						+ (bialkoprodukt2P1tluszcze*(int)zaokraglanie(bialko2P1))))/tluszczeproduktP1tluszcze;
				
				wegleP1 = (int)zaokraglanie(wegleP1);
				bialko1P1 = (int)zaokraglanie(bialko1P1);
				bialko2P1 = (int)zaokraglanie(bialko2P1);
				tluszczeP1 = Math.round(tluszczeP1);
				
				wwP1 = (int)wegleP1;
				b1P1 = (int)bialko1P1; 
				b2P1 = (int)bialko2P1;
				tlP1 = (int)tluszczeP1;					
	}
	
	public void zapiszDoTxt() throws IOException {
		
				PrintWriter zapisz = new PrintWriter(plik);
				zapisz.println("Posi\u0142ek 1: ");
				zapisz.println(weglePosilek1.getNazwa()+": ");
				zapisz.println(wwP1);
				zapisz.println(bialkoPosilek1.getNazwa()+": ");
				zapisz.println(b1P1);
				zapisz.println(bialko2Posilek1.getNazwa()+": ");
				zapisz.println(b2P1);
				zapisz.println(tluszczePosilek1.getNazwa()+": ");
				zapisz.println(tlP1);
				zapisz.println(warzywaPosilek1.getNazwa()+": ");
				zapisz.println(ileWarzyw1);
				zapisz.println(warzywa2Posilek1.getNazwa()+": ");
				zapisz.println(ileWarzyw2);
				zapisz.println("Posi\u0142ek 2: ");
				zapisz.println(weglePosilek2.getNazwa()+": ");
				zapisz.println(wwP2);
				zapisz.println(bialkoPosilek2.getNazwa()+": ");
				zapisz.println(+bP2);
				zapisz.println(tluszczePosilek2.getNazwa()+": ");
				zapisz.println(tlP2);
				zapisz.println(warzywaPosilek2.getNazwa()+": ");
				zapisz.println(ileWarzyw1);
				zapisz.println(warzywa2Posilek2.getNazwa()+": ");
				zapisz.println(ileWarzyw2);
				zapisz.println("Posi\u0142ek 3: ");
				zapisz.println(weglePosilek3.getNazwa()+": ");
				zapisz.println(wwP3);
				zapisz.println(bialkoPosilek3.getNazwa()+": ");
				zapisz.println(+bP3);
				zapisz.println(tluszczePosilek3.getNazwa()+": ");
				zapisz.println(tlP3);
				zapisz.println(warzywaPosilek3.getNazwa()+": ");
				zapisz.println(ileWarzyw1);
				zapisz.println(warzywa2Posilek3.getNazwa()+": ");
				zapisz.println(ileWarzyw2);
				zapisz.println("Posi\u0142ek 4: ");
				zapisz.println(weglePosilek4.getNazwa()+": ");
				zapisz.println(wwP4);
				zapisz.println(bialkoPosilek4.getNazwa()+": ");
				zapisz.println(+bP4);
				zapisz.println(tluszczePosilek4.getNazwa()+": ");
				zapisz.println(tlP4);
				zapisz.println(warzywaPosilek4.getNazwa()+": ");
				zapisz.println(ileWarzyw1);
				zapisz.println(warzywa2Posilek4.getNazwa()+": ");
				zapisz.println(ileWarzyw2);
				zapisz.println("Posi\u0142ek 5: ");
				zapisz.println(bialkoPosilek5.getNazwa()+": ");
				zapisz.println(b1P5);
				zapisz.println(bialko2Posilek5.getNazwa()+": ");
				zapisz.println(b2P5);
				zapisz.println(tluszczePosilek5.getNazwa()+": ");
				zapisz.println(tlP5);
				zapisz.println(warzywaPosilek5.getNazwa()+": ");
				zapisz.println(ileWarzyw4);
				zapisz.println(warzywa2Posilek5.getNazwa()+": ");
				zapisz.println(ileWarzyw2);
				zapisz.println(warzywa3Posilek5.getNazwa()+": ");
				zapisz.println(ileWarzyw3);
				zapisz.close();		
	}
	
	public void zapiszDoPDF() throws IOException {
		
				Zapotrzebowanie uzytkownik = new Zapotrzebowanie();
				try {
					uzytkownik.odczytPlikTxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
							
				PdfWriter pdfwriter = new PdfWriter(path);
				PdfDocument pdfdocument = new PdfDocument(pdfwriter);
				Paragraph naglowek = new Paragraph("Tw\u00F3j Dietetyk")
							  .setMarginLeft(15f)
							  .setMarginTop(5f);
				
				pdfdocument.addNewPage();
				Document document = new Document(pdfdocument);
				pdfdocument.setDefaultPageSize(PageSize.A4);
				float col = 560f;
				float columnSzerokosc[] = {col};
				
				Table tabelaNaglowek = new Table(columnSzerokosc)
							  .setBorder(Border.NO_BORDER)
							  .setBackgroundColor(new DeviceRgb(107, 171, 255))
							  .setFontColor(new DeviceRgb(255, 255, 255))
							  .setHeight(70f);
				
				PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA, "ISO-8859-2", false);
				Text text1 = new Text("- przez \u017Co\u0142\u0105dek do formy!")
							  .setFont(font)
							  .setFontSize(13f)
						      .setItalic();									  
								
				Paragraph naglowek2 = new Paragraph(text1)
							  .setMarginRight(15f)											 
							  .setMarginLeft(30f)
							  .setBorder(Border.NO_BORDER);		
				
				Paragraph dietaInfo = new Paragraph("Dieta: ")
							  .setFont(font)
							  .setMarginLeft(5f)
							  .setMarginTop(5f)
							  .setItalic();

				Paragraph imie = new Paragraph("Imi\u0119: ")
							  .setFont(font)
							  .setMarginLeft(15f);
				
				Paragraph imieUzytkownika = new Paragraph(uzytkownik.getImie())
							  .setFont(font)
							  .setBold()
							  .setFontColor(new DeviceRgb(107, 171, 255));	
				
				Paragraph cel = new Paragraph("Cel: ")
							  .setFont(font)
							  .setMarginLeft(15f);
				
				Paragraph celUzytkownika = new Paragraph(uzytkownik.getCel())
							  .setFont(font)
							  .setBold()
							  .setFontColor(new DeviceRgb(107, 171, 255));	
				
				Paragraph waga = new Paragraph("Waga: ")
							  .setFont(font)
							  .setMarginLeft(15f);
				
				Paragraph wagaUzytkownika = new Paragraph(""+(int)uzytkownik.getWaga()+"kg")
							  .setFont(font)
							  .setBold()
							  .setFontColor(new DeviceRgb(107, 171, 255));	
				
				Paragraph kalorie = new Paragraph("Kalorie: ")
							  .setFont(font)
							  .setMarginLeft(15f);
				
				Paragraph kalorieUzytkownika = new Paragraph(""+(int)uzytkownik.getZapotrzebowanie()+" kcal")
							  .setFont(font)
							  .setBold()
							  .setFontColor(new DeviceRgb(107, 171, 255));	
				
				Paragraph sniadanie = new Paragraph("\u015Aniadanie: ")
							  .setFont(font)
							  .setMarginLeft(5f)
							  .setMarginTop(5f)
							  .setItalic();

				Paragraph sniadanie2 = new Paragraph("\u015Aniadanie II: ")
							  .setFont(font)
							  .setMarginLeft(5f)
							  .setMarginTop(5f)
							  .setItalic();					   
				
				Paragraph obiad = new Paragraph("Obiad: ")
							  .setFont(font)
							  .setMarginLeft(5f)
							  .setMarginTop(5f)
							  .setItalic();
				
				Paragraph podwieczorek = new Paragraph("Podwieczorek: ")
							  .setFont(font)
							  .setMarginLeft(5f)
							  .setMarginTop(5f)
							  .setItalic();				
				
				Paragraph kolacja = new Paragraph("Kolacja: ")
							  .setFont(font)
							  .setMarginLeft(5f)
							  .setMarginTop(5f)
							  .setItalic();	  
				
				Paragraph produkt = new Paragraph("Produkt: ")
							  .setFont(font);	
				
				Paragraph gramatura = new Paragraph("Ilo\u015B\u0107: ")
							  .setFont(font);
				
				Paragraph weglowodanyP1nazwa = new Paragraph(weglePosilek1.getNazwa())
							  .setFont(font);
				
				Paragraph weglowodanyP1gram = new Paragraph(""+wwP1+"g")
							  .setFont(font);	
				
				Paragraph bialkoP1nazwa = new Paragraph(bialkoPosilek1.getNazwa())
							  .setFont(font);
				
				Paragraph bialkoP1gram = new Paragraph(""+b1P1+"g")
						      .setFont(font);
				
				Paragraph bialko2P1nazwa = new Paragraph(bialko2Posilek1.getNazwa())
							  .setFont(font);
				
				Paragraph bialko2P1gram = new Paragraph(""+b2P1+"g")
							  .setFont(font);
				
				Paragraph tluszczeP1nazwa = new Paragraph(tluszczePosilek1.getNazwa())
							  .setFont(font);
				
				Paragraph tluszczeP1gram = new Paragraph(""+tlP1+"g")
							  .setFont(font);
				
				Paragraph warzywaP1nazwa = new Paragraph(warzywaPosilek1.getNazwa())
							  .setFont(font);
				
				Paragraph warzywaP1gram = new Paragraph(""+ileWarzyw1+"g")
							  .setFont(font);
				
				Paragraph warzywa2P1nazwa = new Paragraph(warzywa2Posilek1.getNazwa())
							  .setFont(font);
				
				Paragraph warzywa2P1gram = new Paragraph(""+ileWarzyw2+"g")
							  .setFont(font);
				
				Paragraph weglowodanyP2nazwa = new Paragraph(weglePosilek2.getNazwa())
							  .setFont(font);
				
				Paragraph weglowodanyP2gram = new Paragraph(""+wwP2+"g")
							  .setFont(font);
				
				Paragraph bialkoP2nazwa = new Paragraph(bialkoPosilek2.getNazwa())
							  .setFont(font);
				
				Paragraph bialkoP2gram = new Paragraph(""+bP2+"g")
							  .setFont(font);
				
				Paragraph tluszczeP2nazwa = new Paragraph(tluszczePosilek2.getNazwa())
							  .setFont(font);
				
				Paragraph tluszczeP2gram = new Paragraph(""+tlP2+"g")
							  .setFont(font);
				
				Paragraph warzywaP2nazwa = new Paragraph(warzywaPosilek2.getNazwa())
							  .setFont(font);
				
				Paragraph warzywaP2gram = new Paragraph(""+ileWarzyw1+"g")
							  .setFont(font);
				
				Paragraph warzywa2P2nazwa = new Paragraph(warzywa2Posilek2.getNazwa())
							  .setFont(font);
				
				Paragraph warzywa2P2gram = new Paragraph(""+ileWarzyw2+"g")
							  .setFont(font);
				
				Paragraph weglowodanyP3nazwa = new Paragraph(weglePosilek3.getNazwa())
							  .setFont(font);
				
				Paragraph weglowodanyP3gram = new Paragraph(""+wwP3+"g")
						      .setFont(font);
				
				Paragraph bialkoP3nazwa = new Paragraph(bialkoPosilek3.getNazwa())
							  .setFont(font);
				
				Paragraph bialkoP3gram = new Paragraph(""+bP3+"g")
							  .setFont(font);
				
				Paragraph tluszczeP3nazwa = new Paragraph(tluszczePosilek3.getNazwa())
							  .setFont(font);
				
				Paragraph tluszczeP3gram = new Paragraph(""+tlP3+"g")
							  .setFont(font);
				
				Paragraph warzywaP3nazwa = new Paragraph(warzywaPosilek3.getNazwa())
							  .setFont(font);
				
				Paragraph warzywaP3gram = new Paragraph(""+ileWarzyw1+"g")
							  .setFont(font);
				
				Paragraph warzywa2P3nazwa = new Paragraph(warzywa2Posilek3.getNazwa())
							  .setFont(font);
				
				Paragraph warzywa2P3gram = new Paragraph(""+ileWarzyw2+"g")
							  .setFont(font);
				
				Paragraph weglowodanyP4nazwa = new Paragraph(weglePosilek4.getNazwa())
							  .setFont(font);
				
				Paragraph weglowodanyP4gram = new Paragraph(""+wwP4+"g")
							  .setFont(font);
				
				Paragraph bialkoP4nazwa = new Paragraph(bialkoPosilek4.getNazwa())
							  .setFont(font);
				
				Paragraph bialkoP4gram = new Paragraph(""+bP4+"g")
							  .setFont(font);
				
				Paragraph tluszczeP4nazwa = new Paragraph(tluszczePosilek4.getNazwa())
							  .setFont(font);
				
				Paragraph tluszczeP4gram = new Paragraph(""+tlP4+"g")
							  .setFont(font);
				
				Paragraph warzywaP4nazwa = new Paragraph(warzywaPosilek4.getNazwa())
							  .setFont(font);
				
				Paragraph warzywaP4gram = new Paragraph(""+ileWarzyw1+"g")
							  .setFont(font);
				
				Paragraph warzywa2P4nazwa = new Paragraph(warzywa2Posilek4.getNazwa())
							  .setFont(font);
				
				Paragraph warzywa2P4gram = new Paragraph(""+ileWarzyw2+"g")
							  .setFont(font);
				
				Paragraph bialkoP5nazwa = new Paragraph(bialkoPosilek5.getNazwa())
							  .setFont(font);
				
				Paragraph bialkoP5gram = new Paragraph(""+b1P5+"g")
							  .setFont(font);
				
				Paragraph bialko2P5nazwa = new Paragraph(bialko2Posilek5.getNazwa())
							  .setFont(font);
				
				Paragraph bialko2P5gram = new Paragraph(""+b2P5+"g")
							  .setFont(font);
				
				Paragraph tluszczeP5nazwa = new Paragraph(tluszczePosilek5.getNazwa())
							  .setFont(font);
				
				Paragraph tluszczeP5gram = new Paragraph(""+tlP5+"g")
							  .setFont(font);
				
				Paragraph warzywaP5nazwa = new Paragraph(warzywaPosilek5.getNazwa())
							  .setFont(font);
				
				Paragraph warzywaP5gram = new Paragraph(""+ileWarzyw3+"g")
							  .setFont(font);
				
				Paragraph warzywa2P5nazwa = new Paragraph(warzywa2Posilek5.getNazwa())
							  .setFont(font);
				
				Paragraph warzywa2P5gram = new Paragraph(""+ileWarzyw2+"g")
							  .setFont(font);
				
				Paragraph warzywa3P5nazwa = new Paragraph(warzywa3Posilek5.getNazwa())
							  .setFont(font);
				
				Paragraph warzywa3P5gram = new Paragraph(""+ileWarzyw3+"g")
							  .setFont(font);
				
				float dietaTabelaSzerokosc[] = {140, 140};
				float colSzer[] = {80, 100, 100, 80};
				Table infoDieta = new Table(colSzer);
				Table dietaTabela = new Table(dietaTabelaSzerokosc)
							  .setHorizontalAlignment(HorizontalAlignment.CENTER);	
				
				Table dietaTabela2 = new Table(dietaTabelaSzerokosc)
							  .setHorizontalAlignment(HorizontalAlignment.CENTER);
				
				Table dietaTabela3 = new Table(dietaTabelaSzerokosc)
							  .setHorizontalAlignment(HorizontalAlignment.CENTER);	
				
				Table dietaTabela4 = new Table(dietaTabelaSzerokosc)
							  .setHorizontalAlignment(HorizontalAlignment.CENTER);
				
				Table dietaTabela5 = new Table(dietaTabelaSzerokosc)
							  .setHorizontalAlignment(HorizontalAlignment.CENTER);
							
				float dietaTabela2Szerokosc[] = {280, 280};
				float dietaTabela3Szerokosc[] = {560};
				Table dietaTabelaGlowna = new Table(dietaTabela2Szerokosc);
				Table dietaTabelaGlowna2 = new Table(dietaTabela3Szerokosc);
				Paragraph podziekowania = new Paragraph("Dzi\u0119kujemy za korzystanie z naszej aplikacji!!").setFont(font)
						 																					  .setMarginTop(30f);
				Table dietaTabelaGlowna3 = new Table(dietaTabela3Szerokosc);
				
				tabelaNaglowek.addCell(new Cell().add(naglowek)
												 .setBorder(Border.NO_BORDER)
												 .setTextAlignment(TextAlignment.LEFT)
												 .setVerticalAlignment(VerticalAlignment.MIDDLE)
												 .setMarginTop(30f)
												 .setMarginBottom(30f)
												 .setMarginLeft(30f)
												 .setMarginRight(30f)
												 .setFontSize(22f));  
				
				tabelaNaglowek.addCell(new Cell().add(naglowek2)
												 .setBorder(Border.NO_BORDER)
												 .setTextAlignment(TextAlignment.RIGHT)
												 .setMarginTop(30f)
												 .setMarginBottom(30f)
												 .setMarginLeft(30f)
												 .setMarginRight(30f));
									
				infoDieta.addCell(new Cell(0, 4).add(dietaInfo)
												.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(imie)
						 					.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(imieUzytkownika)
											.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(cel)
											.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(celUzytkownika)
											.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(waga)
											.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(wagaUzytkownika)
											.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(kalorie)
											.setBorder(Border.NO_BORDER));
				
				infoDieta.addCell(new Cell().add(kalorieUzytkownika)
											.setBorder(Border.NO_BORDER));
				
				
				
				
				dietaTabela.addCell(new Cell(0, 4).add(sniadanie)
						   						  .setBorder(Border.NO_BORDER));
				
				dietaTabela.addCell(new Cell().add(produkt)
											  .setFontColor(new DeviceRgb(255, 255, 255))
											  .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela.addCell(new Cell().add(gramatura)
											  .setFontColor(new DeviceRgb(255, 255, 255))
				  							  .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela.addCell(new Cell().add(weglowodanyP1nazwa)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(weglowodanyP1gram)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(bialkoP1nazwa)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(bialkoP1gram)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(bialko2P1nazwa)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(bialko2P1gram)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(tluszczeP1nazwa)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(tluszczeP1gram)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(warzywaP1nazwa)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(warzywaP1gram)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(warzywa2P1nazwa)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela.addCell(new Cell().add(warzywa2P1gram)
											  .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell(0, 4).add(sniadanie2)
							  					   .setBorder(Border.NO_BORDER));
				
				dietaTabela2.addCell(new Cell().add(produkt)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela2.addCell(new Cell().add(gramatura)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela2.addCell(new Cell().add(weglowodanyP2nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(weglowodanyP2gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(bialkoP2nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(bialkoP2gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(tluszczeP2nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(tluszczeP2gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(warzywaP2nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(warzywaP2gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(warzywa2P2nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela2.addCell(new Cell().add(warzywa2P2gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell(0, 4).add(obiad)
							  					   .setBorder(Border.NO_BORDER));
				
				dietaTabela3.addCell(new Cell().add(produkt)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela3.addCell(new Cell().add(gramatura)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela3.addCell(new Cell().add(weglowodanyP3nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(weglowodanyP3gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(bialkoP3nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(bialkoP3gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(tluszczeP3nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(tluszczeP3gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(warzywaP3nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(warzywaP3gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(warzywa2P3nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela3.addCell(new Cell().add(warzywa2P3gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell(0, 4).add(podwieczorek)
							  					   .setBorder(Border.NO_BORDER));
				
				dietaTabela4.addCell(new Cell().add(produkt)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela4.addCell(new Cell().add(gramatura)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela4.addCell(new Cell().add(weglowodanyP4nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(weglowodanyP4gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(bialkoP4nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(bialkoP4gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(tluszczeP4nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(tluszczeP4gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(warzywaP4nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(warzywaP4gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(warzywa2P4nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela4.addCell(new Cell().add(warzywa2P4gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell(0, 4).add(kolacja)
							  					   .setBorder(Border.NO_BORDER));
				
				dietaTabela5.addCell(new Cell().add(produkt)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela5.addCell(new Cell().add(gramatura)
											   .setFontColor(new DeviceRgb(255, 255, 255))
											   .setBackgroundColor(new DeviceRgb(107, 171, 255)));
				
				dietaTabela5.addCell(new Cell().add(bialkoP5nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(bialkoP5gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(bialko2P5nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(bialko2P5gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(tluszczeP5nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(tluszczeP5gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(warzywaP5nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(warzywaP5gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(warzywa2P5nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(warzywa2P5gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(warzywa3P5nazwa)
											   .setTextAlignment(TextAlignment.CENTER));
				
				dietaTabela5.addCell(new Cell().add(warzywa3P5gram)
											   .setTextAlignment(TextAlignment.CENTER));
				
			
				
				dietaTabelaGlowna.addCell(new Cell().add(dietaTabela)
													.setBorder(Border.NO_BORDER));
				
				dietaTabelaGlowna.addCell(new Cell().add(dietaTabela2)
													.setBorder(Border.NO_BORDER));
				
				dietaTabelaGlowna.addCell(new Cell().add(dietaTabela3)
													.setBorder(Border.NO_BORDER));
				
				dietaTabelaGlowna.addCell(new Cell().add(dietaTabela4)
													.setBorder(Border.NO_BORDER));
				
				dietaTabelaGlowna2.addCell(new Cell().add(dietaTabela5)
													 .setBorder(Border.NO_BORDER));
				
				dietaTabelaGlowna3.addCell(new Cell().add(podziekowania)
												     .setBorder(Border.NO_BORDER)
												     .setTextAlignment(TextAlignment.CENTER)
													 .setMarginTop(30f)
													 .setItalic());					
				
			
				document.add(tabelaNaglowek);
				document.add(infoDieta);
				document.add(dietaTabelaGlowna);
				document.add(dietaTabelaGlowna2);
				document.add(dietaTabelaGlowna3);
				document.close();
				String cmds[] = new String[] {"cmd", "/c", path};
				try {
				    Runtime.getRuntime().exec(cmds);
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public double zaokraglanie(double liczba) {
		double l = (Math.round(liczba/10))*10;
		return l;
	}

	public double addBlonnik (Product produkt) {
		double ww;
		ww = (produkt.getWeglowodany()+((produkt.getBlonnik()*2)/4))/100; 
		return ww;
	}
	
}
