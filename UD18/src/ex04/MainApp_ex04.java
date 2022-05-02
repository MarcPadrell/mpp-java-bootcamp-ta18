package ex04;

import connectionMySQL.MySQL;

public class MainApp_ex04 {

	public static void main(String[] args) {

		MySQL.openConnection();

		MySQL.createDB("Peliculas_y_Salas");

		// MySQL.deleteTabla("Peliculas_y_Salas", "Peliculas");
		// MySQL.deleteTabla("Peliculas_y_Salas", "Salas");

		MySQL.createTable("Peliculas_y_Salas", "Peliculas", Insertions_ex04.tablaPeliculas);
		MySQL.createTable("Peliculas_y_Salas", "Salas", Insertions_ex04.tablaSalas);

		MySQL.insertData("Peliculas_y_Salas", "Peliculas", Insertions_ex04.insercionPeliculas);
		MySQL.insertData("Peliculas_y_Salas", "Salas", Insertions_ex04.insercionSalas);

		MySQL.getValues_ex04("Peliculas_y_Salas", "Peliculas");

		MySQL.deleteRecord_ex04("Peliculas_y_Salas", "Peliculas", 2);

		MySQL.getValues_ex04("Peliculas_y_Salas", "Peliculas");

		MySQL.closeConnection();

	}

}
