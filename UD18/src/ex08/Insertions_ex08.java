package ex08;

public class Insertions_ex08 {
	
	public static String taulaCajeros = "(codigo int NOT NULL AUTO_INCREMENT,"
			+ "  nomApels varchar(255) DEFAULT NULL,"
			+ "  PRIMARY KEY (codigo))";
	
	public static String taulaMaquinasRegistradoras = "(codigo int NOT NULL AUTO_INCREMENT,"
			+ "  piso int DEFAULT NULL,"
			+ "  PRIMARY KEY (`codigo`));";
	
	public static String taulaProductos = "(codigo int NOT NULL AUTO_INCREMENT,"
			+ "  nombre varchar(100) DEFAULT NULL,"
			+ "  precio int DEFAULT NULL,"
			+ "  PRIMARY KEY (`codigo`))";
	
	public static String taulaVenta = "(cajero int NOT NULL,"
			+ "  maquina int NOT NULL,"
			+ "  producto int NOT NULL,"
			+ "  PRIMARY KEY (cajero,maquina,producto),"
			+ "  KEY maquina (maquina),"
			+ "  KEY producto (producto),"
			+ "  CONSTRAINT venta_ibfk_1 FOREIGN KEY (cajero) REFERENCES cajeros (codigo) ON DELETE CASCADE ON UPDATE CASCADE,"
			+ "  CONSTRAINT venta_ibfk_2 FOREIGN KEY (maquina) REFERENCES maquinas_registradoras (codigo) ON DELETE CASCADE ON UPDATE CASCADE,"
			+ "  CONSTRAINT venta_ibfk_3 FOREIGN KEY (producto) REFERENCES productos (codigo) ON DELETE CASCADE ON UPDATE CASCADE);";
	
	public static String insertionCajeros = "(nomApels) values"
			+"('Juan'),('Pol Aruiz'),('Luis Bayona'),('Ester Sentis'),('Pala Ertia'),('David Riber'),('Sicilio Polo'),('Carla Moreno'),('Enric Ruiz'),('Tito Juan'),('Montse Feina');";
	
	public static String insertionMaquinasRegistradoras = "(piso) values"
			+"(2),(1),(4),(5),(7),(2),(5),(6),(4),(9),(3);";
	
	public static String insertionProductos = "(nombre, precio) values"
			+"('Mesa',56),('Silla',33),('Espejo',40),('Lampara',80),('Rotulador',10),('Tejanos',36),('Calculadora',50),('Tenedor',67),('Vaso',2),('Platos',15),('Papelera',30);";
	
	public static String insertionVenta = "(cajero, maquina, producto) values"
			+"(2,1,5),(6,2,9),(1,4,5),(1,5,9),(3,5,1),(2,6,9),(7,6,8),(1,7,3),(3,8,9),(4,8,4),(9,8,9);";
	
	

}
