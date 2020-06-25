package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.example.aerolinea.ListarPasajerosResponse;
import org.example.aerolinea.ListarVuelosResponse;

import database.Conexion;
import model.ComprarBoleto;
import model.Vuelo;

public class VueloDAO {
	private int idVuelo;
	private String avion;
	private String destino;
	private String fecha;
	private String horaSalida;
	private String horaLlegada;
	
	private Conexion database;
	
	public VueloDAO(String avion, String destino, String fecha, String horaSalida, String horaLlegada) {
		this.avion = avion;
		this.destino = destino;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}

	public VueloDAO(int idVuelo, String avion, String destino, String fecha, String horaSalida, String horaLlegada) {
		this.idVuelo = idVuelo;
		this.avion = avion;
		this.destino = destino;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}
	
	public VueloDAO(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
	public VueloDAO() {
	}
	
	public boolean registrarVuelo() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO vuelo (avion,destino,fecha,horaSalida,horaLlegada) VALUES "
					+ "('"+this.avion+"','"+this.destino+"','"+this.fecha+"','"+this.horaSalida
					+"','"+this.horaLlegada+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public Vuelo consultarVuelo(int id) {
		Vuelo vuelo = null;
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM vuelo WHERE idVuelo="+id);
			while(rs.next()) {
				vuelo = new Vuelo(rs.getString("avion"), rs.getString("destino"), rs.getString("fecha")
						, rs.getString("horaSalida"), rs.getString("horaLlegada"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vuelo;
	}
	
	public boolean eliminarVuelo() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM vuelo WHERE idVuelo = "+this.idVuelo);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean actualizarVuelo() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			String query = "UPDATE vuelo SET"
					+ " avion = '"+this.avion+"',"
					+ " destino = '"+this.destino+"',"
					+ " fecha = '"+this.fecha+"',"
					+ " horaSalida = '"+this.horaSalida+"',"
					+ " horaLlegada = '"+this.horaLlegada+"'"
					+ " WHERE idVuelo = "+this.idVuelo;
			this.database.connection().createStatement().execute(query);
			
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean verificarIdVuelo() {
		boolean existe = false;
		this.database = new Conexion();
			try {
				final String queryCheck = "SELECT * FROM vuelo WHERE idVuelo = "+this.idVuelo;
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
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
	
	public ArrayList<ListarVuelosResponse.Vuelo> getListarVuelos(){
		ArrayList<ListarVuelosResponse.Vuelo> vuelos = new ArrayList<ListarVuelosResponse.Vuelo>();
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM vuelo");
			while(rs.next()) {
				ListarVuelosResponse.Vuelo v = new ListarVuelosResponse.Vuelo(rs.getInt("idVuelo"), rs.getString("avion"), rs.getString("destino"), rs.getString("fecha"), rs.getString("horaSalida"), rs.getString("horaLlegada"));
				vuelos.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vuelos;
	}
	
}
