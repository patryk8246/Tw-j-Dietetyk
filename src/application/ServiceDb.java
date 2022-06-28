package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDb {

	private static Product [] produktyBialkowe = new Product[100];
	private static Product [] produktyBialkoweInne = new Product[100];
	private static Product [] produktyWeglowodanowe = new Product[100];
	private static Product [] produktyTluszczowe = new Product[100];
	private static Product [] produktyWarzywaDuzaPorcja = new Product[100];
	private static Product [] produktyWarzywaSredniaPorcja = new Product[100];
	private static Product [] produktyWarzywaMalaPorcja = new Product[100];
	private static List<Product> listaBialkoInne = new ArrayList<Product>();
	private static List<Product> listaBialko = new ArrayList<Product>();
	private static List<Product> listaWeglowodany = new ArrayList<Product>();
	private static List<Product> listaTluszcze = new ArrayList<Product>();
	private static List<Product> listaWarzywaDuzaPorcja = new ArrayList<Product>();
	private static List<Product> listaWarzywaSredniaPorcja = new ArrayList<Product>();
	private static List<Product> listaWarzywaMalaPorcja = new ArrayList<Product>();
	
	public static Product [] getProduktyBialkowe() {
		return produktyBialkowe;
	}
	
	public static Product [] getProduktyBialkoweInne() {
		return produktyBialkoweInne;
	}
	
	public static Product [] getProduktyWeglowodanowe() {
		return produktyWeglowodanowe;
	}
	
	public static Product [] getProduktyTluszczowe() {
		return produktyTluszczowe;
	}
	
	public static Product [] getProduktyWarzywaDuzaPorcja() {
		return produktyWarzywaDuzaPorcja;
	}
	
	public static Product [] getProduktyWarzywaSredniaPorcja() {
		return produktyWarzywaSredniaPorcja;
	}
	
	public static Product [] getProduktyWarzywaMalaPorcja() {
		return produktyWarzywaMalaPorcja;
	}
	
	public static List<Product> getListaProduktyBialkowe() {
		return listaBialko;
	}
	
	public static List<Product> getListaProduktyBialkoweInne() {
		return listaBialkoInne;
	}
	
	public static List<Product> getListaProduktyWeglowodanowe() {
		return listaWeglowodany;
	}
	public static List<Product> getListaProduktyTluszczowe() {
		return listaTluszcze;
	}
	public static List<Product> getListaWarzywaDuzaPorcja() {
		return listaWarzywaDuzaPorcja;
	}
	public static List<Product> getListaWarzywaSredniaPorcja() {
		return listaWarzywaSredniaPorcja;
	}
	public static List<Product> getListaWarzywaMalaPorcja() {
		return listaWarzywaMalaPorcja;
	}
	
	public static void loadProteinProducts() {
		
				try {				
					ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE 'Produkt bia%'");
					int i = 0;
					while (result.next()) {
					
					produktyBialkowe[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
							result.getDouble("Fats"),result.getDouble("Fiber"));
					listaBialko.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
							result.getDouble("Fats"),result.getDouble("Fiber")));
					i++;
					}
					result.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	
	public static void loadProteinProductsOther() {
		
		try {				
			ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE 'InneBialko'");
			int i = 0;
			while (result.next()) {
			
			produktyBialkoweInne[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber"));
			listaBialkoInne.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber")));
			i++;
			}
			result.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
	public static void loadFatsProducts() {
		
		try {				
			ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE 'Produkt t%'");
			int i = 0;
			while (result.next()) {
			
				produktyTluszczowe[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber"));
				listaTluszcze.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber")));
			i++;
			}
			result.close();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void loadVegetablesBigPortionProducts() {
		
		try {				
			ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE 'Warzywa du%'");
			int i = 0;
			while (result.next()) {
			
				produktyWarzywaDuzaPorcja[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber"));
				listaWarzywaDuzaPorcja.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
						result.getDouble("Fats"),result.getDouble("Fiber")));
			i++;
			}
			result.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loadVegetablesMediumPortionProducts() {
			
			try {				
				ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE '%rednia porcja'");
				int i = 0;
				while (result.next()) {
				
					produktyWarzywaSredniaPorcja[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
						result.getDouble("Fats"),result.getDouble("Fiber"));
					listaWarzywaSredniaPorcja.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
							result.getDouble("Fats"),result.getDouble("Fiber")));
				i++;
				}
				result.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	public static void loadVegetablesSmallPortionProducts() {
			
			try {				
				ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE 'Warzywa ma%'");
				int i = 0;
				while (result.next()) {
				
					produktyWarzywaMalaPorcja[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
						result.getDouble("Fats"),result.getDouble("Fiber"));
					listaWarzywaMalaPorcja.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
							result.getDouble("Fats"),result.getDouble("Fiber")));
				i++;
				}
				result.close();
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	public static void loadCarbohydratesProducts() {
		
		
		try {
			
			
			ResultSet result = QueryExecutor.executeSelect("SELECT * FROM dbo.Products WHERE Category LIKE 'Produkt w%'");
			int i = 0;
			while (result.next()) {
			
			produktyWeglowodanowe[i] = new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber"));
			listaWeglowodany.add(new Product(result.getString("Name"), result.getString("Category"), result.getDouble("Carbohydrates"), result.getDouble("Protein"),
					result.getDouble("Fats"),result.getDouble("Fiber")));
			i++;
							
			}
			result.close();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
