package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
	
	Connection conexion = null;

	String database =  "aerolinea";
	String hostname = "localhost";
	String port = "3306";
	String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useTimezone=true&serverTimezone=UTC";
	String username = "root";
	String password = "123456";
	
	public Connection connect() {
		
		try {
			this.conexion = DriverManager.getConnection(this.url,this.username,this.password);
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer conexion!:\n" + e.getMessage());
		}

		if (conexion != null) {
			System.out.println("Conexion exitosa");
		} else {
			System.out.println("Conexion no valida");
		}
		
		return this.conexion;
		
	}

}
    	
		

