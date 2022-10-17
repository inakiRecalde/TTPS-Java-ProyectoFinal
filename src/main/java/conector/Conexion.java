package conector;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3307/bd-ttps-java","root","41925429");
			System.out.println("conexion OK");
			
		}catch(ClassNotFoundException e) {
			System.out.println("error al carcar el controlador");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("error de conexion");
			e.printStackTrace();
		}
	}
}
