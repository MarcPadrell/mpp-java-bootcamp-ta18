package ex07;

public class Insertions_ex07 {
	
	public static String tablaAsignado_A = "(Cientifico varchar(8),"
			+ "Proyecto char(4) NOT NULL,"
			+ "PRIMARY KEY (Cientifico,Proyecto),"
			+ "KEY Proyecto (Proyecto),"
			+ "CONSTRAINT Asignado_A_ibfk_1 FOREIGN KEY (Cientifico) REFERENCES Cientificos (DNI) ON DELETE CASCADE,"
			+ "CONSTRAINT Asignado_A_ibfk_2 FOREIGN KEY (Proyecto) REFERENCES Proyecto (Id) ON DELETE CASCADE);";

	public static String tablaCientificos = "(DNI varchar(8),"
			+ "NomApels varchar(255) DEFAULT NULL,"
			+ "PRIMARY KEY (DNI));";
	
	public static String tablaProyecto = "(Id char(4),"
			+ "Nombre varchar(255) DEFAULT NULL,"
			+ "Horas int DEFAULT NULL,"
			+ "PRIMARY KEY (Id));";
				
	public static String insercionCientificos = "(DNI, NomApels) values "
			+ "('45523698', 'Borja'),"
			+ "('67753256', 'Arnau'),"
			+ "('65436732', 'Sergi'),"
			+ "('88665342', 'Dani'),"
			+ "('55353467', 'Alvar');";
	
	public static String insercionProyecto = "(Id, Nombre, Horas) values "
			+ "('1', 'RF','4500'),"
			+ "('2', 'NFC','340'),"
			+ "('3', 'Implant','112'),"
			+ "('4', 'Monitoring','9980'),"
			+ "('5', 'Research','5560');";
	
	public static String insercionAsignado_A = "(Cientifico, Proyecto) values "
			+ "('45523698', '2'),"
			+ "('67753256', '1'),"
			+ "('65436732', '4'),"
			+ "('88665342', '3');";

}
