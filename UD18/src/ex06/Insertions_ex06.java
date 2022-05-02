package ex06;

public class Insertions_ex06 {
	
	public static String tablaPiezas = "(\r\n" 
			+ "  Codigo int AUTO_INCREMENT,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" 
			+ "  PRIMARY KEY (Codigo)\r\n" + ")";

	public static String tablaProveedores = "(\r\n" 
			+ "  Id char(4),\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" 
			+ "  PRIMARY KEY (Id)\r\n" + ")";

	public static String tablaSuministra = "(\r\n" 
			+ "  CodigoPieza int AUTO_INCREMENT,\r\n"
			+ "  IdProveedor char(4),\r\n" 
			+ "  Precio int unsigned DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (CodigoPieza,IdProveedor),\r\n" 
			+ "  KEY IdProveedor (IdProveedor),\r\n"
			+ "  CONSTRAINT Suministra_ibfk_1 FOREIGN KEY (CodigoPieza) REFERENCES Piezas (Codigo) ON DELETE CASCADE,\r\n"
			+ "  CONSTRAINT Suministra_ibfk_2 FOREIGN KEY (IdProveedor) REFERENCES Proveedores (Id) ON DELETE CASCADE\r\n" + ")";

	public static String insercionPiezas = "(Nombre) values "
			+ "('Mesa'), ('Silla'), ('Lampara'), ('Puerta'), ('Calculadora');";

	public static String insercionProveedores = "(Id, Nombre) values " 
			+ "('1', 'IKEA')," + "('2', 'Casio'),"
			+ "('3', 'Sony')," + "('4', 'Roca')," + "('5', 'Acer');";

	public static String insercionSuministra = "(CodigoPieza, IdProveedor, Precio) values " 
			+ "(1, '2', 550),"
			+ "(2, '3', 10)," 
			+ "(3, '1', 30)," 
			+ "(4, '5', 45)," 
			+ "(5, '4', 35);";

}
