package ex05;

import connectionMySQL.MySQL;

public class MainApp_ex05 {

	public static void main(String[] args) {

		MySQL.openConnection();

		MySQL.createDB("Los_Directores");

		// MySQL.deleteTabla("Los_Directores", "Despachos");
		// MySQL.deleteTabla("Los_Directores", "Directores");

		MySQL.createTable("Los_Directores", "Despachos", Insertions_ex05.tablaDespachos);
		MySQL.createTable("Los_Directores", "Directores", Insertions_ex05.tablaDirectores);

		MySQL.insertData("Los_Directores", "Despachos", Insertions_ex05.insercionDespachos);
		MySQL.insertData("Los_Directores", "Directores", Insertions_ex05.insercionDirectores);

		MySQL.getValues_ex05("Los_Directores", "Directores");

		MySQL.deleteRecord_ex05("Los_Directores", "Directores", 4);

		MySQL.getValues_ex05("Los_Directores", "Directores");

		MySQL.closeConnection();

	}

}
