package ex02;

public class Insertions_ex02 {
	
	public static String taulaEmpleados = "(DNI varchar(8) NOT NULL,"
			+ "  nombre varchar(100) DEFAULT NULL,"
			+ "  apellidos varchar(255) DEFAULT NULL,"
			+ "  Departamento int DEFAULT NULL,"
			+ "  PRIMARY KEY (DNI),"
			+ "  KEY Departamento (Departamento),"
			+ "  CONSTRAINT empleados_ibfk_1 FOREIGN KEY (Departamento) REFERENCES Departamentos (codigo))";
	
	public static String taulaDeparamentos = "(codigo int NOT NULL,"
			+ "  nombre varchar(100) DEFAULT NULL,"
			+ "  Presupuesto int DEFAULT NULL,"
			+ "  PRIMARY KEY (codigo)"
			+ ");";
	
	public static String insertionEmpleados = "(DNI, nombre, apellidos, Departamento) values"
			+"('12345678', 'Borja', 'Montseny', '2'),"
			+"('58896343', 'Marc', 'Nebot', '1'),"
			+"('74859878', 'Jose', 'Marin', '3'),"
			+"('12453268', 'Ester', 'Sentis', '4');";
	
	public static String insertionDepartamentos = "(codigo, nombre, Presupuesto) values"
			+"('1', 'IT', '20000'),"
			+"('2', 'RRHH', '50000'),"
			+"('3', 'Quality', '1000'),"
			+"('4', 'I+D', '15000');";

}
