package ex03;

import connectionMySQL.MySQL;

public class MainApp_ex03 {

	public static void main(String[] args) {

		MySQL.openConnection();

		//MySQL.createDB("Los_Almacenes");

		/*MySQL.deleteTabla("Los_Almacenes", "cajas");
		MySQL.deleteTabla("Los_Almacenes", "almacenes");*/

		MySQL.createTable("Los_Almacenes", "almacenes", Insertions_ex03.taulaAlmacenes);
		MySQL.createTable("Los_Almacenes", "cajas", Insertions_ex03.taulaCajas);

		MySQL.insertData("Los_Almacenes", "almacenes", Insertions_ex03.insertionAlmacenes);
		MySQL.insertData("Los_Almacenes", "cajas", Insertions_ex03.insertionCajas);

		MySQL.getValues_ex03("Los_Almacenes", "almacenes");

		MySQL.deleteRecord_ex03("Los_Almacenes", "almacenes", 1);

		MySQL.getValues_ex03("Los_Almacenes", "almacenes");

		MySQL.closeConnection();

	}

}
