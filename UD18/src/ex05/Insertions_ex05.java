package ex05;

public class Insertions_ex05 {
	
	public static String tablaDespachos = "(Numero int,"
			+ "Capacidad int DEFAULT NULL,"
			+ "PRIMARY KEY (Numero));";

	public static String tablaDirectores = "(DNI varchar(8),"
			+ "NomApels varchar(255) DEFAULT NULL,"
			+ "DNIJefe varchar(8) DEFAULT NULL,"
			+ "Despacho int DEFAULT NULL,"
			+ "PRIMARY KEY (DNI),"
			+ "KEY DNIJefe (DNIJefe),"
			+ "KEY Despacho (Despacho),"
			+ "CONSTRAINT Directores_ibfk_1 FOREIGN KEY (DNIJefe) REFERENCES Directores (DNI) ON DELETE CASCADE,"
			+ "CONSTRAINT Directores_ibfk_2 FOREIGN KEY (Despacho) REFERENCES Despachos (Numero) ON DELETE CASCADE);";
				
	public static String insercionDespachos = "(Numero, Capacidad) values "
			+ "(1, 300),"
			+ "(2, 50),"
			+ "(3, 68),"
			+ "(4, 74),"
			+ "(5, 33);";
	
	public static String insercionDirectores = "(DNI, NomApels, DNIJefe, Despacho) values "
			+ "('45562589', 'Ester Sentis', 35536258, 4),"
			+ "('98658952', 'Arnau Gomes', '25587941', 5),"
			+ "('35789512', 'Pol Sentis', '35536258', 3),"
			+ "('78954612', 'Fe Iguacel', '41258796', 2),"
			+ "('23014586', 'Pol Laporta', '35536258', 1);";

}
