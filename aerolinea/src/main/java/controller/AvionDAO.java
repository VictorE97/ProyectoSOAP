package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.example.aerolinea.ListarAvionesResponse;
import org.example.aerolinea.ListarBoletosResponse;

import database.Conexion;
import model.Avion;
import model.Pasajero;

public class AvionDAO {
	private int idAvion;
	private String modelo;
	private int numPasajeros;
	private String piloto;
	private String aeromosas;
	private String destino;
	
	private Conexion database;
	
	public AvionDAO(String modelo, int numPasajeros, String piloto, String aeromosas, String destino) {
		this.modelo = modelo;
		this.numPasajeros = numPasajeros;
		this.piloto = piloto;
		this.aeromosas = aeromosas;
		this.destino = destino;
	}
	
	public AvionDAO(int idAvion, String modelo, int numPasajeros, String piloto, String aeromosas, String destino) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.numPasajeros = numPasajeros;
		this.piloto = piloto;
		this.aeromosas = aeromosas;
		this.destino = destino;
	}
	
	public AvionDAO(int idAvion) {
		this.idAvion = idAvion;
	}
	
	public AvionDAO() {
		
	}
	
	public boolean registrarAvion() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO aviones (modelo,numPasajeros,piloto,aeromosas,destino) VALUES "
					+ "('"+this.modelo+"','"+this.numPasajeros+"','"+this.piloto+"','"+this.aeromosas
					+"','"+this.destino+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public Avion consultarAvion(int id) {
		Avion avion = null;
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM aviones WHERE idAvion="+id);
			while(rs.next()) {
				avion = new Avion(rs.getString("modelo"), rs.getInt("numPasajeros"), rs.getString("piloto")
						, rs.getString("aeromosas"), rs.getString("destino"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avion;
	}
	
	public boolean actualizarAvion() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			String query = "UPDATE aviones SET"
					+ " modelo = '"+this.modelo+"',"
					+ " numPasajeros = '"+this.numPasajeros+"',"
					+ " piloto = '"+this.piloto+"',"
					+ " aeromosas = '"+this.aeromosas+"',"
					+ " destino = '"+this.destino+"'"
					+ " WHERE idAvion = "+this.idAvion;
			this.database.connect().createStatement().execute(query);
			
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean eliminarAvion() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"DELETE FROM aviones WHERE idAvion = "+this.idAvion);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean verificarIdAvion() {
		boolean existe = false;
		this.database = new Conexion();
			try {
				final String queryCheck = "SELECT * FROM aviones WHERE idAvion = "+this.idAvion;
				final PreparedStatement ps = this.database.connect().prepareStatement(queryCheck);
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
	
	public ArrayList<ListarAvionesResponse.Avion> getListarAviones(){
		ArrayList<ListarAvionesResponse.Avion> aviones = new ArrayList<ListarAvionesResponse.Avion>();
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM aviones");
			while(rs.next()) {
				ListarAvionesResponse.Avion a = new ListarAvionesResponse.Avion(rs.getInt("idAvion"), rs.getString("modelo"), rs.getInt("numPasajeros"), rs.getString("piloto"), rs.getString("aeromosas"), rs.getString("destino"));
				aviones.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aviones;
	}
	
}
