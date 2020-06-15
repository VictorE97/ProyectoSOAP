package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.example.aerolinea.ListarPasajerosResponse;

import database.Conexion;
import model.Pasajero;

public class PasajeroDAO {
	private int idPasajero;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String correo;
	
	private Conexion database;
	private ListarPasajerosResponse.Pasajero pasajero;
	
	public PasajeroDAO(String nombre,String apellido, String direccion, String telefono, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public PasajeroDAO(int idPasajero, String nombre, String apellido, String direccion, String telefono, String correo) {
		this.idPasajero = idPasajero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public PasajeroDAO(int idPasajero) {
		this.idPasajero = idPasajero;
	}
	
	public PasajeroDAO() {
		
	}
	
	public boolean registrarPasajero() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO pasajeros (nombre,apellido,direccion,telefono,correo) VALUES "
					+ "('"+this.nombre+"','"+this.apellido+"','"+this.direccion+"','"+this.telefono
					+"','"+this.correo+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean actualizarPasajero() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			String query = "UPDATE pasajeros SET"
					+ " nombre = '"+this.nombre+"',"
					+ " apellido = '"+this.apellido+"',"
					+ " direccion = '"+this.direccion+"',"
					+ " telefono = '"+this.telefono+"',"
					+ " correo = '"+this.correo+"'"
					+ " WHERE idPasajero = "+this.idPasajero;
			this.database.connect().createStatement().execute(query);
			
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean eliminarPasajero() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"DELETE FROM pasajeros WHERE idPasajero = "+this.idPasajero);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean verificarIdPasajero() {
		boolean existe = false;
		this.database = new Conexion();
			try {
				final String queryCheck = "SELECT * FROM pasajeros WHERE idPasajero = "+this.idPasajero;
				final PreparedStatement ps = this.database.connect().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				    final int count = resultSet.getInt(1);
				}
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
	
	public Pasajero consultarPasajero(int id) {
		Pasajero pasajero = null;
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM pasajeros WHERE idPasajero="+id);
			while(rs.next()) {
				pasajero = new Pasajero(rs.getString("nombre"), rs.getString("apellido"), rs.getString("direccion")
						, rs.getString("telefono"), rs.getString("correo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pasajero;
	}
	
	public ArrayList<ListarPasajerosResponse.Pasajero> getListarPasajeros(){
		ArrayList<ListarPasajerosResponse.Pasajero> pasajeros = new ArrayList<ListarPasajerosResponse.Pasajero>();
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM pasajeros");
			while(rs.next()) {
				ListarPasajerosResponse.Pasajero p = new ListarPasajerosResponse.Pasajero(rs.getInt("idPasajero"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("correo"));
				pasajeros.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pasajeros;
	}
}
