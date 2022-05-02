package ex09;

public class Insertions_ex09 {

	public static String tablaEquipos = "(\r\n" + "  NumSerie char(4),\r\n" + "  Nombre varchar(100) DEFAULT NULL,\r\n"
			+ "  Facultad int DEFAULT NULL,\r\n" + "  PRIMARY KEY (NumSerie),\r\n" + "  KEY Facultad (Facultad),\r\n"
			+ "  CONSTRAINT Equipos_ibfk_1 FOREIGN KEY (Facultad) REFERENCES Facultad (Codigo) ON DELETE CASCADE\r\n"
			+ ")";

	public static String tablaFacultad = "(\r\n" + "  Codigo int AUTO_INCREMENT,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" + "  PRIMARY KEY (Codigo)\r\n" + ")";

	public static String tablaInvestigadores = "(\r\n" + "  DNI varchar(8),\r\n"
			+ "  NomApels varchar(255) DEFAULT NULL,\r\n" + "  Facultad int DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (DNI),\r\n" + "  KEY Facultad (Facultad),\r\n"
			+ "  CONSTRAINT Investigadores_ibfk_1 FOREIGN KEY (Facultad) REFERENCES Facultad (Codigo) ON DELETE CASCADE\r\n"
			+ ")";

	public static String tablaReserva = "(\r\n" + "  DNI varchar(8),\r\n" + "  NumSerie char(4),\r\n"
			+ "  Comiendo varchar(20) DEFAULT NULL,\r\n" + "  Fin varchar(20) DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (DNI,NumSerie),\r\n" + "  KEY NumSerie (NumSerie),\r\n"
			+ "  CONSTRAINT Reserva_ibfk_1 FOREIGN KEY (DNI) REFERENCES Investigadores (DNI) ON DELETE CASCADE,\r\n"
			+ "  CONSTRAINT Reserva_ibfk_2 FOREIGN KEY (NumSerie) REFERENCES Equipos (NumSerie) ON DELETE CASCADE\r\n"
			+ ")";

	public static String insercionEquipos = "(NumSerie, Nombre, Facultad) values "
			+ "('1', 'IT', 1), ('2', 'Voltage', 2),('3', 'Racing', 3),('4', 'Info', 4),('5', 'Hacking', 5);";

	public static String insercionFacultad = "(Nombre) values "
			+ "('Quimica'), ('Psicologia'), ('Ingenieria'), ('Enfermeria'), ('Derecho');";

	public static String insercionInvestigadores = "(DNI, NomApels, Facultad) values "
			+ "('45523356', 'Arnau gomez', 1)," + "('34543543', 'Ester Sentis', 2)," + "('65574432', 'Raul Balles', 3),"
			+ "('54432467', 'Diego Mauro', 4)," + "('67897654', 'Ramon Villa', 5);";

	public static String insercionReserva = "(DNI, NumSerie) values " + "('45523356', '1')," + "('34543543', '2'),"
			+ "('65574432', '3')," + "('54432467', '4')," + "('67897654', '5');";

}
