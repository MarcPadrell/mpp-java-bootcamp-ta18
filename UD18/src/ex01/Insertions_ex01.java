package ex01;

public class Insertions_ex01 {
	
	public static String tablaFabricantes = "(Codigo int AUTO_INCREMENT,"
			+ "Nombre varchar(100) DEFAULT NULL,"
			+ "PRIMARY KEY (Codigo));";
	
	public static String tablaArticulos = "(Codigo int NOT NULL AUTO_INCREMENT,"
			+ "Nombre varchar(100) DEFAULT NULL,"
			+ "Precio int DEFAULT NULL,"
			+ "Fabricante int NOT NULL,"
			+ "PRIMARY KEY (Codigo),"
			+ "KEY Fabricante (Fabricante),"
			+ "CONSTRAINT Articulos_ibfk_1 FOREIGN KEY (Fabricante) REFERENCES Fabricantes (Codigo) ON DELETE CASCADE ON UPDATE CASCADE);";
				
	public static String insercionArticulos = "(Nombre, Precio, Fabricante) values "
			+ "('PC', 50, '1'),"
			+ "('Lampara', 12, '4'),"
			+ "('Monitor', 115, '2'),"
			+ "('Calculadora', 25, '3'),"
			+ "('Mobil', 650, '5');";
	
	public static String insercionFabricantes = "(Nombre) values "
			+ "('acer'),"
			+ "('toshiba'),"
			+ "('LG'),"
			+ "('Apple'),"
			+ "('Casio');";

}
