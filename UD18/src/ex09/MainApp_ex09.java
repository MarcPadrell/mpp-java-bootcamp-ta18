package ex09;

import connectionMySQL.MySQL;
import ex06.Insertions_ex06;

public class MainApp_ex09 {

	public static void main(String[] args) {

		MySQL.openConnection();

		MySQL.createDB("Los_Investigadores");

		// MySQL.deleteTabla("Los_Investigadores", "Facultad");
		// MySQL.deleteTabla("Los_Investigadores", "Equipos");
		// MySQL.deleteTabla("Los_Investigadores", "Investigadores");
		// MySQL.deleteTabla("Los_Investigadores", "Reserva");

		MySQL.createTable("Los_Investigadores", "Facultad", Insertions_ex09.tablaFacultad);
		MySQL.createTable("Los_Investigadores", "Equipos", Insertions_ex09.tablaEquipos);
		MySQL.createTable("Los_Investigadores", "Investigadores", Insertions_ex09.tablaInvestigadores);
		MySQL.createTable("Los_Investigadores", "Reserva", Insertions_ex09.tablaReserva);

		MySQL.insertData("Los_Investigadores", "Facultad", Insertions_ex09.insercionFacultad);
		MySQL.insertData("Los_Investigadores", "Equipos", Insertions_ex09.insercionEquipos);
		MySQL.insertData("Los_Investigadores", "Investigadores", Insertions_ex09.insercionInvestigadores);
		MySQL.insertData("Los_Investigadores", "Reserva", Insertions_ex09.insercionReserva);

		MySQL.getValues_ex09("Los_Investigadores", "Investigadores");

		MySQL.deleteRecord_ex09("Los_Investigadores", "Investigadores", "34543543");

		MySQL.getValues_ex09("Los_Investigadores", "Investigadores");

		MySQL.closeConnection();

	}

}
