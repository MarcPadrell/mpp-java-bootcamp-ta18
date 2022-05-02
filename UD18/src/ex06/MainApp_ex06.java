package ex06;

import connectionMySQL.MySQL;
import ex05.Insertions_ex05;

public class MainApp_ex06 {

	public static void main(String[] args) {
		
		MySQL.openConnection();

		MySQL.createDB("Piezas_Y_Proveedores");

		// MySQL.deleteTabla("Piezas_Y_Proveedores", "Piezas");
		// MySQL.deleteTabla("Piezas_Y_Proveedores", "Proveedores");
		// MySQL.deleteTabla("Piezas_Y_Proveedores", "Suministra");

		MySQL.createTable("Piezas_Y_Proveedores", "Piezas", Insertions_ex06.tablaPiezas);
		MySQL.createTable("Piezas_Y_Proveedores", "Proveedores", Insertions_ex06.tablaProveedores);
		MySQL.createTable("Piezas_Y_Proveedores", "Suministra", Insertions_ex06.tablaSuministra);

		MySQL.insertData("Piezas_Y_Proveedores", "Piezas", Insertions_ex06.insercionPiezas);
		MySQL.insertData("Piezas_Y_Proveedores", "Proveedores", Insertions_ex06.insercionProveedores);
		MySQL.insertData("Piezas_Y_Proveedores", "Suministra", Insertions_ex06.insercionSuministra);


		MySQL.getValues_ex06("Piezas_Y_Proveedores", "Piezas");

		MySQL.deleteRecord_ex06("Piezas_Y_Proveedores", "Piezas", 3);

		MySQL.getValues_ex06("Piezas_Y_Proveedores", "Piezas");

		MySQL.closeConnection();

	}

}
