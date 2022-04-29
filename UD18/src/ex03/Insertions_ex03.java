package ex03;

public class Insertions_ex03 {
	
	public static String taulaAlmacenes = "(codigo int NOT NULL AUTO_INCREMENT,"
			+ "  lugar varchar(100) DEFAULT NULL,"
			+ "  capacidad int DEFAULT NULL,"
			+ "  PRIMARY KEY (codigo))";
	
	public static String taulaCajas = "(NumReferencia char(5) NOT NULL,"
			+ "  contenido varchar(100) DEFAULT NULL,"
			+ "  valor int DEFAULT NULL,"
			+ "  almacen int NOT NULL,"
			+ "  PRIMARY KEY (NumReferencia),"
			+ "  KEY almacen (almacen),"
			+ "  CONSTRAINT cajas_ibfk_1 FOREIGN KEY (almacen) REFERENCES almacenes (codigo) ON DELETE CASCADE ON UPDATE CASCADE);";
	
	public static String insertionAlmacenes = "(lugar, capacidad) values"
			+"('Barcelona', '30'),"
			+"('Tarragona', '20'),"
			+"('Reus', '63'),"
			+"('Bilbao', '35');";
	
	public static String insertionCajas = "(NumReferencia, contenido, valor, almacen) values"
			+"('54628', 'Papeles', '55', '1'),"
			+"('21635', 'Tijeras', '25', '2'),"
			+"('89658', 'Lamparas', '86', '3'),"
			+"('75362', 'PC', '99', '1');";

}
