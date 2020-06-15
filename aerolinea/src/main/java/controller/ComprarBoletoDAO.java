package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.example.aerolinea.ListarBoletosResponse;
import org.example.aerolinea.ListarVuelosResponse;

import database.Conexion;
import model.ComprarBoleto;

public class ComprarBoletoDAO {

	private int idBoleto;
	private String fecha;
	private String origen;
	private String destino;
	private String asiento;
	private String pago;
	
	private Conexion database;
	
	public ComprarBoletoDAO(String fecha, String origen, String destino, String asiento, String pago) {
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.pago = pago;
	}
	
	public ComprarBoletoDAO(int idBoleto, String fecha, String origen, String destino, String asiento, String pago) {
		this.idBoleto = idBoleto;
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.pago = pago;
	}
	
	public ComprarBoletoDAO(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	
	public ComprarBoletoDAO() {
	}
	
	public boolean registrarComprarBoleto() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO comprarboleto (fecha,origen,destino,asiento,pago) VALUES "
					+ "('"+this.fecha+"','"+this.origen+"','"+this.destino+"','"+this.asiento
					+"','"+this.pago+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public ComprarBoleto consultarBoleto(int id) {
		ComprarBoleto boleto = null;
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM comprarboleto WHERE idBoleto="+id);
			while(rs.next()) {
				boleto = new ComprarBoleto(rs.getString("fecha"), rs.getString("origen"), rs.getString("destino")
						, rs.getString("asiento"), rs.getString("pago"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boleto;
	}
	
	public boolean eliminarBoleto() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"DELETE FROM comprarboleto WHERE idBoleto = "+this.idBoleto);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean actualizarBoleto() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			String query = "UPDATE comprarboleto SET"
					+ " fecha = '"+this.fecha+"',"
					+ " origen = '"+this.origen+"',"
					+ " destino = '"+this.destino+"',"
					+ " asiento = '"+this.asiento+"',"
					+ " pago = '"+this.pago+"'"
					+ " WHERE idBoleto = "+this.idBoleto;
			this.database.connect().createStatement().execute(query);
			
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean verificarIdBoleto() {
		boolean existe = false;
		this.database = new Conexion();
			try {
				final String queryCheck = "SELECT * FROM comprarboleto WHERE idBoleto = "+this.idBoleto;
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
	
	public ArrayList<ListarBoletosResponse.Boleto> getListarBoletos(){
		ArrayList<ListarBoletosResponse.Boleto> boletos = new ArrayList<ListarBoletosResponse.Boleto>();
		this.database = new Conexion();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM comprarboleto");
			while(rs.next()) {
				ListarBoletosResponse.Boleto b = new ListarBoletosResponse.Boleto(rs.getInt("idBoleto"), rs.getString("fecha"), rs.getString("origen"), rs.getString("destino"), rs.getString("asiento"), rs.getString("pago"));
				boletos.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boletos;
	}
}
