package ex07;

import connectionMySQL.MySQL;

public class MainApp_ex07 {

	public static void main(String[] args) {
		
		MySQL.openConnection();

		MySQL.createDB("Los_Cientificos");

		// MySQL.deleteTabla("Los_Cientificos", "Cientificos");
		// MySQL.deleteTabla("Los_Cientificos", "Proyecto");
		// MySQL.deleteTabla("Los_Cientificos", "Asignado_A");

		MySQL.createTable("Los_Cientificos", "Cientificos", Insertions_ex07.tablaCientificos);
		MySQL.createTable("Los_Cientificos", "Proyecto", Insertions_ex07.tablaProyecto);
		MySQL.createTable("Los_Cientificos", "Asignado_A", Insertions_ex07.tablaAsignado_A);

		MySQL.insertData("Los_Cientificos", "Cientificos", Insertions_ex07.insercionCientificos);
		MySQL.insertData("Los_Cientificos", "Proyecto", Insertions_ex07.insercionProyecto);
		MySQL.insertData("Los_Cientificos", "Asignado_A", Insertions_ex07.insercionAsignado_A);

		MySQL.getValues_ex07("Los_Cientificos", "Asignado_A");

		MySQL.deleteRecord_ex07("Los_Cientificos", "Asignado_A", 3);

		MySQL.getValues_ex07("Los_Cientificos", "Asignado_A");

		MySQL.closeConnection();

	}

}
