package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.ServiceDb;
import application.Zapotrzebowanie;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
public Controller() {
		
	}
	ServiceDb service = new ServiceDb();
	Zapotrzebowanie uzytkownik = new Zapotrzebowanie();
	Diet dieta = new Diet();
	ObservableList<String> listaCelow = FXCollections.observableArrayList("Redukcja", "Masa", "Utrzymanie masy");
	ObservableList<String> listaIloscTreningow = FXCollections.observableArrayList("0", "1", "2", "3", "4", "5");
	ObservableList<String> listaPlec = FXCollections.observableArrayList("Kobieta", "Mezczyzna");
	ObservableList<String> rodzajePracy = FXCollections.observableArrayList("Praca siedzaca, bardzo malo ruchu",
    		"Praca stojaca", "Praca stojaca, duzo ruchu", "Praca fizyczna(np. na budowie)");
	ObservableList<String> problemDietaRedukcja = FXCollections.observableArrayList("Za szybko chudn\u0119",
    		"Waga stoi w miejscu", "Przyty\u0142em");
    ObservableList<String> problemDietaMasa = FXCollections.observableArrayList("Za szybko przybieram",
    		"Waga stoi w miejscu", "Schud\u0142em");
    ObservableList<String> problemDietaUtrzymanieMasy = FXCollections.observableArrayList("Schud\u0142em", "Przyty\u0142em");
    
    ObservableList<String> produktyBialkowe;
	ObservableList<String> produktyBialkowe2;
	ObservableList<String> produktyWeglowodanowe;
	ObservableList<String> produktyTluszczowe;
	ObservableList<String> produktyWarzywne;
	ObservableList<String> produktyWarzywne2;
	ObservableList<String> produktyWarzywne3;
	ObservableList<String> produktyWarzywne4;
	
	Product [] produktyBialkoweDB = new Product[ServiceDb.getListaProduktyBialkowe().size()];
	Product [] produktyBialkoweInneDB = new Product[ServiceDb.getListaProduktyBialkoweInne().size()];
	Product [] produktyWeglowodanoweDB = new Product[ServiceDb.getListaProduktyWeglowodanowe().size()];
	Product [] produktyTluszczoweDB = new Product[ServiceDb.getListaProduktyTluszczowe().size()];
	Product [] produktyWarzywaDuzaPorcjaDB = new Product[ServiceDb.getListaWarzywaDuzaPorcja().size()];
	Product [] produktyWarzywaSredniaPorcjaDB = new Product[ServiceDb.getListaWarzywaSredniaPorcja().size()];
	Product [] produktyWarzywaMalaPorcjaDB = new Product[ServiceDb.getListaWarzywaMalaPorcja().size()];
	
	List<String> produktyBialkoweLista = new ArrayList<String>();
	List<String> produktyWeglowodanoweLista = new ArrayList<String>();
	List<String> produktyTluszczoweLista = new ArrayList<String>();
	List<String> produktyWarzywaDuzaPorcjaLista = new ArrayList<String>();
	List<String> produktyWarzywaSredniaPorcjaLista = new ArrayList<String>();
	List<String> produktyWarzywaMalaPorcjaLista = new ArrayList<String>();
	List<String> produktyWarzywaDuzaLista = new ArrayList<String>();
    @FXML
    private Button autorPrzycisk;

    @FXML
    private Button modyfikacjaPrzycisk;

    @FXML
    private HBox oknoGlowne;

    @FXML
    private HBox oknoUzytkownika;

    @FXML
    private Button rozpiszDietePrzycisk;

    @FXML
    private Button twojeDanePrzycisk;

    @FXML
    private Button wlasnyJadlospisPrzycisk;
    
    @FXML
    private ChoiceBox<String> cel = new ChoiceBox<>(listaCelow);

    @FXML
    private ChoiceBox<String> iloscTreningow = new ChoiceBox<>(listaIloscTreningow);

    @FXML
    private TextField imie;

    @FXML
    private ChoiceBox<String> plec = new ChoiceBox<>(listaPlec);
    
    @FXML
    private ChoiceBox<String> praca = new ChoiceBox<>(rodzajePracy);
    
    @FXML
    private TextField waga;
    
    @FXML
    private TextField wiek;

    @FXML
    private TextField wzrost;

    @FXML
    private Button zapiszPrzycisk;
    
    @FXML
    private VBox oknoglowne;
    
    @FXML
    private Label powitalnyLabel = new Label("Witaj, "+ uzytkownik.getImie());
    @FXML
    private Label celLabel = new Label("Witaj, "+ uzytkownik.getCel());
    @FXML
    private Label wagaLabel = new Label("Witaj, "+ uzytkownik.getWaga());
    @FXML
    private Label wzrostLabel = new Label("Witaj, "+ uzytkownik.getWzrost());
    @FXML
    private Label kalorieLabel = new Label("Witaj, "+ uzytkownik.getZapotrzebowanie());
        
    @FXML
    private ChoiceBox<String> problemDieta = new ChoiceBox<>(problemDietaRedukcja);
	@FXML
    private ChoiceBox<String> weglowodanySniadanie = new ChoiceBox<>(produktyWeglowodanowe);
	@FXML
    private ChoiceBox<String> weglowodanySniadanieII = new ChoiceBox<>(produktyWeglowodanowe);
	@FXML
    private ChoiceBox<String> weglowodanyObiad = new ChoiceBox<>(produktyWeglowodanowe);
	@FXML
    private ChoiceBox<String> weglowodanyPodwieczorek = new ChoiceBox<>(produktyWeglowodanowe);
	@FXML
    private ChoiceBox<String> bialkoSniadanie = new ChoiceBox<>(produktyBialkowe);
	@FXML
    private ChoiceBox<String> bialko2Sniadanie = new ChoiceBox<>(produktyBialkowe2);
	@FXML
    private ChoiceBox<String> bialkoSniadanieII = new ChoiceBox<>(produktyBialkowe);
	@FXML
    private ChoiceBox<String> bialkoObiad = new ChoiceBox<>(produktyBialkowe);
	@FXML
    private ChoiceBox<String> bialkoPodwieczorek = new ChoiceBox<>(produktyBialkowe);
	@FXML
    private ChoiceBox<String> bialkoKolacja = new ChoiceBox<>(produktyBialkowe);
	@FXML
    private ChoiceBox<String> bialko2Kolacja = new ChoiceBox<>(produktyBialkowe2);
	@FXML
    private ChoiceBox<String> tluszczeSniadanie = new ChoiceBox<>(produktyTluszczowe);
	@FXML
    private ChoiceBox<String> tluszczeSniadanieII = new ChoiceBox<>(produktyTluszczowe);
	@FXML
    private ChoiceBox<String> tluszczeObiad = new ChoiceBox<>(produktyTluszczowe);
	@FXML
    private ChoiceBox<String> tluszczePodwieczorek = new ChoiceBox<>(produktyTluszczowe);
	@FXML
    private ChoiceBox<String> tluszczeKolacja = new ChoiceBox<>(produktyTluszczowe);
	@FXML
    private ChoiceBox<String> warzywaSniadanie = new ChoiceBox<>(produktyWarzywne4);
	@FXML
    private ChoiceBox<String> warzywa2Sniadanie = new ChoiceBox<>(produktyWarzywne2);
	@FXML
    private ChoiceBox<String> warzywaSniadanieII = new ChoiceBox<>(produktyWarzywne4);
	@FXML
    private ChoiceBox<String> warzywa2SniadanieII = new ChoiceBox<>(produktyWarzywne2);
	@FXML
    private ChoiceBox<String> warzywaObiad = new ChoiceBox<>(produktyWarzywne4);
	@FXML
    private ChoiceBox<String> warzywa2Obiad = new ChoiceBox<>(produktyWarzywne2);
	@FXML
    private ChoiceBox<String> warzywaPodwieczorek = new ChoiceBox<>(produktyWarzywne4);
	@FXML
    private ChoiceBox<String> warzywa2Podwieczorek = new ChoiceBox<>(produktyWarzywne2);
	@FXML
    private ChoiceBox<String> warzywaKolacja = new ChoiceBox<>(produktyWarzywne4);
	@FXML
    private ChoiceBox<String> warzywa2Kolacja = new ChoiceBox<>(produktyWarzywne2);
	@FXML
    private ChoiceBox<String> warzywa3Kolacja = new ChoiceBox<>(produktyWarzywne3);
	
	String toString(int z) {
		String s = z+"";
		return s;
	}
	
    @FXML
    void akcjaTwojeDane(ActionEvent event) throws IOException {
    
    	Stage primaryStage = new Stage();
    	VBox root = (VBox)FXMLLoader.load(getClass().getResource("dane.fxml"));
		Image image = new Image(new FileInputStream("src/application/ikonka.png"));
		Scene scene = new Scene(root,330,400);
		primaryStage.setTitle("Tw\u00F3j Dietetyk");
		primaryStage.getIcons().add(image);
		primaryStage.setResizable(false);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.showAndWait();

    }
     
    @FXML
    void akcjaOdswiez(MouseEvent event) {
		
		try {
			uzytkownik.odczytPlikTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				Runnable task = () -> {
		            Platform.runLater(() -> {
		        	if(uzytkownik.getCel().length() == 0) {
		    			celLabel.setText("Uzupe\u0142nij dane");
		    		}
		    		else
		    		{
		    			celLabel.setText(uzytkownik.getCel());
		    		}
		    		
		    		if(uzytkownik.getWaga() == 0) {
		    			wagaLabel.setText("Uzupe\u0142nij dane");
		    		}
		    		else
		    		{
		    			wagaLabel.setText(toString(((int)uzytkownik.getWaga()))+" kg");
		    		}
		    		
		    		if(uzytkownik.getWzrost() == 0) {
		    			wzrostLabel.setText("Uzupe\u0142nij dane");
		    		}
		    		else
		    		{
		    			wzrostLabel.setText(toString((int)uzytkownik.getWzrost())+" cm");
		    		}
		    		
		    		if(uzytkownik.getZapotrzebowanie() == 0) {
		    			kalorieLabel.setText("Uzupe\u0142nij dane");
		    		}
		    		else {
		    			kalorieLabel.setText(toString((int)uzytkownik.getZapotrzebowanie())+" kcal");
		    		}
		    		
		    		if(uzytkownik.getImie().length() == 0) {
		    			powitalnyLabel.setText("Witaj u\u017Cytkowniku!");
		    		}
		    		else
		    		{
		    		powitalnyLabel.setText("Witaj "+uzytkownik.getImie()+"!");
		    		}
				
		            });
		        };
		        Thread backThread = new Thread(task);
		        backThread.setDaemon(true);
		        backThread.start();
        
		
    	
    }
    @FXML
    void akcjaRozpiszDiete(ActionEvent event) throws IOException {
    
	    	if(uzytkownik.getZapotrzebowanie() == 0) {
	    		Alert dialog = new Alert(Alert.AlertType.INFORMATION);
	    		dialog.setTitle("Informacja");
	    		dialog.setHeaderText("Aby opracowa\u0107 diet\u0119, najpierw uzupe\u0142nij swoje dane!");
	    		Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
	    		stage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
	    		dialog.showAndWait();
	    	} else {
	    		Stage primaryStage = new Stage();
	            FileChooser fileChooser = new FileChooser();
	            int licznik = (int)uzytkownik.getLicznikDoNazwyDiety()+1;
	            uzytkownik.setLicznikDoNazwyDiety(licznik);
	            uzytkownik.zapiszPlikTxt();
	            uzytkownik.odczytPlikTxt();
	            
	            fileChooser.setTitle("Zapisz plik");
	            fileChooser.setInitialFileName("Dieta_"+uzytkownik.getImie()+licznik);
	            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("pdf", "*.pdf"));
	            File plik = fileChooser.showSaveDialog(primaryStage);
	            Alert dialog = new Alert(Alert.AlertType.INFORMATION);
				dialog.setTitle("Informacja");
	            if(plik != null) {
	            dieta.setPath(plik.getAbsolutePath());
	            dieta.rozpiszDiete();
				dieta.zapiszDoTxt();
				dieta.zapiszDoPDF();
				dialog.setHeaderText("Twoja dieta zosta\u0142a zapisana!");
	            } else {
	            	dialog.setHeaderText("Dieta nie zosta\u0142a zapisana!");
	            }
				
				Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
				stage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
				primaryStage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
				dialog.showAndWait();
		    	}
	    	
    }	
		
    @FXML
    void akcjaModyfikacja(ActionEvent event) throws IOException {
    
    	Stage primaryStage = new Stage();
    	VBox root = (VBox)FXMLLoader.load(getClass().getResource("modyfikacja.fxml"));
		Image image = new Image(new FileInputStream("src/application/ikonka.png"));
		Scene scene = new Scene(root,330,586);
		primaryStage.setTitle("Tw\u00F3j Dietetyk");
		primaryStage.getIcons().add(image);
		primaryStage.setResizable(false);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
    }
    
    @FXML
    void akcjaWlasnyJadlospis(ActionEvent event) throws IOException {
    
    	Stage primaryStage = new Stage();
    	BorderPane root = new BorderPane();
		ScrollPane root2 = (ScrollPane)FXMLLoader.load(getClass().getResource("WlasnyJadlospis.fxml"));
		root.setCenter(root2);
		root2.hbarPolicyProperty().setValue(ScrollBarPolicy.NEVER);
		Image image = new Image(new FileInputStream("src/application/ikonka.png"));
		Scene scene = new Scene(root,750,516);
		primaryStage.setTitle("Tw\u00F3j Dietetyk");
		primaryStage.getIcons().add(image);
		primaryStage.setResizable(false);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
    }
    @FXML
    void akcjaAutor(ActionEvent event) throws IOException {
    
    	Stage primaryStage = new Stage();
    	VBox root = (VBox)FXMLLoader.load(getClass().getResource("autor.fxml"));
		Image image = new Image(new FileInputStream("src/application/ikonka.png"));
		Scene scene = new Scene(root,330,244);
		primaryStage.setTitle("Tw\u00F3j Dietetyk");
		primaryStage.getIcons().add(image);
		primaryStage.setResizable(false);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();	
		
    }
    
    @FXML
    void akcjaTextImie(KeyEvent event) {
    	imie.setTextFormatter(new TextFormatter<String>(new TextFormatterTylkoText()));
    }

    @FXML
    void akcjaTextWaga(KeyEvent event) {
    	waga.setTextFormatter(new TextFormatter<Integer>(new TextFormatterTylkoCyfry()));	
    }

    @FXML
    void akcjaTextWiek(KeyEvent event) {
    	wiek.setTextFormatter(new TextFormatter<Integer>(new TextFormatterTylkoCyfry()));
    }

    @FXML
    void akcjaTextWzrost(KeyEvent event) {
    	wzrost.setTextFormatter(new TextFormatter<Integer>(new TextFormatterTylkoCyfry()));   	
    }
    
	@FXML
	void akcjaZapiszPrzycisk(ActionEvent event) {
		uzytkownik.setImie(imie.getText());
		uzytkownik.setWaga(Float.parseFloat(waga.getText()));
		uzytkownik.setWiek(Float.parseFloat(wiek.getText()));
		uzytkownik.setWzrost(Float.parseFloat(wzrost.getText()));
		uzytkownik.setCel(cel.getValue());
		uzytkownik.setPlec(plec.getValue());
		
		if(iloscTreningow.getValue().equals("0"))
		{
			uzytkownik.setKalorieTrening(0);
		}
		if(iloscTreningow.getValue().equals("1"))
		{
			uzytkownik.setKalorieTrening(100);
		}
		if(iloscTreningow.getValue().equals("2"))
		{
			uzytkownik.setKalorieTrening(200);
		}
		if(iloscTreningow.getValue().equals("3"))
		{
			uzytkownik.setKalorieTrening(300);
		}
		if(iloscTreningow.getValue().equals("4"))
		{
			uzytkownik.setKalorieTrening(400);
		}
		if(iloscTreningow.getValue().equals("5"))
		{
			uzytkownik.setKalorieTrening(500);
		}
		
		if(praca.getValue().equals("Praca siedzaca, bardzo malo ruchu"))
		{
			uzytkownik.setKalorieDzien(0.3); 
		}
		if(praca.getValue().equals("Praca stojaca"))
		{
			uzytkownik.setKalorieDzien(0.35);
		}
		if(praca.getValue().equals("Praca stojaca, duzo ruchu"))
		{	
			uzytkownik.setKalorieDzien(0.4);
		}
		if(praca.getValue().equals("Praca fizyczna(np. na budowie)"))
		{
			uzytkownik.setKalorieDzien(0.5);
		}
		uzytkownik.wyliczZapotrzebowanie();
		if(uzytkownik.getCel().length() == 0) {
			celLabel.setText("Uzupe\u0142nij dane");
		}
		else
		{
			celLabel.setText(uzytkownik.getCel());
		}
		
		if(uzytkownik.getWaga() == 0) {
			wagaLabel.setText("Uzupe\u0142nij dane");
		}
		else
		{
			wagaLabel.setText(toString(((int)uzytkownik.getWaga()))+" kg");
		}
		
		if(uzytkownik.getWzrost() == 0) {
			wzrostLabel.setText("Uzupe\u0142nij dane");
		}
		else
		{
			wzrostLabel.setText(toString((int)uzytkownik.getWzrost())+" cm");
		}
		
		if(uzytkownik.getZapotrzebowanie() == 0) {
			kalorieLabel.setText("Uzupe\u0142nij dane");
		}
		else {
			kalorieLabel.setText(toString((int)uzytkownik.getZapotrzebowanie())+" kcal");
		}
		
		if(uzytkownik.getImie().length() == 0) {
			powitalnyLabel.setText("Witaj u\u017Cytkowniku!");
		}
		else
		{
		powitalnyLabel.setText("Witaj "+uzytkownik.getImie()+"!");
		}
		          
		try {
			uzytkownik.zapiszPlikTxt();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
	@FXML
	void akcjaZmodyfikujPrzycisk(ActionEvent event) throws IOException {
		
		if(uzytkownik.getCel().equals("Redukcja")) {
			if(problemDieta.getValue().equals("Za szybko chudn\u0119"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()+100;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			if(problemDieta.getValue().equals("Waga stoi w miejscu"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()-100;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			if(problemDieta.getValue().equals("Przyty\u0142em"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()-300;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			
		}
		
		if(uzytkownik.getCel().equals("Masa")) {
			if(problemDieta.getValue().equals("Za szybko przybieram"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()-100;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			if(problemDieta.getValue().equals("Waga stoi w miejscu"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()+100;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			if(problemDieta.getValue().equals("Schud\u0142em"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()+300;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			
		}
		
		if(uzytkownik.getCel().equals("Utrzymanie masy")) {
			if(problemDieta.getValue().equals("Schud\u0142em"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()+150;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			if(problemDieta.getValue().equals("Przyty\u0142em"))
			{
				double modyfikacjaZapotrzebowania = uzytkownik.getZapotrzebowanie()-150;
				uzytkownik.setZapotrzebowanie(modyfikacjaZapotrzebowania);
			}
			
		}
		
		if(uzytkownik.getZapotrzebowanie() == 0) {
    		Alert dialog = new Alert(Alert.AlertType.INFORMATION);
    		dialog.setTitle("Informacja");
    		dialog.setHeaderText("Najpierw uzupe\u0142nij swoje dane!");
    		Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
    		stage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
    		dialog.showAndWait();
    	} else {
    		Stage primaryStage = new Stage();
            FileChooser fileChooser = new FileChooser();
            int licznik = (int)uzytkownik.getLicznikDoNazwyDiety()+1;
            uzytkownik.setLicznikDoNazwyDiety(licznik);
            uzytkownik.zapiszPlikTxt();
            uzytkownik.odczytPlikTxt();
            
            fileChooser.setTitle("Zapisz plik");
            fileChooser.setInitialFileName("Dieta_"+uzytkownik.getImie()+licznik);
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("pdf", "*.pdf"));
            File plik = fileChooser.showSaveDialog(primaryStage);
            Alert dialog = new Alert(Alert.AlertType.INFORMATION);
			dialog.setTitle("Informacja");
            if(plik != null) {
            dieta.setPath(plik.getAbsolutePath());
    		dieta.rozpiszDiete();
			dieta.zapiszDoPDF();
			dieta.zapiszDoTxt();
			
			dialog.setHeaderText("Twoja dieta zosta\u0142a zapisana!");
            } else {
            	dialog.setHeaderText("Dieta nie zosta\u0142a zapisana!");
            }
			
			Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
			stage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
			primaryStage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
			dialog.showAndWait();
	    	}	
				
			
			
	}
	@FXML
	void akcjaZapiszJadlospis(ActionEvent event) throws IOException {
		//Produkty w\u0119glowodanowe	
		for(int i = 0; i < ServiceDb.getListaProduktyWeglowodanowe().size(); i++) {
			if(weglowodanySniadanie.getValue().equals(produktyWeglowodanoweDB[i].getNazwa())){
				dieta.setWeglePosilek1(produktyWeglowodanoweDB[i]);
			}
			if(weglowodanySniadanieII.getValue().equals(produktyWeglowodanoweDB[i].getNazwa())){
				dieta.setWeglePosilek2(produktyWeglowodanoweDB[i]);
			}
			if(weglowodanyObiad.getValue().equals(produktyWeglowodanoweDB[i].getNazwa())){
				dieta.setWeglePosilek3(produktyWeglowodanoweDB[i]);
			}
			if(weglowodanyPodwieczorek.getValue().equals(produktyWeglowodanoweDB[i].getNazwa())){
				dieta.setWeglePosilek4(produktyWeglowodanoweDB[i]);
			}
			
		}
		//Produkty bialkowe
		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			if(bialkoSniadanie.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialkoPosilek1(produktyBialkoweDB[i]);
			}
			if(bialko2Sniadanie.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialko2Posilek1(produktyBialkoweDB[i]);
			}	
			if(bialkoSniadanieII.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialkoPosilek2(produktyBialkoweDB[i]);
			}	
			if(bialkoObiad.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialkoPosilek3(produktyBialkoweDB[i]);
			}	
			if(bialkoPodwieczorek.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialkoPosilek4(produktyBialkoweDB[i]);
			}	
			if(bialkoKolacja.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialkoPosilek5(produktyBialkoweDB[i]);
			}	
			if(bialko2Kolacja.getValue().equals(produktyBialkoweDB[i].getNazwa())){
				dieta.setBialko2Posilek5(produktyBialkoweDB[i]);
			}	
						
		}
		//Produkty tluszczowe
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			if(tluszczeSniadanie.getValue().equals(produktyTluszczoweDB[i].getNazwa())){
				dieta.setTluszczePosilek1(produktyTluszczoweDB[i]);
			}	
			if(tluszczeSniadanieII.getValue().equals(produktyTluszczoweDB[i].getNazwa())){
				dieta.setTluszczePosilek2(produktyTluszczoweDB[i]);
			}
			if(tluszczeObiad.getValue().equals(produktyTluszczoweDB[i].getNazwa())){
				dieta.setTluszczePosilek3(produktyTluszczoweDB[i]);
			}
			if(tluszczePodwieczorek.getValue().equals(produktyTluszczoweDB[i].getNazwa())){
				dieta.setTluszczePosilek4(produktyTluszczoweDB[i]);
			}
			if(tluszczeKolacja.getValue().equals(produktyTluszczoweDB[i].getNazwa())){
				dieta.setTluszczePosilek5(produktyTluszczoweDB[i]);
			}	
		}
		//Warzywa
		for(int i = 0; i < ServiceDb.getListaWarzywaDuzaPorcja().size(); i++) {
			if(warzywaSniadanie.getValue().equals(produktyWarzywaDuzaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek1(produktyWarzywaDuzaPorcjaDB[i]);
			}	
			
			if(warzywaSniadanieII.getValue().equals(produktyWarzywaDuzaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek2(produktyWarzywaDuzaPorcjaDB[i]);
			}
			
			if(warzywaObiad.getValue().equals(produktyWarzywaDuzaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek3(produktyWarzywaDuzaPorcjaDB[i]);
			}
			
			if(warzywaPodwieczorek.getValue().equals(produktyWarzywaDuzaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek4(produktyWarzywaDuzaPorcjaDB[i]);
			}
			
			if(warzywaKolacja.getValue().equals(produktyWarzywaDuzaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek5(produktyWarzywaDuzaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			if(warzywa2Kolacja.getValue().equals(produktyWarzywaMalaPorcjaDB[i].getNazwa())){
				dieta.setWarzywa2Posilek5(produktyWarzywaMalaPorcjaDB[i]);
			}
			if(warzywa2Sniadanie.getValue().equals(produktyWarzywaMalaPorcjaDB[i].getNazwa())){
				dieta.setWarzywa2Posilek1(produktyWarzywaMalaPorcjaDB[i]);
			}
			if(warzywa2SniadanieII.getValue().equals(produktyWarzywaMalaPorcjaDB[i].getNazwa())){
				dieta.setWarzywa2Posilek2(produktyWarzywaMalaPorcjaDB[i]);
			}
			if(warzywa2Obiad.getValue().equals(produktyWarzywaMalaPorcjaDB[i].getNazwa())){
					dieta.setWarzywa2Posilek3(produktyWarzywaMalaPorcjaDB[i]);
			}			
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaSredniaPorcja().size(); i++) {
			if(warzywa3Kolacja.getValue().equals(produktyWarzywaSredniaPorcjaDB[i].getNazwa())){
				dieta.setWarzywa3Posilek5(produktyWarzywaSredniaPorcjaDB[i]);
			}
			if(warzywaSniadanie.getValue().equals(produktyWarzywaSredniaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek1(produktyWarzywaSredniaPorcjaDB[i]);
			}	
			
			if(warzywaSniadanieII.getValue().equals(produktyWarzywaSredniaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek2(produktyWarzywaSredniaPorcjaDB[i]);
			}
			
			if(warzywaObiad.getValue().equals(produktyWarzywaSredniaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek3(produktyWarzywaSredniaPorcjaDB[i]);
			}
			
			if(warzywaPodwieczorek.getValue().equals(produktyWarzywaSredniaPorcjaDB[i].getNazwa())){
				dieta.setWarzywaPosilek4(produktyWarzywaSredniaPorcjaDB[i]);
			}
		}
		
		if(uzytkownik.getZapotrzebowanie() == 0) {
    		Alert dialog = new Alert(Alert.AlertType.INFORMATION);
    		dialog.setTitle("Informacja");
    		dialog.setHeaderText("Aby opracowa\u0107 diet\u0119, najpierw uzupe\u0142nij swoje dane!");
    		Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
    		stage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
    		dialog.showAndWait();
    	} else {
    		Stage primaryStage = new Stage();
            FileChooser fileChooser = new FileChooser();
            int licznik = (int)uzytkownik.getLicznikDoNazwyDiety()+1;
            uzytkownik.setLicznikDoNazwyDiety(licznik);
            uzytkownik.zapiszPlikTxt();
            uzytkownik.odczytPlikTxt();
            
            fileChooser.setTitle("Zapisz plik");
            fileChooser.setInitialFileName("Dieta_"+uzytkownik.getImie()+licznik);
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("pdf", "*.pdf"));
            File plik = fileChooser.showSaveDialog(primaryStage);
            Alert dialog = new Alert(Alert.AlertType.INFORMATION);
			dialog.setTitle("Informacja");
            if(plik != null) {
            dieta.setPath(plik.getAbsolutePath());
            dieta.rozpiszDiete();
			dieta.zapiszDoPDF();
			dieta.zapiszDoTxt();
			
			dialog.setHeaderText("Twoja dieta zosta\u0142a zapisana!");
            } else {
            	dialog.setHeaderText("Dieta nie zosta\u0142a zapisana!");
            }
			
			Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
			stage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
			primaryStage.getIcons().add(new Image(this.getClass().getResource("ikonka.png").toString()));
			dialog.showAndWait();
	    	}	
		
		
	}
	public void loadProductsToFirstDiet() {
		produktyBialkoweDB = ServiceDb.getProduktyBialkowe();
		produktyBialkoweInneDB = ServiceDb.getProduktyBialkoweInne();
		produktyWeglowodanoweDB = ServiceDb.getProduktyWeglowodanowe();
		produktyTluszczoweDB = ServiceDb.getProduktyTluszczowe();
		produktyWarzywaDuzaPorcjaDB = ServiceDb.getProduktyWarzywaDuzaPorcja();
		produktyWarzywaSredniaPorcjaDB = ServiceDb.getProduktyWarzywaSredniaPorcja();
		produktyWarzywaMalaPorcjaDB = ServiceDb.getProduktyWarzywaMalaPorcja();
		
		//Posilek 1
		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			if(produktyBialkoweDB[i].getNazwa().equals("Szynka gotowana(wędlina)")) {
				dieta.setBialko2Posilek1(produktyBialkoweDB[i]);
			}
		}
		
		for(int i = 0; i < ServiceDb.getListaProduktyBialkoweInne().size(); i++) {
			
			if(produktyBialkoweInneDB[i].getNazwa().equals("Jaja kurze")) {
				dieta.setBialkoPosilek1(produktyBialkoweInneDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyWeglowodanowe().size(); i++) {
			if(produktyWeglowodanoweDB[i].getNazwa().equals("Chleb żytni razowy")) {
				dieta.setWeglePosilek1(produktyWeglowodanoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			if(produktyTluszczoweDB[i].getNazwa().equals("Masło ekstra")) {
				dieta.setTluszczePosilek1(produktyTluszczoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaDuzaPorcja().size(); i++) {
			if(produktyWarzywaDuzaPorcjaDB[i].getNazwa().equals("Pomidor")) {
				dieta.setWarzywaPosilek1(produktyWarzywaDuzaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			if(produktyWarzywaMalaPorcjaDB[i].getNazwa().equals("Cebula")) {
				dieta.setWarzywa2Posilek1(produktyWarzywaMalaPorcjaDB[i]);
			}
		}
		//Posilek 2
		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			if(produktyBialkoweDB[i].getNazwa().equals("Filet z dorsza")) {
				dieta.setBialkoPosilek2(produktyBialkoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyWeglowodanowe().size(); i++) {
			if(produktyWeglowodanoweDB[i].getNazwa().equals("Kasza bulgur")) {
				dieta.setWeglePosilek2(produktyWeglowodanoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			if(produktyTluszczoweDB[i].getNazwa().equals("Oliwa z oliwek")) {
				dieta.setTluszczePosilek2(produktyTluszczoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaDuzaPorcja().size(); i++) {
			if(produktyWarzywaDuzaPorcjaDB[i].getNazwa().equals("Pomidor")) {
				dieta.setWarzywaPosilek2(produktyWarzywaDuzaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			if(produktyWarzywaMalaPorcjaDB[i].getNazwa().equals("Rzodkiewka")) {
				dieta.setWarzywa2Posilek2(produktyWarzywaMalaPorcjaDB[i]);
			}
		}
		//Posilek 3
		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			if(produktyBialkoweDB[i].getNazwa().equals("Pierś kurczaka")) {
				dieta.setBialkoPosilek3(produktyBialkoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyWeglowodanowe().size(); i++) {
			if(produktyWeglowodanoweDB[i].getNazwa().equals("Ryż biały")) {
				dieta.setWeglePosilek3(produktyWeglowodanoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			if(produktyTluszczoweDB[i].getNazwa().equals("Oliwa z oliwek")) {
				dieta.setTluszczePosilek3(produktyTluszczoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaDuzaPorcja().size(); i++) {
			if(produktyWarzywaDuzaPorcjaDB[i].getNazwa().equals("Pomidor")) {
				dieta.setWarzywaPosilek3(produktyWarzywaDuzaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			if(produktyWarzywaMalaPorcjaDB[i].getNazwa().equals("Cebula")) {
				dieta.setWarzywa2Posilek3(produktyWarzywaMalaPorcjaDB[i]);
			}
		}
		//Posilek 4
		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			if(produktyBialkoweDB[i].getNazwa().equals("Pierś indyka")) {
				dieta.setBialkoPosilek4(produktyBialkoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyWeglowodanowe().size(); i++) {
			if(produktyWeglowodanoweDB[i].getNazwa().equals("Kasza gryczana")) {
				dieta.setWeglePosilek4(produktyWeglowodanoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			if(produktyTluszczoweDB[i].getNazwa().equals("Olej lniany")) {
				dieta.setTluszczePosilek4(produktyTluszczoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaSredniaPorcja().size(); i++) {
			if(produktyWarzywaSredniaPorcjaDB[i].getNazwa().equals("Ogórek")) {
				dieta.setWarzywaPosilek4(produktyWarzywaSredniaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			if(produktyWarzywaMalaPorcjaDB[i].getNazwa().equals("Rzodkiewka")) {
				dieta.setWarzywa2Posilek4(produktyWarzywaMalaPorcjaDB[i]);
			}
		}
		//Posilek 5
		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			if(produktyBialkoweDB[i].getNazwa().equals("Tuńczyk w wodzie")) {
				dieta.setBialkoPosilek5(produktyBialkoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaProduktyBialkoweInne().size(); i++) {
			
			if(produktyBialkoweInneDB[i].getNazwa().equals("Mozzarella light")) {
				dieta.setBialko2Posilek5(produktyBialkoweInneDB[i]);
			}
		}
		
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			if(produktyTluszczoweDB[i].getNazwa().equals("Oliwa z oliwek")) {
				dieta.setTluszczePosilek5(produktyTluszczoweDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaSredniaPorcja().size(); i++) {
			if(produktyWarzywaSredniaPorcjaDB[i].getNazwa().equals("Sałata lodowa")) {
				dieta.setWarzywaPosilek5(produktyWarzywaSredniaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			if(produktyWarzywaMalaPorcjaDB[i].getNazwa().equals("Cebula")) {
				dieta.setWarzywa2Posilek5(produktyWarzywaMalaPorcjaDB[i]);
			}
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaSredniaPorcja().size(); i++) {
			if(produktyWarzywaSredniaPorcjaDB[i].getNazwa().equals("Papryka czerwona")) {
				dieta.setWarzywa3Posilek5(produktyWarzywaSredniaPorcjaDB[i]);
			}
		}
	}
	public void loadDB() {
		
		produktyBialkoweDB = ServiceDb.getProduktyBialkowe();
		produktyWeglowodanoweDB = ServiceDb.getProduktyWeglowodanowe();
		produktyTluszczoweDB = ServiceDb.getProduktyTluszczowe();
		produktyWarzywaDuzaPorcjaDB = ServiceDb.getProduktyWarzywaDuzaPorcja();
		produktyWarzywaSredniaPorcjaDB = ServiceDb.getProduktyWarzywaSredniaPorcja();
		produktyWarzywaMalaPorcjaDB = ServiceDb.getProduktyWarzywaMalaPorcja();
		

		for(int i = 0; i < ServiceDb.getListaProduktyBialkowe().size(); i++) {
			produktyBialkoweLista.add(produktyBialkoweDB[i].getNazwa());
		}
		for(int i = 0; i < ServiceDb.getListaProduktyWeglowodanowe().size(); i++) {
			produktyWeglowodanoweLista.add(produktyWeglowodanoweDB[i].getNazwa());
		}
		for(int i = 0; i < ServiceDb.getListaProduktyTluszczowe().size(); i++) {
			produktyTluszczoweLista.add(produktyTluszczoweDB[i].getNazwa());
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaDuzaPorcja().size(); i++) {
			produktyWarzywaDuzaPorcjaLista.add(produktyWarzywaDuzaPorcjaDB[i].getNazwa());
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaSredniaPorcja().size(); i++) {
			produktyWarzywaSredniaPorcjaLista.add(produktyWarzywaSredniaPorcjaDB[i].getNazwa());
		}
		for(int i = 0; i < ServiceDb.getListaWarzywaMalaPorcja().size(); i++) {
			produktyWarzywaMalaPorcjaLista.add(produktyWarzywaMalaPorcjaDB[i].getNazwa());
		}
		produktyWarzywaDuzaLista.addAll(produktyWarzywaDuzaPorcjaLista);
		produktyWarzywaDuzaLista.addAll(produktyWarzywaSredniaPorcjaLista);
		produktyBialkowe = FXCollections.observableArrayList(produktyBialkoweLista);
		produktyBialkowe2 = FXCollections.observableArrayList(produktyBialkoweLista);
		produktyWeglowodanowe = FXCollections.observableArrayList(produktyWeglowodanoweLista);
		produktyTluszczowe = FXCollections.observableArrayList(produktyTluszczoweLista);
		produktyWarzywne = FXCollections.observableArrayList(produktyWarzywaDuzaPorcjaLista);
		produktyWarzywne2 = FXCollections.observableArrayList(produktyWarzywaMalaPorcjaLista);
		produktyWarzywne3 = FXCollections.observableArrayList(produktyWarzywaSredniaPorcjaLista);
		produktyWarzywne4 = FXCollections.observableArrayList(produktyWarzywaDuzaLista);
		
	}
	
	@FXML
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			uzytkownik.odczytPlikTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loadDB();
		loadProductsToFirstDiet();
		
		praca.setItems(rodzajePracy);
		praca.getSelectionModel().selectFirst();
		
		cel.setItems(listaCelow);
		cel.getSelectionModel().selectFirst();
		
		iloscTreningow.setItems(listaIloscTreningow);
		iloscTreningow.getSelectionModel().selectFirst();
		
		plec.setItems(listaPlec);
		plec.getSelectionModel().selectFirst();
		
		weglowodanySniadanie.setItems(produktyWeglowodanowe);
		weglowodanySniadanie.getSelectionModel().selectFirst();;
		
		weglowodanySniadanieII.setItems(produktyWeglowodanowe);
		weglowodanySniadanieII.getSelectionModel().selectFirst();
		
		weglowodanyObiad.setItems(produktyWeglowodanowe);
		weglowodanyObiad.getSelectionModel().selectFirst();
		
		weglowodanyPodwieczorek.setItems(produktyWeglowodanowe);
		weglowodanyPodwieczorek.getSelectionModel().selectFirst();
		
		bialkoSniadanie.setItems(produktyBialkowe);
		bialkoSniadanie.getSelectionModel().selectFirst();
		
		bialko2Sniadanie.setItems(produktyBialkowe2);
		bialko2Sniadanie.getSelectionModel().selectFirst();
		
		bialkoSniadanieII.setItems(produktyBialkowe);
		bialkoSniadanieII.getSelectionModel().selectFirst();
		
		bialkoObiad.setItems(produktyBialkowe);
		bialkoObiad.getSelectionModel().selectFirst();
		
		bialkoPodwieczorek.setItems(produktyBialkowe);
		bialkoPodwieczorek.getSelectionModel().selectFirst();
		
		bialkoKolacja.setItems(produktyBialkowe);
		bialkoKolacja.getSelectionModel().selectFirst();
		
		bialko2Kolacja.setItems(produktyBialkowe2);
		bialko2Kolacja.getSelectionModel().selectFirst();
		
		tluszczeSniadanie.setItems(produktyTluszczowe);
		tluszczeSniadanie.getSelectionModel().selectFirst();
		
		tluszczeSniadanieII.setItems(produktyTluszczowe);
		tluszczeSniadanieII.getSelectionModel().selectFirst();
		
		tluszczeObiad.setItems(produktyTluszczowe);
		tluszczeObiad.getSelectionModel().selectFirst();
		
		tluszczePodwieczorek.setItems(produktyTluszczowe);
		tluszczePodwieczorek.getSelectionModel().selectFirst();
		
		tluszczeKolacja.setItems(produktyTluszczowe);
		tluszczeKolacja.getSelectionModel().selectFirst();
		
		warzywaSniadanie.setItems(produktyWarzywne4);
		warzywaSniadanie.getSelectionModel().selectFirst();
		
		warzywa2Sniadanie.setItems(produktyWarzywne2);
		warzywa2Sniadanie.getSelectionModel().selectFirst();
		
		warzywaSniadanieII.setItems(produktyWarzywne4);
		warzywaSniadanieII.getSelectionModel().selectFirst();
		
		warzywa2SniadanieII.setItems(produktyWarzywne2);
		warzywa2SniadanieII.getSelectionModel().selectFirst();
		
		warzywaObiad.setItems(produktyWarzywne4);
		warzywaObiad.getSelectionModel().selectFirst();
		
		warzywa2Obiad.setItems(produktyWarzywne2);
		warzywa2Obiad.getSelectionModel().selectFirst();
		
		warzywaPodwieczorek.setItems(produktyWarzywne4);
		warzywaPodwieczorek.getSelectionModel().selectFirst();
		
		warzywa2Podwieczorek.setItems(produktyWarzywne2);
		warzywa2Podwieczorek.getSelectionModel().selectFirst();
		
		warzywaKolacja.setItems(produktyWarzywne4);
		warzywaKolacja.getSelectionModel().selectFirst();
		
		warzywa2Kolacja.setItems(produktyWarzywne2);
		warzywa2Kolacja.getSelectionModel().selectFirst();
		
		warzywa3Kolacja.setItems(produktyWarzywne4);
		warzywa3Kolacja.getSelectionModel().selectFirst();
	
		if(uzytkownik.getCel().equals("Redukcja")) {
			problemDieta.setItems(problemDietaRedukcja);
			problemDieta.getSelectionModel().selectFirst();
		}
		if(uzytkownik.getCel().equals("Masa")) {
			problemDieta.setItems(problemDietaMasa);
			problemDieta.getSelectionModel().selectFirst();
		}
		if(uzytkownik.getCel().equals("Utrzymanie masy")) {
			problemDieta.setItems(problemDietaUtrzymanieMasy);
			problemDieta.getSelectionModel().selectFirst();
		}
		if(uzytkownik.getPlik() != null) {
			if(uzytkownik.getCel().length() == 0) {
				celLabel.setText("Uzupe\u0142nij dane");
			}
			else
			{
				celLabel.setText(uzytkownik.getCel());
			}
			
			if(uzytkownik.getWaga() == 0) {
				wagaLabel.setText("Uzupe\u0142nij dane");
			}
			else
			{
				wagaLabel.setText(toString(((int)uzytkownik.getWaga()))+" kg");
			}
			
			if(uzytkownik.getWzrost() == 0) {
				wzrostLabel.setText("Uzupe\u0142nij dane");
			}
			else
			{
				wzrostLabel.setText(toString((int)uzytkownik.getWzrost())+" cm");
			}
			
			if(uzytkownik.getZapotrzebowanie() == 0) {
				kalorieLabel.setText("Uzupe\u0142nij dane");
			}
			else {
				kalorieLabel.setText(toString((int)uzytkownik.getZapotrzebowanie())+" kcal");
			}
			
			if(uzytkownik.getImie().length() == 0) {
				powitalnyLabel.setText("Witaj u\u017Cytkowniku!");
			}
			else
			{
			powitalnyLabel.setText("Witaj "+uzytkownik.getImie()+"!");
			}	
		}
	}
}
