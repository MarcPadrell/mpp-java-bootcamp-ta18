package ex01;

import connectionMySQL.MySQL;

public class MainApp_ex01 {

	public static void main(String[] args) {

		MySQL.openConnection();

		MySQL.createDB("La_Tienda_Informatica");

		// MySQL.deleteTabla("La_Tienda_Informatica", "Fabricantes");
		// MySQL.deleteTabla("La_Tienda_Informatica", "Articulos");

		MySQL.createTable("La_Tienda_Informatica", "Fabricantes", Insertions_ex01.tablaFabricantes);
		MySQL.createTable("La_Tienda_Informatica", "Articulos", Insertions_ex01.tablaArticulos);

		MySQL.insertData("La_Tienda_Informatica", "Fabricantes", Insertions_ex01.insercionFabricantes);
		MySQL.insertData("La_Tienda_Informatica", "Articulos", Insertions_ex01.insercionArticulos);

		MySQL.getValues_ex01("La_Tienda_Informatica", "Articulos");

		MySQL.deleteRecord_ex01("La_Tienda_Informatica", "Articulos", 2);

		MySQL.getValues_ex01("La_Tienda_Informatica", "Articulos");

		MySQL.closeConnection();

	}

}
