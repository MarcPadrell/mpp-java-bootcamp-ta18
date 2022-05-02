package ex04;

public class Insertions_ex04 {
	
	public static String tablaPeliculas = "(Codigo int NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "CalificacionEdad int DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo))";

	public static String tablaSalas = "(Codigo int NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "Pelicula int unsigned DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo), "
			  + "KEY Pelicula (Pelicula), "
			  + "CONSTRAINT Salas_ibfk_1 FOREIGN KEY (Pelicula) REFERENCES Peliculas (Codigo) "			  
			  + "ON DELETE CASCADE);";
				
	public static String insercionPeliculas = "(Nombre, CalificacionEdad) values "
			+ "('Corazones de acero', 20),"
			+ "('Dumbo', 2),"
			+ "('Toy & Story', 6),"
			+ "('Iron-man', 10),"
			+ "('Marvel', 5);";
	
	public static String insercionSalas = "(Nombre, Pelicula) values "
			+ "('Sala Primera', 1),"
			+ "('Sala Segunda', 2),"
			+ "('Sala Ultima', 4),"
			+ "('Sala Intermedia', 5),"
			+ "('Sala Penultima', 3);";

}
