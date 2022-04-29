package connectionMySQL;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQL {
	
	// Declaramos la variable de tipo conexion
		public static Connection conexion;

		// METODO QUE ABRE LA CONEXION CON SERVER MYSQL
		public static void openConnection() {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.78:3306?useTimezone=true&serverTimezone=UTC",
						"remote", "Reus_2022"); // credenciales temporales
				System.out.print("Server Connected");

			} catch (SQLException | ClassNotFoundException ex) {
				System.out.print("No se ha podido conectar con mi base de datos");
				System.out.println(ex.getMessage());

			}

		}

		// METODO QUE CIERRA LA CONEXION CON SERVER MYSQL
		public static void closeConnection() {
			try {
				conexion.close();
				System.out.print("Server Disconnected");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.print("Error cerrando conexion");

			}
		}

		// METODO QUE CREA LA BASE DE DATOS
		public static void createDB(String name) {
			try {
				String Query = "CREATE DATABASE " + name;
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("");
				System.out.println("DB creada con exito!");

				JOptionPane.showMessageDialog(null, "Se ha creado la DB " + name + " de forma exitosa.");
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error creando la DB.");
			}
		}

		// METODO QUE CREA TABLAS MYSQL
		public static void createTable(String db, String name, String query) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "CREATE TABLE " + name + " " + query;

				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error creando tabla.");

			}

		}

		// METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertData(String db, String table_name, String insercion) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "INSERT INTO " + table_name + " " + insercion;
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);

				System.out.println("Datos almacenados correctamente");
				;

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
			}

		}

		// METODO QUE OBTIENE VALORES MYSQL EX 02
		public static void getValues_ex02(String db, String table_name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "SELECT * FROM " + table_name;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);

				while (resultSet.next()) {
					System.out.println("");
					System.out.println("DNI: " + resultSet.getString("DNI") + " " + "Nombre: "
							+ resultSet.getString("nombre") + " " + "Apellidos:" + resultSet.getString("apellidos") + " "
							+ "Departamento: " + resultSet.getString("departamento"));
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error en la adquisicion de datos");
			}

		}

		// METODO QUE LIMPIA TABLAS MYSQL EX 02
		public static void deleteRecord_ex02(String db, String table_name, String DNI) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "DELETE FROM " + table_name + " WHERE DNI = \"" + DNI + "\"";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);

				System.out.println("Registros de tabla ELIMINADOS con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
			}
		}
		
		// METODO QUE OBTIENE VALORES MYSQL EX 03
		public static void getValues_ex03(String db, String table_name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "SELECT * FROM " + table_name;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);

				while (resultSet.next()) {
					System.out.println("");
					System.out.println("Codigo: " + resultSet.getString("codigo") + " " + "Lugar: "
							+ resultSet.getString("lugar") + " " + "Capacidad:" + resultSet.getString("capacidad"));
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error en la adquisicion de datos");
			}

		}

		// METODO QUE LIMPIA TABLAS MYSQL EX 03
		public static void deleteRecord_ex03(String db, String table_name, int codigo) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "DELETE FROM " + table_name + " WHERE codigo = \"" + codigo + "\"";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);

				System.out.println("Registros de tabla ELIMINADOS con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
			}
		}
		
		// METODO QUE OBTIENE VALORES MYSQL EX 08
		public static void getValues_ex08(String db, String table_name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "SELECT * FROM " + table_name;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);

				while (resultSet.next()) {
					System.out.println("");
					System.out.println("Cajero: " + resultSet.getString("cajero") + " " + "Maquina: "
							+ resultSet.getString("maquina") + " " + "Producto:" + resultSet.getString("producto"));
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error en la adquisicion de datos");
			}

		}

		// METODO QUE LIMPIA TABLAS MYSQL EX 08
		public static void deleteRecord_ex08(String db, String table_name, int cajero) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "DELETE FROM " + table_name + " WHERE cajero = \"" + cajero + "\"";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);

				System.out.println("Registros de tabla ELIMINADOS con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
			}
		}

		// METODO QUE ELIMINA TABLAS MYSQL
		public static void deleteTabla(String db, String table_name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "DROP TABLE " + table_name + ";";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);

				System.out.println("TABLA ELIMINADA con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error borrando la tabla");
			}
		}

}
