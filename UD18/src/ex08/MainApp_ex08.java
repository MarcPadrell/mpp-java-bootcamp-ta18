package ex08;

import connectionMySQL.MySQL;

public class MainApp_ex08 {

	public static void main(String[] args) {

		MySQL.openConnection();

		//MySQL.createDB("Grandes_Almacenes");

		
		 /*MySQL.deleteTabla("Grandes_Almacenes", "cajeros");
		 MySQL.deleteTabla("Grandes_Almacenes", "maquinas_registradoras");
		 MySQL.deleteTabla("Grandes_Almacenes", "productos");
		 MySQL.deleteTabla("Grandes_Almacenes", "venta");*/
		 

		MySQL.createTable("Grandes_Almacenes", "cajeros", Insertions_ex08.taulaCajeros);
		MySQL.createTable("Grandes_Almacenes", "maquinas_registradoras", Insertions_ex08.taulaMaquinasRegistradoras);
		MySQL.createTable("Grandes_Almacenes", "productos", Insertions_ex08.taulaProductos);
		MySQL.createTable("Grandes_Almacenes", "venta", Insertions_ex08.taulaVenta);

		MySQL.insertData("Grandes_Almacenes", "cajeros", Insertions_ex08.insertionCajeros);
		MySQL.insertData("Grandes_Almacenes", "maquinas_registradoras", Insertions_ex08.insertionMaquinasRegistradoras);
		MySQL.insertData("Grandes_Almacenes", "productos", Insertions_ex08.insertionProductos);
		MySQL.insertData("Grandes_Almacenes", "venta", Insertions_ex08.insertionVenta);

		MySQL.getValues_ex08("Grandes_Almacenes", "venta");

		MySQL.deleteRecord_ex08("Grandes_Almacenes", "venta", 1);

		MySQL.getValues_ex08("Grandes_Almacenes", "venta");

		MySQL.closeConnection();

	}

}
