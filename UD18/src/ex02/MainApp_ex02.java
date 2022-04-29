package ex02;

import connectionMySQL.MySQL;

public class MainApp_ex02 {

	public static void main(String[] args) {
		
		MySQL.openConnection();
		
		MySQL.createDB("Los_Empleados");
		
		//MySQL.deleteTabla("Los_Empleados", "Empleados");
		//MySQL.deleteTabla("Los_Empleados", "Departamentos");
		
		MySQL.createTable("Los_Empleados", "Departamentos", Insertions_ex02.taulaDeparamentos);
		MySQL.createTable("Los_Empleados", "Empleados", Insertions_ex02.taulaEmpleados);
		
		MySQL.insertData("Los_Empleados", "Departamentos", Insertions_ex02.insertionDepartamentos);
		MySQL.insertData("Los_Empleados", "Empleados", Insertions_ex02.insertionEmpleados);
		
		MySQL.getValues_ex02("Los_Empleados", "Empleados");

		MySQL.deleteRecord_ex02("Los_Empleados", "Empleados", "12345678");
		
		MySQL.getValues_ex02("Los_Empleados", "Empleados");
		
		MySQL.closeConnection();
		

	}

}
